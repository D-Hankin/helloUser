package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class GroupController {

    static {
        Group.addMember("(Example) David", "Master of Yarn", "Human", "david@nwo.com", Group.members.size() + 100);
        Group.addMember("(Example) Scclarr", "Needle Ninja", "Reptilian", "Scream in fear", Group.members.size() + 101);
        Group.addMember("(Example) Scytale", "One Needle Short", "Tleilaxu", "Pray to The Prophet", Group.members.size() + 102);
    }

    @GetMapping("/")
    String getIndex(Model model) {

        model.addAttribute("members", Group.members);

        return "index";
    }
       
    
}
