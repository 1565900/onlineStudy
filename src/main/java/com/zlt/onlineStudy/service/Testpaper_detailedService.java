package com.zlt.onlineStudy.service;

import com.zlt.onlineStudy.po.Exam;
import com.zlt.onlineStudy.po.Testpaper;
import com.zlt.onlineStudy.po.Testpaper_detailed;

import java.util.List;

public interface Testpaper_detailedService {

    int insert(Testpaper_detailed record);

    int insertSelective(Testpaper_detailed record);

    int updateByPrimaryKey(Testpaper_detailed record);

    List<Testpaper_detailed> findAllTestpaper_detailed();



}
