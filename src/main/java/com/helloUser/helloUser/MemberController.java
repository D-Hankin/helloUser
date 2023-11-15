package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("newMember", new Member(null, null, null, null, 0));

        return "add-member";
    }

    @PostMapping("/add-member/add")
    String addNewMember(@RequestParam("name") String name, @RequestParam("rank") String rank, @RequestParam("species") String species, @RequestParam("contact") String contact, Model model) {
        if (rank == "")
            rank = "Unknown";
        model.addAttribute("memberList", Group.members);
        model.addAttribute("newMember", new Member(null, null, null, null, 0));
        Group.addMember(name, rank, species, contact, Group.members.size() + 1);

        return "redirect:/add-member";
    }

    @GetMapping("/remove-member/{memberId}")
    String removeMember(@PathVariable int memberId) {
        Group.members.removeIf(member -> member.getId() == memberId);
        
        return "redirect:/members";
    }

    
}
