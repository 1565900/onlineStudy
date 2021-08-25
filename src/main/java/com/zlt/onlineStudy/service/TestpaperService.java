package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Testpaper;

import java.util.List;

public interface TestpaperService {
    int deleteByPrimaryKey(Integer id);

    int insert(Testpaper record);

    int insertSelective(Testpaper record);

    Testpaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testpaper record);

    int updateByPrimaryKey(Testpaper record);

    List<Testpaper> findAllTestpaper();
}
