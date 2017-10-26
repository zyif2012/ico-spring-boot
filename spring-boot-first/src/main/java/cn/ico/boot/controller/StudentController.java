package cn.ico.boot.controller;

import cn.ico.boot.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/edit")
    public String edit(Model model) {
        Student student=new Student();
        student.setAge(23);
        student.setId(1);
        student.setName("John");
        student.setBirth(new Date());
        model.addAttribute(student);
        return "E_Student";
    }

    @RequestMapping("/submit")
    @ResponseBody
    public Student submit(@ModelAttribute Student student) {

        return student;
    }
}
