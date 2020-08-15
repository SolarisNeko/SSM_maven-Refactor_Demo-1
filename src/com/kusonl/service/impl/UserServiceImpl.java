package com.kusonl.service.impl;

import com.kusonl.dao.UserMapper;
import com.kusonl.domain.User;
import com.kusonl.domain.UserExample;
import com.kusonl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User Login(String username, String password) {

        // 利用传进来的username和password复刻一个user，查询mysql中有没有
        User user = new User();
        user.setId(1);
        user.setUsername(username);

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andIdEqualTo(Integer.parseInt(password));

        List<User> users = userMapper.selectByExample(userExample);

        // 判一下 List.size() 是否为 0, 防止报 IndexOutOfBoundsException
        if (users.size() != 0) {
            return users.get(0);
        }

        return null ;
    }
}
