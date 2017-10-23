package cn.ico.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/hello1")
    @ResponseBody
    String hello(){
        return "hello zyif";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    String list(){
        return "my name is hello world!";
    }

    @RequestMapping("/hello3")
    String wel(@RequestParam(value="name", required=false, defaultValue="hello World") String name, Model model){
        model.addAttribute("name", name);
        return "welcome";
    }

    @RequestMapping("/hello4")
    String jsp(){
        return "home";
    }


}
