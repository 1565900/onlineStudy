package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Singlequestions;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface SinglequestionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Singlequestions record);

    int insertSelective(Singlequestions record);

    Singlequestions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Singlequestions record);

    int updateByPrimaryKeyWithBLOBs(Singlequestions record);

    int updateByPrimaryKey(Singlequestions record);

    List<Singlequestions> findQuestionByCourse_id(Integer id);
}