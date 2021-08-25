package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.SinglequestionsMapper;
import com.zlt.onlineStudy.mapper.Testpaper_detailedMapper;
import com.zlt.onlineStudy.po.Exam;
import com.zlt.onlineStudy.po.Testpaper_detailed;
import com.zlt.onlineStudy.service.Testpaper_detailedService;

import java.util.List;

public class Testpaper_detailedServiceImpl  implements Testpaper_detailedService {
    private Testpaper_detailedMapper testpaper_detailedMapper;
    private SinglequestionsMapper singlequestionsMapper;
    public int insert(Testpaper_detailed record){
        return testpaper_detailedMapper.insert(record);
    };

    public int insertSelective(Testpaper_detailed record){
        return testpaper_detailedMapper.insertSelective(record);
    };

    public int updateByPrimaryKey(Testpaper_detailed record){

        return  testpaper_detailedMapper.updateByPrimaryKey(record);
    };

    public List<Testpaper_detailed> findAllTestpaper_detailed(){
        return testpaper_detailedMapper.findAlltestpaper_detailed();
    };
}
