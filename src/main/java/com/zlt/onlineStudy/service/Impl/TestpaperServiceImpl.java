package com.zlt.onlineStudy.service.Impl;


import com.zlt.onlineStudy.mapper.TestpaperMapper;

import com.zlt.onlineStudy.po.Testpaper;
import com.zlt.onlineStudy.service.TestpaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestpaperServiceImpl implements TestpaperService {
    @Resource
    private TestpaperMapper testpaperMapper;
    public int deleteByPrimaryKey(Integer id){
        return testpaperMapper.deleteByPrimaryKey(id);
    };

    public int insert(Testpaper record){
        return testpaperMapper.insert(record);

    };

    public int insertSelective(Testpaper record){
        return testpaperMapper.insertSelective(record);
    };

    public Testpaper selectByPrimaryKey(Integer id){
        return testpaperMapper.selectByPrimaryKey(id);
    };

    public int updateByPrimaryKeySelective(Testpaper record){
        return testpaperMapper.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(Testpaper record){

        return  testpaperMapper.updateByPrimaryKey(record);
    };

    public List<Testpaper> findAllTestpaper(){
        return testpaperMapper.findAllTestpaper();
    };
}
