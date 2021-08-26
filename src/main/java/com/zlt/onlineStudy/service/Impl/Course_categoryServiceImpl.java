package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.Course_categoryMapper;
import com.zlt.onlineStudy.po.Comment;
import com.zlt.onlineStudy.po.Course_category;
import com.zlt.onlineStudy.service.Course_categoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Course_categoryServiceImpl implements Course_categoryService {
@Resource
private Course_categoryMapper course_categoryMapper;
    public int deleteByPrimaryKey(Integer id){
        Course_category course_category =new Course_category();
        course_category.setId(id);
        course_category.setState(0);
        return course_categoryMapper.updateByPrimaryKeySelective(course_category);
    };

    public int insert(Course_category record){
        return course_categoryMapper.insert(record);
    };

    public int insertSelective(Course_category record){
        return course_categoryMapper.insertSelective(record);
    };

    public List<Course_category> selectByPrimaryKey(Integer id){
        return course_categoryMapper.selectByPrimaryKey(id);
    };

    public int updateByPrimaryKeySelective(Course_category record){
        return course_categoryMapper.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(Course_category record){
        return course_categoryMapper.updateByPrimaryKey(record);
    };

    public List<Course_category> findAllCourse_category(){
        return course_categoryMapper.findAllCourse_category();
    };
}
