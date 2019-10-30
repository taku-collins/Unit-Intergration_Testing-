/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author collins
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class contactControllerIntergrayionTest {
    
    @Autowired
    private TestRestTemplate restTemplate ;
    
    
    
    @Test
    public void contextLoads(){
      /* this.restTemplate.getForObject("/contact").
                JSONAssert.assertEwuals("[{},{}]",response, false);
    */
    }
}
