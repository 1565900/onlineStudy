package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.ChaptersMapper;
import com.zlt.onlineStudy.po.Chapters;
import com.zlt.onlineStudy.service.ChaptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ChaptersServiceImpl implements ChaptersService {

    @Resource
    private ChaptersMapper chaptersMapper;
    public int deleteByPrimaryKey(Integer id){
       return chaptersMapper.deleteByPrimaryKey(id);
    };

    public int insert(Chapters record){
        return chaptersMapper.insert(record);

    };

    public int insertSelective(Chapters record){
        return chaptersMapper.insertSelective(record);
    };

    public Chapters selectByPrimaryKey(Integer id){
        return chaptersMapper.selectByPrimaryKey(id);
    };

    public int updateByPrimaryKeySelective(Chapters record){
         return chaptersMapper.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(Chapters record){

       return  chaptersMapper.updateByPrimaryKey(record);
    };
}
