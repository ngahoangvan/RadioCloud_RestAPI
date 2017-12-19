package com.spring.radio.Repository;

import com.spring.radio.Domain.Radio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RadioRepository extends JpaRepository<Radio, Integer> {
    List<Radio> findByName(String q);
}
