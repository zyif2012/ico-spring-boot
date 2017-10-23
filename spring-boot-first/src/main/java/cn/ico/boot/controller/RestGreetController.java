package cn.ico.boot.controller;

import cn.ico.boot.domain.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RestGreetController {

    private static final String template = "hello ,%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greet")
    public Greeting greet(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

