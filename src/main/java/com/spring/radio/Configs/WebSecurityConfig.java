package com.spring.radio.Configs;


import com.spring.radio.Filters.JWTAuthenticationFilter;
import com.spring.radio.Filters.JWTLoginFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.sql.DataSource;

/**
 * Created by nhs3108 on 29/03/2017.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/login").permitAll() // Request POST tới "/login" luôn được phép truy cập dù là đã authenticated hay chưa
//                .antMatchers(HttpMethod.GET, "/profile/").hasAuthority("admin")
//                .antMatchers(HttpMethod.GET, "/period/**").hasRole("ADMIN")
                .antMatchers("/profile/**").access("hasRole('ADMIN')")
                .anyRequest().permitAll()//  request ko cần login
//                .anyRequest().authenticated()  // Các request còn lại đều cần được authenticated
                .and().logout().logoutSuccessUrl("/login?logout")//logout
                .and()
                .addFilterBefore(new JWTLoginFilter("/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("password").roles("ADMIN");
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username,password,enabled from \"member\" where  username=?")
                .authoritiesByUsernameQuery("select username, role from \"member\" where username=?");
//                .passwordEncoder(new BCryptPasswordEncoder(16));
    }
}
