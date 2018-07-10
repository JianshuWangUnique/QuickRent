package quickRent.variableController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quickRent.variable.User;
import quickRent.variableRepository.RoomRepository;
import quickRent.variable.Room;
import quickRent.variableService.RoomService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomService roomService;

    //测试方法/显示所有内容
    @GetMapping(value = "/rooms")
    public List<Room> roomList()
    {
        return roomRepository.findAll();
    }

    //添加新的房屋
    @PostMapping(value = "/rooms")
    public Room roomAdd(@RequestParam("rentUser") Integer rentUser,
                        @RequestParam("price") Integer price,
                        @RequestParam("place") String place,
                        @RequestParam("distance") Integer distance){
        Room room = new Room();
        room.setRentUser(rentUser);
        room.setPrice(price);
        room.setPlace(place);
        room.setDistance(distance);
        room.setChecked(0);
        room.setStatus(0);


        return roomRepository.save(room);
    }

    //更新房屋信息
    @PutMapping(value = "/rooms/{id}")
    public Room roomUpdate(@PathVariable("id") Integer id,
                           @RequestParam("rentUser") Integer rentUser,
                           @RequestParam("price") Integer price,
                           @RequestParam("place") String place,
                           @RequestParam("distance") Integer distance)
    {
        Room room = new Room();
        room.setId(id);
        room.setRentUser(rentUser);
        room.setPrice(price);
        room.setPlace(place);
        room.setDistance(distance);

        return roomRepository.save(room);
    }

    //根据房屋id查找
    @GetMapping(value = "/rooms/{id}")
    public Room roomFindOne(@PathVariable("id") Integer id){
        return roomRepository.findById(id).get();
    }

    @DeleteMapping(value = "/rooms/{id}")
    public void roomDelete(@PathVariable("id") Integer id)
    {
        roomRepository.deleteById(id);
    }


    //根据用户id查找
    @GetMapping(value = "/rooms/rentUser/{rentUser}")
    public List<Room> roomListByRentUser(@PathVariable("rentUser") Integer rentUser)
    {
        return roomRepository.findByRentUser(rentUser);
    }

    //根据房屋审核情况查找
    @GetMapping(value = "/rooms/checked/{checked}")
    public List<Room> roomListByChecked(@PathVariable("checked") Integer checked)
    {
        return roomRepository.findByChecked(checked);
    }

    //根据价格范围查找
    //不怎么好用
    @GetMapping(value = "/rooms/price/{price_low}/{price_high}")
    public List<Room> roomListByPrice(@PathVariable("price_low") Integer priceLow,
                                      @PathVariable("price_high") Integer priceHigh)
    {
        List<Room> roomList = roomRepository.findByPrice(priceLow);
        List<Room> tempList = new ArrayList<Room>();
        int i = priceLow;
        for(i=priceLow + 1;i<=priceHigh;i++)
        {
            tempList = roomRepository.findByPrice(i);
            roomList.addAll(tempList);
        }
        return roomList;
    }



    //待测试/未成功
    //根据用户获取待审核的房屋
    ///checked为0
    @PostMapping(value = "/users/rooms/{id}")
    public List<Room> listUncheckedRoom(@PathVariable("id") Integer id,
                                        @RequestParam("password") String password)
    {
        return roomService.uncheckedRoom(id,password);
    }



}
