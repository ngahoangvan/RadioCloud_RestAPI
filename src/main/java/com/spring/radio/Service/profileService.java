package com.spring.radio.Service;

import com.spring.radio.Domain.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface profileService {
    Iterable<Profile> findAll();

    List<Profile> search(String q);

    Profile findOne(int id);

    void save(Profile profile);

    void delete(int id);
}
