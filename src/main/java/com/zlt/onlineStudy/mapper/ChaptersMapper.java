package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.Chapters;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface ChaptersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chapters record);

    int insertSelective(Chapters record);

    List<Chapters> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chapters record);

    int updateByPrimaryKey(Chapters record);

    List<Chapters> findAllChapters();
    //通过课程id查找对应章节
    List<Chapters> findChaptersByCourseId(Integer courseId);
}