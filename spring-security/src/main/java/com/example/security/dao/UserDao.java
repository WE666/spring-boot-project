package com.example.security.dao;

import com.example.security.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public User selectById(long id) {
        return this.sqlSession.selectOne("selectById", id); //sqlSession.selectOne(String,gvr)
    }


}
