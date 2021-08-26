package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Testpaper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestpaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Testpaper record);

    int insertSelective(Testpaper record);

    List<Testpaper> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testpaper record);

    int updateByPrimaryKey(Testpaper record);

    List<Testpaper> findAllTestpaper();
}