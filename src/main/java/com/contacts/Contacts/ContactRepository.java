package com.contacts.Contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    HashMap<String,String> hm=new HashMap<>();
    public ResponseEntity<String> putContact(String mobileNo,String name){
        hm.put(mobileNo,name);
        return new ResponseEntity<>(name+" Sucessfully added", HttpStatus.CREATED);
    }
    public  String getContact(String mobileNo){
        return hm.get(mobileNo);
    }
}
