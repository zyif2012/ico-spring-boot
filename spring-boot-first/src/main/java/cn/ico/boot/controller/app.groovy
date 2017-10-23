package cn.ico.boot.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class app {

    @RequestMapping("/demo")
    String hello(){
        return "hello world!"
    }
}
