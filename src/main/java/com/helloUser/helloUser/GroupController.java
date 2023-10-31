package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class GroupController {

    static {
        Group.addMember("(Example) David", "1", "Human", "david@nwo.com", Group.members.size() + 1);
        Group.addMember("(Example) Scclarr", "2", "Reptilian", "Scream in fear", Group.members.size() + 1);
        Group.addMember("(Example) Scytale", "3", "Tleilaxu", "Pray to The Prophet", Group.members.size() + 1);
    }

    @GetMapping("/")
    String getIndex(Model model) {

        model.addAttribute("members", Group.members);

        return "index";
    }
       
    
}
