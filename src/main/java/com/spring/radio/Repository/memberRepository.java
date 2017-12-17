package com.spring.radio.Repository;

import com.spring.radio.Domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository  extends JpaRepository<Member, Integer>{
    Member findByUsernameContaining(String q);
}
