package com.example.mybatis.service.impl;

import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.User;
import com.example.mybatis.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void delete(Long id){
        userMapper.deleteByPrimaryKey(id);
    }
    @Override
    public void insert(User user){
        userMapper.insert(user);
    }
    @Override
    public int update(User user)
    {
        return userMapper.updateByPrimaryKey(user);
    }
    @Override
    public User findById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<User> selectAll(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectAll();
    }
}
