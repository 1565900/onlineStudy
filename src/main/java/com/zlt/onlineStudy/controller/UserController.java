package com.zlt.onlineStudy.controller;


import com.zlt.onlineStudy.po.User;

import com.zlt.onlineStudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
@CrossOrigin
public class UserController {
    //@Autowired
    private UserService userService;
    @DeleteMapping("/deleteByPrimaryKey")
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
    @PostMapping("/insertSelective")
    public int insertSelective(User record){
        return userService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public User selectByPrimaryKey(Integer id){
        return userService.selectByPrimaryKey(id);
    }
    @PatchMapping("/updateByPrimaryKeySelective")//当部分属性为空时，则不修改；
    public int updateByPrimaryKeySelective(User record){
        return userService.updateByPrimaryKeySelective(record);
    };
    @PutMapping("/updateByPrimaryKey")//当实体某属性为空是，则将对应列置空；
    public int updateByPrimaryKey(User record){
        return userService.updateByPrimaryKey(record);
    };
    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    };
}
