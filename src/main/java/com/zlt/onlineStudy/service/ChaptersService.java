package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Chapters;

public interface ChaptersService {

    int deleteByPrimaryKey(Integer id);

    int insert(Chapters record);

    int insertSelective(Chapters record);

    Chapters selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chapters record);

    int updateByPrimaryKey(Chapters record);
}
