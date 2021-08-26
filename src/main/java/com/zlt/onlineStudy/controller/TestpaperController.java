package com.zlt.onlineStudy.controller;


import com.zlt.onlineStudy.po.Exam;
import com.zlt.onlineStudy.po.Testpaper;
import com.zlt.onlineStudy.po.Testpaper_detailed;
import com.zlt.onlineStudy.service.TestpaperService;
import com.zlt.onlineStudy.service.Testpaper_detailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Testpaper")
@CrossOrigin
public class TestpaperController {
    @Autowired
    private TestpaperService testpaperService;
    private Testpaper_detailedService testpaper_detailedService;

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
    public int insert(Testpaper record){
        return testpaperService.insert(record);
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
