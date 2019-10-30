/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.controller;

import com.contact.repository.contactRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author collins
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest
public class contactControllerTest {
    
  @Autowired
  private MockMvc mvc;
  
  @MockBean
  private contactRepository contactRepo;
  

    /**
     * Test of getProjects method, of class contactController.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProjects ()throws Exception{

       mvc.perform( MockMvcRequestBuilders
      .get("/contacts")
      .accept(MediaType.APPLICATION_JSON))
      .andDo(print())
      .andExpect(status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$.contacts").exists())
      .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[*].contactId").isNotEmpty());
      
       

       
    }
    
}
