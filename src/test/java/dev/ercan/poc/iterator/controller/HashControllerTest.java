package dev.ercan.poc.iterator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class HashControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void shouldReturnSHA512Hash() throws Exception {
    String requestBody = "{ \"text\": \"hello\" }";

    mockMvc.perform(post("/hash")
            .contentType("application/json")
            .content(requestBody))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$").isArray());
  }

}