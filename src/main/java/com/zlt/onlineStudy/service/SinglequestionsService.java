package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Singlequestions;

import java.util.List;

public interface SinglequestionsService {
    Singlequestions selectByPrimaryKey(Integer id);
    List<Singlequestions> findQuestionByCourse_id(Integer id);
}
