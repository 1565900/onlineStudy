package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ExamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    List<Exam> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);

    List<Exam> findAllExam();
}