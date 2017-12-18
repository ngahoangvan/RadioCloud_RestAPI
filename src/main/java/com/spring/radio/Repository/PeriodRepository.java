package com.spring.radio.Repository;

import com.spring.radio.Domain.Period;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeriodRepository extends JpaRepository<Period, Integer> {
    List<Period> findByNameContaining(String q);
}
