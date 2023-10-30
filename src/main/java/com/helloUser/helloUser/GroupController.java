package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class GroupController {

    @GetMapping("/")
    String getIndex() {
        return "index";
    }

    @GetMapping("/members")
    String showMembers(Model model) {
        model.addAttribute("membersList", HelloUserApplication.group.members);
        return "members";
    }
    
}
