package com.kusonl.service;

import com.kusonl.domain.User;

public interface UserService {

    User Login(String username, String password);
}
