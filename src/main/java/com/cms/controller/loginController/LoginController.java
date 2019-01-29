package com.cms.controller.loginController;

import com.cms.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {


    @RequestMapping(value="/")
    public ModelAndView index(){
        ModelAndView mv = this.getModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
