package quickRent.variableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import quickRent.variable.Room;
import quickRent.variable.User;
import quickRent.variableRepository.RoomRepository;

import javax.transaction.Transactional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    //管理员审核房屋
    @Transactional
    @PutMapping(value = "/rooms/{id}")
    public String  roomUpdate(@PathVariable("id") Integer id,
                           @RequestParam("checked") Integer checked,
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

}
