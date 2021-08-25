package com.zlt.onlineStudy.controller;

import com.zlt.onlineStudy.po.Chapters;
import com.zlt.onlineStudy.service.ChaptersService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Chapters")
@CrossOrigin
public class ChaptersController {

    @Autowired
     private ChaptersService chaptersService;
    @DeleteMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        if(id!=null){
            return chaptersService.deleteByPrimaryKey(id);}
        else {
            System.out.println("error");
            return 0;
        }
    };
    @PostMapping("/insert")
    public int insert(Chapters record){
        return chaptersService.insert(record);
    };
    @PostMapping("/insertSelective")
    public int insertSelective(Chapters record){
        return chaptersService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public Chapters selectByPrimaryKey(Integer id){
        return chaptersService.selectByPrimaryKey(id);
    }
    @PatchMapping("/updateByPrimaryKeySelective")//当部分属性为空时，则不修改；
    public int updateByPrimaryKeySelective(Chapters record){
        return chaptersService.updateByPrimaryKeySelective(record);
    };
    @PutMapping("/updateByPrimaryKey")//当实体某属性为空是，则将对应列置空；
    public int updateByPrimaryKey(Chapters record){
        return chaptersService.updateByPrimaryKey(record);
    };
    @GetMapping("/findAllChapters")
    public List<Chapters> findAllChapters(){
        return chaptersService.findAllChapters();
    };

}
