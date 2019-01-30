package com.cms.service.loginService;

import com.cms.entity.User;

public interface LoginService {
    User findByAccount(String account);
    User findByID(int id);
}
