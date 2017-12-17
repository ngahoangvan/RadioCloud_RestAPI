package com.spring.radio.Repository;

import com.spring.radio.Domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface profileRepository extends CrudRepository<Profile, Integer> {

//    @Query("select p from profile p where p.name like '%name%'")
    List<Profile> findByNameContaining(String username);
}
