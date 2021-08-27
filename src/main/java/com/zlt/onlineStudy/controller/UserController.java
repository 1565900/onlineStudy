package com.zlt.onlineStudy.controller;


import com.zlt.onlineStudy.po.User;

import com.zlt.onlineStudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/User")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        if(id!=null){
            return userService.deleteByPrimaryKey(id);}
        else {
            System.out.println("error");
            return 0;
        }
    };
    @PostMapping("/insert")
    public int insert(User record){
        return userService.insert(record);
    };
    @GetMapping("/insertSelective")
    public int insertSelective(User record){
         userService.insertSelective(record);
         return 0;
    };
    @GetMapping("/selectByPrimaryKey")
    public List<User> selectByPrimaryKey(Integer id){
        return userService.selectByPrimaryKey(id);
    }
    @GetMapping("/updateByPrimaryKeySelective")//当部分属性为空时，则不修改；
    public String updateByPrimaryKeySelective(HttpServletRequest request,User record){
        int id=(int)request.getSession().getAttribute("USERID");
        User user=record;
        user.setId(id);
        userService.updateByPrimaryKeySelective(user);
        return "redirect:/gerenshezhi;";
    };
    @PutMapping("/updateByPrimaryKey")//当实体某属性为空是，则将对应列置空；
    public int updateByPrimaryKey(User record){
        return userService.updateByPrimaryKey(record);
    };
    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
