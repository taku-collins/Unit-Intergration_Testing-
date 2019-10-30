/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.service;

import com.contact.model.contacts;
import com.contact.repository.contactRepository;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 *
 * @author collins
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class contactServiceTest {
    
 
    /**
     * Test of getAllContact method, of class contactService.
     */
     //@Mock
    @InjectMocks
    private contactService businesservice;
    
    //@InjectMocks
    @Mock
    private contactRepository DAO;
    
    private MockMvc mockMvc;
    
     @Before
     public void setup() throws Exception{
        MockitoAnnotations.initMocks(this);
             
         mockMvc = MockMvcBuilders.standaloneSetup(DAO).build();
        }

    
    
    @Test
    public void testGetAllContact () {
        
        List<contacts> allContact = new ArrayList<>();
        contacts c1 = new contacts(15, "collins" , 857674891);
        contacts c2 = new contacts(16, "ayamba" , 856754891);
        contacts c3 = new contacts(17, "taku" , 856724891);
        
        allContact.add(c1);
        allContact.add(c2);
        allContact.add(c3);
        
        when(businesservice.getAllContact()).thenReturn((allContact));
        
        List<contacts> contactList = businesservice.getAllContact();
        assertEquals(3, contactList.size());
        verify(businesservice, times(1)).getAllContact();
    }
    
   
}