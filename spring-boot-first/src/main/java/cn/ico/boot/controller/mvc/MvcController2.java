package cn.ico.boot.controller.mvc;

import cn.ico.boot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/mvc2")
public class MvcController2 {

    @RequestMapping("/redirect")
    String index(){
        return "redirect:/hello/hello3";
    }
    @RequestMapping("/redirect1")
    String index1(){
        return "redirect:/image/net.png";
    }

    @RequestMapping("/forward")
    String forward(){
        return "forward:/hello/hello2";
    }

    @RequestMapping("/user")
    ModelAndView user(){
        User user = new User();
        user.setFavor(new String[]{"spring mvc", "struts2"});
        return new ModelAndView("user.jsp", "command", user);
    }

    @RequestMapping("/addUser")
    String addUser(@ModelAttribute User user, ModelMap model){
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("favor", user.getFavor());
        model.addAttribute("country", user.getCountry());
        model.addAttribute("skills", user.getSkills());
        return "users.jsp";
    }

    @ModelAttribute("favorList")
    List<String> getFavorList(){
        ArrayList<String> favorList = new ArrayList<>();
        favorList.add("spring mvc");
        favorList.add("struts2");
        favorList.add("hibernate");
        return favorList;
    }

    @ModelAttribute("countryList")
    Map<String,String> getCountryList(){
        Map<String,String> countryList=new HashMap<>();
        countryList.put("US", "United States");
        countryList.put("CN", "China");
        countryList.put("JP", "Japan");
        return countryList;
    }

    @ModelAttribute("skillList")
    Map<String,String> getSkillList(){
        Map<String,String> skillList=new HashMap<>();
        skillList.put("UN", "United Nion");
        skillList.put("CN1", "China1");
        skillList.put("JP2", "Japan3");
        return skillList;
    }


}
