package com.zlt.onlineStudy.service.Impl;

import com.zlt.onlineStudy.mapper.ExamMapper;
import com.zlt.onlineStudy.mapper.UserMapper;
import com.zlt.onlineStudy.po.Exam;
import com.zlt.onlineStudy.po.User;
import com.zlt.onlineStudy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public int deleteByPrimaryKey(Integer id){
        return userMapper.deleteByPrimaryKey(id);
    };

    public int insert(User record){
        return userMapper.insert(record);

    };

    public int insertSelective(User record){
        return userMapper.insertSelective(record);
    };

    public List<User> selectByPrimaryKey(Integer id){
        return userMapper.selectByPrimaryKey(id);
    };

    public int updateByPrimaryKeySelective(User record){
        return userMapper.updateByPrimaryKeySelective(record);
    };

    public int updateByPrimaryKey(User record){

        return  userMapper.updateByPrimaryKey(record);
    };

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    };

    @Override
    public User selectByAccount(String account) {
        return userMapper.selectByAccount(account);
    }
}
