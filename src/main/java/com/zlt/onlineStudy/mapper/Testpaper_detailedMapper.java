package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Testpaper_detailed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Testpaper_detailedMapper {
    int insert(Testpaper_detailed record);

    int insertSelective(Testpaper_detailed record);

    List<Testpaper_detailed> findAllTestpaper_detailed();

    int updateByPrimaryKey(Testpaper_detailed record);
}