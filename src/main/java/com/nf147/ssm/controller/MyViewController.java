package com.nf147.ssm.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Component
/*public class MyViewController extends InternalResourceViewResolver {
    public MyViewController(){
        this.setPrefix("/WEB-INF/jsp/");
        this.setSuffix(".html");
    }
}*/
public class MyViewController implements Controller {

    @Override
    @RequestMapping("/aaa")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("aaa");
        return modelAndView;
    }
}