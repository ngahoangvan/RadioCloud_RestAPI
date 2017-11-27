package com.spring.radio.Service;

import com.spring.radio.Domain.Member;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface memberService {
    Iterable<Member> findAll();

    List<Member> search(String q);

    Member findOne(int id);

    void save(Member member);

    void delete(int id);
}
