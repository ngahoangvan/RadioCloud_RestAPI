package com.spring.radio.Repository;

import com.spring.radio.Domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface musicRepository extends JpaRepository<Music, Integer> {
    Music findByName(String q);
}
