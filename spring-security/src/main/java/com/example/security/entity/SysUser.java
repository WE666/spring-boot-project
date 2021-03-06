package com.example.security.entity;

import java.util.List;

public class SysUser {
    private Integer id;
    private String name;
    private String password;
    private List<Roles> roles;

    public SysUser() {
    }

    public SysUser(Integer id, String name, String password, List<Roles> roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
}
