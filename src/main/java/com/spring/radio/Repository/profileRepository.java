package com.spring.radio.Repository;

import com.spring.radio.Domain.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface profileRepository extends CrudRepository<Profile, Integer>{
    List<Profile> findByNameContaining(String q);
}
