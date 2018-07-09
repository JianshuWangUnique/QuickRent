package quickRent.variableController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quickRent.variableRepository.CollectionRepository;
import quickRent.variable.Collection;

import java.util.List;

@RestController
public class CollectionController {

    @Autowired
    private CollectionRepository collectionRepository;

    //测试方法/显示所有内容
    @GetMapping(value = "/collections")
    public List<Collection> collectionList()
    {
        return collectionRepository.findAll();
    }

    //添加新的收藏
    @PostMapping(value = "/collections")
    public Collection collectionAdd(@RequestParam("user") Integer user,
                                    @RequestParam("room") Integer room)
    {
        Collection collection = new Collection();
        collection.setRoom(room);
        collection.setUser(user);

        return collectionRepository.save(collection);
    }

    @DeleteMapping(value = "/collections/{id}")
    public void roomDelete(@PathVariable("id") Integer id)
    {
        collectionRepository.deleteById(id);
    }

    //通过用户查看收藏
    @GetMapping(value = "/rooms/rentUser/{User}")
    public List<Collection> collectionListByUser(@PathVariable("User") Integer user)
    {
        return collectionRepository.findByUser(user);
    }


}
