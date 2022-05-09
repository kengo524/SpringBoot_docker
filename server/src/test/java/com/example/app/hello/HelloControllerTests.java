package com.example.app.hello;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void index処理でviewとしてindexが渡される() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    // messageにHello world.が渡されているかを判定
    @Test
    void index処理でモデルのメッセージにHelloworldが渡される() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(model().attribute("message", "Hello world!!."));
    }
}
