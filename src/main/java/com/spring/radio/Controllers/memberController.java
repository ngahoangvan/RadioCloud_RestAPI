package com.spring.radio.Controllers;

import com.spring.radio.Domain.Member;
import com.spring.radio.Repository.memberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class memberController {

    @Autowired
    private memberRepository memberRepository;
    @GetMapping("/")
    public @ResponseBody
    Iterable<Member> getAllProfile() {
        return memberRepository.findAll();
    }
    @PostMapping("/save")
    public void Create(@RequestBody Member profile){
        memberRepository.save(profile);
    }

    @PutMapping("/update")
    public void Update(@RequestBody Member profile){
        memberRepository.save(profile);
    }

}
