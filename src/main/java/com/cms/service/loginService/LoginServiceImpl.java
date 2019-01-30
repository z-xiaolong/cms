package com.cms.service.loginService;


import com.cms.entity.User;
import org.springframework.stereotype.Service;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService{

    @Override
    public User findByAccount(String account) {
        return null;
    }

    @Override
    public User findByID(int id) {
        return null;
    }
}
