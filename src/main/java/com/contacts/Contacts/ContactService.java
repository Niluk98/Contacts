package com.contacts.Contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;
    public ResponseEntity<String> addContact(String mobileNo,String name){
        return contactRepository.putContact(mobileNo,name);
    }
    public String getContact(String mobileNo){
        return contactRepository.getContact(mobileNo);
    }
}
