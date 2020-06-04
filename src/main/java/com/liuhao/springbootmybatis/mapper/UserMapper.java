package com.liuhao.springbootmybatis.mapper;

import com.liuhao.springbootmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    public User selectone(Integer id);
    public int insertuser(User user);
}
