package be.c4j.springsquad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showHome(@RequestParam(value = "viewResolver") Optional<String> viewResolver) {
        return getDefaultView(viewResolver);
    }

    private ModelAndView getDefaultView(Optional<String> viewResolver) {
        ModelAndView model = new ModelAndView(createView(viewResolver, "/home"));
        model.addObject("name", "Spring Squad");
        return model;
    }

    private String createView(Optional<String> viewResolver, String viewName) {
        String result = viewResolver.isPresent() ? viewResolver.get() : "jsp";
        result += viewName;
        return result;
    }

    @RequestMapping("/jsp/home")
    String home1(Model model){
        model.addAttribute("name", "zyif");
        return "jsp/home";
    }

    @RequestMapping("/thymeleaf/home")
    String home2(){
        return "thymeleaf/home";
    }


}
