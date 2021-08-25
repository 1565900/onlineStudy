package com.zlt.onlineStudy.controller;


import com.zlt.onlineStudy.po.Exam;
import com.zlt.onlineStudy.po.User;
import com.zlt.onlineStudy.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Exam")
@CrossOrigin
public class ExamController {
    @Autowired
    private ExamService examService;
    @DeleteMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        if(id!=null){
            return examService.deleteByPrimaryKey(id);}
        else {
            System.out.println("error");
            return 0;
        }
    };
    @PostMapping("/insert")
    public int insert(Exam record){
        return examService.insert(record);
    };
    @PostMapping("/insertSelective")
    public int insertSelective(Exam record){
        return examService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public Exam selectByPrimaryKey(Integer id){
        return examService.selectByPrimaryKey(id);
    }
    @PatchMapping("/updateByPrimaryKeySelective")//当部分属性为空时，则不修改；
    public int updateByPrimaryKeySelective(Exam record){
        return examService.updateByPrimaryKeySelective(record);
    };
    @PutMapping("/updateByPrimaryKey")//当实体某属性为空是，则将对应列置空；
    public int updateByPrimaryKey(Exam record){
        return examService.updateByPrimaryKey(record);
    };
    @GetMapping("/findAllUser")
    public List<Exam> findAllExam(){
        return examService.findAllExam();
    };

}
