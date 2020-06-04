package com.liuhao.springbootmybatis.controller;

import com.liuhao.springbootmybatis.bean.User;
import com.liuhao.springbootmybatis.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserMapper userMapper;
    @GetMapping(value = "selectone/{id}")
    public User selectone(@PathVariable("id") String id){
        Integer Id = Integer.parseInt(id);
       return userMapper.selectone(Id);
    }

}
