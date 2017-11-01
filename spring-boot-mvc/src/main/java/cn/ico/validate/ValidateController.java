package cn.ico.validate;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class ValidateController {

    @RequestMapping("/validate")
    @ResponseBody
    public String validate(@Valid JavaBean javaBean, BindingResult result) {
        if (result.hasErrors()) {
            return "存在错误";
        } else {
            return "no error";
        }
    }
}
