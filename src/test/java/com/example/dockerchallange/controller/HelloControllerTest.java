package com.example.dockerchallange.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test_whenRequestIsHelloStranger_thenReturnHelloStranger() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/helloStranger"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Stranger")));
    }

    @Test
    void test_whenRequestIsHelloWithParameter_thenReturnHelloWithSplitCamelCaseParameter() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/?name=RezaGholamzad"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Reza Gholamzad")));
    }

    @Test
    void test_whenRequestIsAuthor_thenReturnAuthorName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/author"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("reza gholamzad")));
    }
}
