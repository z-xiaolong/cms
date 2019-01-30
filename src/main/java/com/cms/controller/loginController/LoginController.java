package com.cms.controller.loginController;

import com.cms.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class LoginController extends BaseController {


    @RequestMapping
    public ModelAndView toLogin(){
        ModelAndView mv = this.getModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "login")
    public Object login() throws Exception{
        return "";
    }

}
