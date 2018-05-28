package com.example.mybatis.service;

import com.example.mybatis.model.User;

import java.util.List;

public interface UserService {
    public void delete(Long id);
    public void insert(User user);
    public int update(User user);
    public User findById(Long id);
    public List<User> selectAll(int pageNum,int pageSize);
}
