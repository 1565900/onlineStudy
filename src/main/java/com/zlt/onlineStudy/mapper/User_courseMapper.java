package com.zlt.onlineStudy.mapper;

import com.zlt.onlineStudy.po.User_course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User_courseMapper {
    int insert(User_course record);

    int insertSelective(User_course record);
    int updateSelective(User_course user_course);
}