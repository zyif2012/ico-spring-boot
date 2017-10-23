package cn.ico.boot.controller.mvc;

import cn.ico.boot.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc1")
public class MvcController1 {

    @Autowired
    @Qualifier("studentValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @RequestMapping(value="/test1",method= RequestMethod.GET)
    public String test1(ModelMap model){
        model.addAttribute("message", "hello springmvc!");
        return "mvc1/test1";
    }

    @RequestMapping("/jsp1")
    public String jsp1(){
        return "hello.jsp";
    }

    @RequestMapping("/student")
    public ModelAndView student(){
        return new ModelAndView("student.jsp", "command", new Student());
    }

    @RequestMapping("/addStudent")
    public String addStrudent(@ModelAttribute @Validated Student student, ModelMap model, BindingResult result){
        if (result.hasErrors()) {
            return "student.jsp";
        }
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "result.jsp";
    }
}
