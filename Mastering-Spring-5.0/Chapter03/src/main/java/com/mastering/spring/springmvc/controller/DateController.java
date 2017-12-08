package com.mastering.spring.springmvc.controller;

import com.mastering.spring.springmvc.model.Duser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DateController {

    @RequestMapping(value = "/date-form",method = RequestMethod.GET)
    public String showForm(ModelMap model){
        Duser duser = new Duser();
        model.addAttribute("duser",duser);
        return "duser";
    }

    @RequestMapping(value = "/date-form",method = RequestMethod.POST)
    public String handleForm(Duser duser){
        System.out.println(duser);
        return "list-users";
    }
}
