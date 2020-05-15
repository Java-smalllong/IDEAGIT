package com.liuxiaochang.controller;

import com.liuxiaochang.pojo.Users;
import com.liuxiaochang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: 刘小长
 * @Date: 2020/5/15
 * @Description: com.liuxiaochang.controller
 * @version: 1.0
 */
@Controller
public class UsersController {
    @Autowired
    private UsersService usersServiceImpl;
    @RequestMapping("/addUsers")
    public String addUsers(HttpServletRequest req,Users users){
        int index = this.usersServiceImpl.addUsers(users);
        System.out.println(users);
        if(index>0){
            System.out.println("ok!!");
        }else {
            System.out.println("error");
        }
        return "ok";
    }
}
