package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Singlequestions;

public interface SinglequestionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Singlequestions record);

    int insertSelective(Singlequestions record);

    Singlequestions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Singlequestions record);

    int updateByPrimaryKeyWithBLOBs(Singlequestions record);

    int updateByPrimaryKey(Singlequestions record);
}