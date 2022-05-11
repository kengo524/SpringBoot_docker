package com.example.app.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.Matcher;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.transaction.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional

public class UserControllerTests {
    private static final Object User = null;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void index処理でviewとしてindexが渡される() throws Exception {
        this.mockMvc.perform(get("/users/"))
                .andExpect(status().isOk())
                .andExpect(view().name("users/index"));
    }

    @Test
    void new処理でviewとしてnewが渡される() throws Exception {
        this.mockMvc.perform(get("/users/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("users/new"));
    }

    @Test
    void フォームの入力値に対する確認画面へ() throws Exception {
        this.mockMvc
                .perform((post("/users/confirm"))
                        .param("name", "テスト")
                        .param("email", "test@test")
                        .param("inquiry", "テストです。"))
                .andExpect(status().isOk())
                .andExpect(model().hasNoErrors())
                .andExpect(model().attribute("User", User))
                .andExpect(view().name("users/confirm"));
    }

    @Test
    void complete処理でviewとしてcompleteが渡される() throws Exception {
        this.mockMvc
                .perform((post("/users"))
                        .param("name", "completeテスト")
                        .param("email", "test@test")
                        .param("inquiry", "テストです。"))
                .andExpect(status().isOk())
                .andExpect(model().hasNoErrors())
                .andExpect(model().attribute("User", User))
                .andExpect(view().name("users/complete"));
    }

}
