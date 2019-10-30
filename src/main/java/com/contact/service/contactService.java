/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.service;

import com.contact.model.contacts;
import com.contact.repository.contactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author collins
 */




//@Service
@Component
public class contactService {
    
    
    @Autowired
    private contactRepository contactRepo;

     public List<contacts> getAllContact(){
       return contactRepo.findAll();  
     }
}
          