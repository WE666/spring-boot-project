package com.example.mybatis.controller;

import com.example.mybatis.model.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String index(){
        return "hello word";
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{id}/select")
    public User findById(@PathVariable("id")Long id){
        return userService.findById(id);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
    public void delete(@PathVariable("id")Long id){
        userService.delete(id);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/update/{id}")
    public void update(@RequestParam User user){
        userService.update(user);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/insert")
    public void insert(User user){
        userService.insert(user);
    }
    @RequestMapping(method = RequestMethod.GET,value="/list/{pageNum}/{pageSize}")
    public List<User> selectAll(@PathVariable("pageNum")int pageNum,@PathVariable("pageSize")int pageSize){
        return userService.selectAll(pageNum,pageSize);
    }

}
