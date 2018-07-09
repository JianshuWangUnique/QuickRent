package quickRent.variableController;

import org.springframework.web.bind.annotation.*;
import quickRent.variableRepository.UserRepository;
import quickRent.variable.User;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
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


}
