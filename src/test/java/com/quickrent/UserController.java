package quickRent.variableController;

import org.springframework.web.bind.annotation.*;
import quickRent.variableRepository.UserRepository;
import quickRent.variable.User;

import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> userList(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/users")
    public User userAdd(@RequestParam("userName") String userName,
                            @RequestParam("password") String password){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);

        return userRepository.save(user);
    }

    //根据用户id查找
    @GetMapping(value = "/Users/{id}")
    public User userFindOne(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }



}
