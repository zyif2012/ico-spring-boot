package cn.ico.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/views")
public class ViewScontroller {

    @RequestMapping("/html")
    public String prepare(Model model) {
        model.addAttribute("foo", "bar");
        model.addAttribute("fruit", "water");
        return "views/html";
    }
    @RequestMapping(value = "viewName")
    public void requestToViewName(Model model) {
        model.addAttribute("foo", "bar");
        model.addAttribute("fruit", "water");
    }

    @RequestMapping("/pathVariables/{foo}/{fruit}")
    public String pathVariables(@PathVariable String foo, @PathVariable String fruit) {

        return "views/html";
    }

    @RequestMapping("/dataBinding/{foo}/{fruit}")
    public String dataBinding(@Valid Foo obj, Model model) {
        //页面调用的bean是foo，而不是obj
        model.addAttribute("obj", obj);//这样就可以使用obj，但是foo仍然存在
        return "views/dataBinding";
    }


}
