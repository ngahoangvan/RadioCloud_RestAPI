package com.spring.radio.Service;

import com.spring.radio.Domain.Period;
import com.spring.radio.Domain.Radio;
import com.spring.radio.Repository.PeriodRepository;
import com.spring.radio.Repository.RadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class radioServiceImpl implements radioService{
    @Autowired
    private RadioRepository RadioRepository;


    @Override
    public Iterable<Radio> findAll() {
        return RadioRepository.findAll();
    }

    @Override
    public List<Radio> search(String q) {
        return  RadioRepository.findByName(q);
    }

    @Override
    public Radio findOne(int id) {
        return RadioRepository.findOne(id);
    }

    @Override
    public void save(Radio radio) {
        RadioRepository.save(radio);
    }

    @Override
    public void delete(int id) {
        RadioRepository.delete(id);
    }
}
