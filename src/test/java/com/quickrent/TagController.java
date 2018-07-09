package quickRent.variableController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import quickRent.variable.Room;
import quickRent.variableRepository.TagRepository;
import quickRent.variable.Tag;

import java.util.List;

@RestController
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    //测试方法/显示所有内容
    @GetMapping(value = "/tags")
    public List<Tag> tagList()
    {
        return tagRepository.findAll();
    }

    //添加新的标签
    @PostMapping(value = "/tags")
    public Tag tagAdd(@RequestParam("room") Integer room,
                      @RequestParam("tagContent") String tagContent)
    {
        Tag tag = new Tag();
        tag.setRoom(room);
        tag.setTagContent(tagContent);

        return tagRepository.save(tag);
    }

    //通过房屋id查找
    @GetMapping(value = "/tags/room/{room}")
    public List<Tag> roomListByRentUser(@PathVariable("room") Integer room)
    {
        return tagRepository.findByRoom(room);
    }

    @DeleteMapping(value = "/tags/{id}")
    public void roomDelete(@PathVariable("id") Integer id)
    {
        tagRepository.deleteById(id);
    }

}
