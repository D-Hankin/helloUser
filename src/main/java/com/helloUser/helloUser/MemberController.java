package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MemberController {

    @GetMapping("/members")
    String showMembers(Model model) {
        model.addAttribute("membersList", Group.members);
        return "members";
    }

    @GetMapping("/add-member") 
    String addMemberPage(Model model) {
        model.addAttribute("membersList", Group.members);
        model.addAttribute("newMember", new Member(null, null, null, null));
        return "add-member";
    }

    @PostMapping("/add-member/add")
    String addNewMember(@RequestParam("name") String name, @RequestParam("rank") String rank, @RequestParam("species") String species, @RequestParam("contact") String contact, Model model) {
        model.addAttribute("memberList", Group.members);
        model.addAttribute("newMember", new Member(name, rank, species, contact));
        Group.addMember(name, rank, species, contact);
        return "redirect:/add-member";
    }

    
}
