package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.ExamMapper;
import com.zlt.onlineStudy.po.Exam;
import com.zlt.onlineStudy.service.ExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    @Resource
    private ExamMapper examMapper;
    public int deleteByPrimaryKey(Integer id){
        return examMapper.deleteByPrimaryKey(id);
    };

    public int insert(Exam record){
        return examMapper.insert(record);

    };

    public int insertSelective(Exam record){
        return examMapper.insertSelective(record);
    };

    public List<Exam> selectByCourse_id(Integer id){
        return examMapper.selectByCourse_id(id);
    };

    public List<Exam> exselectByCourse_id(Integer id){ return examMapper.exselectByCourse_id(id);};

    public int updateByPrimaryKeySelective(Exam record){
        return examMapper.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(Exam record){

        return  examMapper.updateByPrimaryKey(record);
    };

    public List<Exam> findAllExam(){
        return examMapper.findAllExam();
    };

}
