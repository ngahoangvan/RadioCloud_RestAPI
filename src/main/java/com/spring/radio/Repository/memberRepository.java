package com.spring.radio.Repository;

import com.spring.radio.Domain.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface memberRepository extends CrudRepository<Member, Integer>{
    List<Member> findByUsernameContaining(String q);
}
