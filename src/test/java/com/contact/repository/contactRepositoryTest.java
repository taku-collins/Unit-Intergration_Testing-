/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.repository;

import com.contact.model.contacts;
import com.contact.service.contactService;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author collins
 */
@SpringBootTest
public class contactRepositoryTest {
    

  @Autowired
  //private contactService service;
  private MockMvc mvc;
  
  @MockBean
  private contactRepository contactRepo;

    
    @Test
    void testSomeMethod ()throws Exception {
   /*     when(contactRepo.findAll()).thenReturn(Stream
   .of(new contacts(8,"Mechel",691358467),
   new contacts(9, "Mechel",691358467)).collect(Collectors.toList()));
        */
    /*    when(contactRepo.findAll()).thenReturn(
                Collections.emptyList());
        
        MvcResult mvcResult = mvc.perform(
           MockMvcRequestBuilders.get("/contact")
                   .accept(MediaType.APPLICATION_JSON)
        ).andReturn();
        System.out.println(mvcResult.getResponse());
        
        verify(contactRepo).findAll();*/
    
          mvc.perform( MockMvcRequestBuilders.get("/contact")
      .accept(MediaType.APPLICATION_JSON))
      .andDo(print())
      .andExpect(status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$.contacts").exists())
      .andExpect(MockMvcResultMatchers.jsonPath("$.contacts[*].contactd").isNotEmpty());
    }
    
}
