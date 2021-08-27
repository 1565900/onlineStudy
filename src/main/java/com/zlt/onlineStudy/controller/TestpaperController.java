package com.zlt.onlineStudy.controller;


import com.zlt.onlineStudy.po.Exam;
import com.zlt.onlineStudy.po.Singlequestions;
import com.zlt.onlineStudy.po.Testpaper;
import com.zlt.onlineStudy.po.Testpaper_detailed;
import com.zlt.onlineStudy.service.SinglequestionsService;
import com.zlt.onlineStudy.service.TestpaperService;
import com.zlt.onlineStudy.service.Testpaper_detailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/Testpaper")
@CrossOrigin
public class TestpaperController {
    @Autowired
    private TestpaperService testpaperService;
    private Testpaper_detailedService testpaper_detailedService;
    private Testpaper_detailed testpaper_detailed;
    private SinglequestionsService singlequestionsService;

    @GetMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        if(id!=null){
            return testpaperService.deleteByPrimaryKey(id);}
        else {
            System.out.println("error");
            return 0;
        }
    };
    @PostMapping("/insert")
    public void insert(Testpaper record){
        testpaperService.insert(record);
        List<Singlequestions> sqs = singlequestionsService.findQuestionByCourse_id(record.getCourseId());
        int[] question_id = new int[sqs.size()];
        int a = 0;
        int b = 0;
        for(Singlequestions s : sqs){
            question_id[a]=s.getId();
            a++;
        }
        for(int i = 0 ; i <10 ; i++) {
            b = (int) (Math.random()*a);
            testpaper_detailed.setQuesId(question_id[b]);
            testpaper_detailed.setTestpaperId(record.getId());
            testpaper_detailed.setTureAns(singlequestionsService.selectByPrimaryKey(question_id[b]).getTrueans());
            testpaper_detailedService.insert(testpaper_detailed);
        }
    };
    @GetMapping("/insertSelective")
    public int insertSelective(Testpaper record){
        return testpaperService.insertSelective(record);
    };
    @GetMapping("/selectByPrimaryKey")
    public List<Testpaper> selectByPrimaryKey(Integer id){
        return testpaperService.selectByPrimaryKey(id);
    }
    @GetMapping("/updateByPrimaryKeySelective")//当部分属性为空时，则不修改；
    public int updateByPrimaryKeySelective(Testpaper record){
        return testpaperService.updateByPrimaryKeySelective(record);
    };
    @PutMapping("/updateByPrimaryKey")//当实体某属性为空是，则将对应列置空；
    public int updateByPrimaryKey(Testpaper record){
        return testpaperService.updateByPrimaryKey(record);
    };
    @GetMapping("/findAllTestpaper")
    public List<Testpaper> findAllTestpaper(){
        return testpaperService.findAllTestpaper();
    };

}
