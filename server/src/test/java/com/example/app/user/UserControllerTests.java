// package com.example.app.user;

// import org.junit.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import
// org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.servlet.MockMvc;

// import static
// org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static
// org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// @SpringBootTest
// @AutoConfigureMockMvc

// public class UserControllerTests {
// @Autowired
// private MockMvc mockMvc;

// @Test
// void index処理でviewとしてindexが渡される() throws Exception {
// this.mockMvc.perform(get("/users/"))
// .andExpect(status().isOk())
// .andExpect(view().name("index"));
// }

// }
