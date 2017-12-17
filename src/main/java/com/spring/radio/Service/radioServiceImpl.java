package com.spring.radio.Service;

import com.spring.radio.Domain.Music;
import com.spring.radio.Domain.Radio;
import com.spring.radio.Repository.radioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class radioServiceImpl implements radioService{
    @Autowired
    private radioRepository radioRepository;


    @Override
    public Iterable<Radio> findAll() {
        return radioRepository.findAll();
    }

    @Override
    public List<Radio> search(String q) {
        return  radioRepository.findByNameContaining(q);
    }

    @Override
    public Radio findOne(int id) {
        return radioRepository.findOne(id);
    }

    @Override
    public void save(Radio radio) {
        radioRepository.save(radio);
    }

    @Override
    public void delete(int id) {
        radioRepository.delete(id);
    }
}
