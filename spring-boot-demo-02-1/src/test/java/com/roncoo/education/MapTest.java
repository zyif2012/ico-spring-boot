package com.roncoo.education;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MapTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void map() throws Exception {
        RequestBuilder request = get("/index");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string("hello world"));

        request = get("/index/map").param("name", "zyif");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().json("{\"name\":\"zyif\",\"id\":\"身份证号码\"}"));

    }
}
