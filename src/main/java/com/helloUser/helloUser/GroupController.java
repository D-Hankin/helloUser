package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class GroupController {

    public static Group group = new Group("NWO Knitting Circle");

    @GetMapping("/")
    String getIndex(Model model) {

        model.addAttribute("members", Group.members);

        return "index";
    }
       
    
}
