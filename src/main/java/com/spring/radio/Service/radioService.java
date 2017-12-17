package com.spring.radio.Service;


import com.spring.radio.Domain.Radio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface radioService {
    Iterable<Radio> findAll();

    List<Radio> search(String q);

    Radio findOne(int id);

    void save(Radio radio);

    void delete(int id);
}
