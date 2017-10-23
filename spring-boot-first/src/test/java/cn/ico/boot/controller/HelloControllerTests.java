package cn.ico.boot.controller;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*@RunWith(SpringRunner.class)
@SpringBootTest //这个启动整个应用，@WebMvcTest 只启动web层
@AutoConfigureMockMvc*/
public class HelloControllerTests {

    /*@Autowired
    private MockMvc mvc;

    @Test
    public void hello() throws Exception{
        *//*mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.equalTo("hello zyif")));*//*
        //MockMvcResultHandlers.print() 可打印出请求和响应信息

    }*/
}
