package com.zlt.onlineStudy.controller;

import com.zlt.onlineStudy.po.Singlequestions;
import com.zlt.onlineStudy.service.SinglequestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Singlequestions")
@CrossOrigin
public class SinglequestionsController {

    @Autowired
    private SinglequestionsService singlequestionsService;

    public Singlequestions selectByPrimaryKey(Integer id){
        return singlequestionsService.selectByPrimaryKey(id);
    };
}
