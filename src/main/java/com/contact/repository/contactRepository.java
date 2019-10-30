/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.repository;

import com.contact.model.contacts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author collins
 */
public interface contactRepository extends JpaRepository<contacts, Integer>{

    
    
}
