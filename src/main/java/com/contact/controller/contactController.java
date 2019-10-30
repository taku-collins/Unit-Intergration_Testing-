/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.controller;

import com.contact.model.contacts;
import com.contact.service.contactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author collins
 */
@RestController

public class contactController {
    
    
    
    @Autowired  
    private final contactService contactService;


   public contactController (contactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping("/contact")
    public List<contacts> getProjects() {
        return contactService.getAllContact();
    }
    
}
