package com.spring.radio.Service;

import com.spring.radio.Domain.Member;
import com.spring.radio.Repository.memberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class memberServiceImpl implements memberService{

    @Autowired
    private memberRepository memberRepository;

    @Override
    public Iterable<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public List<Member> search(String q) {
        return memberRepository.findByUsernameContaining(q);
    }

    @Override
    public Member findOne(int id) {
        return memberRepository.findOne(id);
    }

    @Override
    public void save(Member profile) {
        memberRepository.save(profile);
    }

    @Override
    public void delete(int id) {
        memberRepository.delete(id);
    }
}
