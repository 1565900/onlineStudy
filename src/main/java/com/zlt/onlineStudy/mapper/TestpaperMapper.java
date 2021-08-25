package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Testpaper;

public interface TestpaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Testpaper record);

    int insertSelective(Testpaper record);

    Testpaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testpaper record);

    int updateByPrimaryKey(Testpaper record);
}