package com.spring.radio.Repository;

import com.spring.radio.Domain.Radio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface radioRepository  extends JpaRepository<Radio, Integer> {
    List<Radio> findByNameContaining(String q);
}
