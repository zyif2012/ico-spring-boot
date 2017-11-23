package cn.ico.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class SimpleController {

    @RequestMapping(method = RequestMethod.GET)
    public void index(){

    }
    @RequestMapping("/simple")
    @ResponseBody
    public String simple(){
        return "hello world";
    }
    @RequestMapping("/simpleMap")
    @ResponseBody
    public Map<String,String> map(){
        Map<String, String> map = new HashMap<>();
        map.put("abc","abc");
        return map;
    }

    @RequestMapping(value = "simple/revisited",headers = "Accept=text/plain")
    @ResponseBody
    public String simpleRvisited(){
        return "hello world reviisted";
    }


}
