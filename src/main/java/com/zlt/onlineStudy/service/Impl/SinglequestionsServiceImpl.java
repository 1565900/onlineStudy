package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.SinglequestionsMapper;
import com.zlt.onlineStudy.po.Singlequestions;
import com.zlt.onlineStudy.service.SinglequestionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SinglequestionsServiceImpl implements SinglequestionsService {
    @Resource
    private SinglequestionsMapper singlequestionsMapper;

    public Singlequestions selectByPrimaryKey(Integer id){
        return singlequestionsMapper.selectByPrimaryKey(id);
    }

    public List<Singlequestions> findQuestionByCourse_id(Integer id){

        return singlequestionsMapper.findQuestionByCourse_id(id);
    }



}
