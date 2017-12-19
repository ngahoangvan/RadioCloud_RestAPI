package com.spring.radio.Service;

import com.spring.radio.Domain.Member;
import com.spring.radio.Repository.memberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private memberRepository memberRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findByUsernameContaining(username);
        if (member == null) {
            throw new UsernameNotFoundException("member not found");
        }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        String roles = member.getRole();
        grantedAuthorities.add(new SimpleGrantedAuthority(roles));
        return new org.springframework.security.core.userdetails.User(
                member.getUsername(), member.getPassword(), grantedAuthorities);
    }



}
