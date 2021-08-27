package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Exam;
import java.util.List;

public interface ExamService {
    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    List<Exam> selectByCourse_id(Integer id);

    List<Exam> exselectByCourse_id(Integer id);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);

    List<Exam> findAllExam();
}
