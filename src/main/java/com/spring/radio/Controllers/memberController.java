package com.spring.radio.Controllers;

import com.spring.radio.Domain.Member;
import com.spring.radio.Repository.memberRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class memberController {

    private memberRepository memberRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public memberController(memberRepository memberRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.memberRepository = memberRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Member> getAllProfile() {
        return memberRepository.findAll();
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody Member member) {
//        member.setPassword(bCryptPasswordEncoder.encode(member.getPassword()));
        memberRepository.save(member);
    }



}
