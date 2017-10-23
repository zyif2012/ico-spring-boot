package be.c4j.springsquad.users;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HomeControllerTest {

    private MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void showHomeDefaultJsp() throws Exception {
        ResultActions result = mockMvc.perform(get("/"));

        assertView(result, "jsp");
    }

    @Test
    public void showHomeJspResolver() throws Exception {
        ResultActions result = mockMvc.perform(get("/").param("viewResolver", "jsp"));

        assertView(result, "jsp");
    }

    @Test
    public void showHomeThymeleafResolver() throws Exception {
        ResultActions result = mockMvc.perform(get("/").param("viewResolver", "thymeleaf"));

        assertView(result, "thymeleaf");
    }


    private void assertView(ResultActions result, String viewResolver) throws Exception {
        result
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(model().attribute("name", "Spring Squad"))
                .andExpect(view().name(viewResolver + "/home"));
    }
}