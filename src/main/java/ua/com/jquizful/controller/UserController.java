package ua.com.jquizful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.jquizful.model.Gender;
import ua.com.jquizful.model.User;
import ua.com.jquizful.service.UserService;

/**
 * Created by Александр on 13.08.2015.
 */
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String goToMainPage() {
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String goToRegisterPage() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(
            @RequestParam(value = "userName", required = true) String userName,
            @RequestParam(value = "email", required = true) String email,
            @RequestParam(value = "gender", required = true) String gender,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "password2", required = true) String password2,
            ModelMap map) {
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setGender(Gender.valueOf(gender));
        user.setPassword(password);
        if(!userService.isUserNameRegistered(user.getUserName())) {
            userService.saveUser(user);
        }
        map.put("userName", user.getUserName());
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam(value = "userName", required = true) String userName,
            @RequestParam(value = "password", required = true) String password,
            ModelMap map) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        User registeredUser = userService.getUserByName(user.getUserName());
        if (registeredUser != null && user.equals(registeredUser)) {
            map.put("userName", user.getUserName());
        }
        return "index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout(ModelMap map) {
        if (map.containsKey("userName")) {
            map.remove("userName");
        }
        return "index";
    }

}
