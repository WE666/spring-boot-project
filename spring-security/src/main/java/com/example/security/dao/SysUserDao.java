package com.example.security.dao;

import com.example.security.entity.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SysUserDao {

    @Autowired
    private SqlSession sqlSession;

    public SysUser findByName(String name){

        return sqlSession.selectOne("findByName",name);
    }

}
