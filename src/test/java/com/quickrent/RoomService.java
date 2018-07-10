package quickRent.variableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import quickRent.variable.Room;
import quickRent.variable.User;
import quickRent.variableController.RoomController;
import quickRent.variableController.UserController;
import quickRent.variableRepository.RoomRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    //管理员审核房屋
    @Transactional
    @PutMapping(value = "/rooms/{id}")
    public String  roomCheck(@PathVariable("id") Integer id,
                           @RequestParam("administrator")User administrator)
    {
        Room room = new Room();

        if (administrator.getPower() == 1) {
            room.setChecked(1);
            room.setId(id);
            roomRepository.save(room);
            return "verification success";
        }
        else
            return "warning, your authoriztion is not enough";
    }

    //待测试
    //根据用户获取待审核的房屋
    ///checked为0
    @Transactional
    public List<Room> uncheckedRoom(Integer id,String password)
    {
        List<Room> tempList = new ArrayList<Room>();
        UserController userController = new UserController();
        RoomController roomController = new RoomController();
        User user = userController.userFindOne(id);
        if(user.getPassword()==password)
        {
            List<Room> listFromUser = roomController.roomListByRentUser(id);
            List<Room> listFromChecked = roomController.roomListByChecked(0);
            for (Room room:listFromUser) {
                if (listFromChecked.contains(room))
                    tempList.add(room);
            }
        }
            return tempList;
    }

}
