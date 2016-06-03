package com.example.jpa.Controller;

import com.example.jpa.Entity.User;
import com.example.jpa.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tanglemo on 16/6/3.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, ModelMap modelMap){
        User user = userService.findByName(username);
        modelMap.put("user",user);
        return "success";
    }
}
