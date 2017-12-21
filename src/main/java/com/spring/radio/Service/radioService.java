package com.spring.radio.Service;


import org.springframework.data.domain.Page;
import com.spring.radio.Domain.Period;
import com.spring.radio.Domain.Radio;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface radioService {
    Iterable<Radio> findAll();

    List<Radio> search(String q);

    Radio findOne(int id);

    void save(Radio radio);

    void delete(int id);

    Page<Radio> findDESC(PageRequest pageable);

}
