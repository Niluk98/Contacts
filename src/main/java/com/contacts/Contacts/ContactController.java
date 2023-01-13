package com.contacts.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RestController
public class ContactController {
    @Autowired
    ContactService contactService;
    @PostMapping("/add-name")
    public ResponseEntity<String> addContact(@RequestParam("mobileNo") String mobileNo, @RequestParam("name") String name){
        return contactService.addContact(mobileNo,name);
    }
    @GetMapping("/get-name/{mobileNo}")
    public String getContact(@PathVariable String mobileNo){
        return contactService.getContact(mobileNo);
    }
}
