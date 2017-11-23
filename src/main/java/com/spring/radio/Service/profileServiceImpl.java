package com.spring.radio.Service;

import com.spring.radio.Domain.Profile;
import com.spring.radio.Repository.profileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class profileServiceImpl implements profileService{

    @Autowired
    private profileRepository profileRepository;

    @Override
    public Iterable<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    public List<Profile> search(String q) {
        return profileRepository.findByNameContaining(q);
    }

    @Override
    public Profile findOne(int id) {
        return profileRepository.findOne(id);
    }

    @Override
    public void save(Profile profile) {
        profileRepository.save(profile);
    }

    @Override
    public void delete(int id) {
        profileRepository.delete(id);
    }
}
