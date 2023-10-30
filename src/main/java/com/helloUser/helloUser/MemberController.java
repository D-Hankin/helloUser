package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MemberController {

    @GetMapping("/add-member") 
    String addMember() {
        return "add-member";
    }
    
}
