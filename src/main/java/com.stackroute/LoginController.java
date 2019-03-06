package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class LoginController {


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView checkUser(HttpServletRequest req, HttpServletResponse res) {

        ModelAndView mv = new ModelAndView("index");

        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        if (uname.equals("saurabh") && pass.equals("1234")) {
            mv.addObject("uname",uname);

            mv.setViewName("success");
        } else {

            mv.setViewName("index");
        }

        return mv;
    }

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

}
