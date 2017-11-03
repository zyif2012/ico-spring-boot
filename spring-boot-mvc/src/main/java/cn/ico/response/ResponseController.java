package cn.ico.response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {


    @RequestMapping("/charset/accept")
    public @ResponseBody
    String responseAcceptHeaderCharset() {
        return "蓝灯 (\"Hello world!\" in Japanese)";
    }

    @RequestMapping(value = "/charset/produce",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String produce() {
        return "蓝灯 (\"Hello world!\" in Japanese)";
    }


    @RequestMapping("/entity/status")
    public ResponseEntity<String> responseEntityStatusCode() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        //return new ResponseEntity<String>("我的名字", HttpStatus.FORBIDDEN.FORBIDDEN);
        return new ResponseEntity<String>("我的名字", HttpStatus.OK);
    }
}
