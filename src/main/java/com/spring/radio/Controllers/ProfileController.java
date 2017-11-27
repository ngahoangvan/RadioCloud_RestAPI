package com.spring.radio.Controllers;

import com.spring.radio.Domain.Profile;
import com.spring.radio.Repository.profileRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private profileRepository profileRepository;

    @GetMapping("/")
    public @ResponseBody Iterable<Profile> getAllProfile() {
        return profileRepository.findAll();
    }

    @PostMapping("/save")
    public void Create(@RequestBody Profile profile){
        profileRepository.save(profile);
    }

    @PutMapping("/update")
    public void Update(@RequestBody Profile profile){
        profileRepository.save(profile);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Profile> delete(@PathVariable int id){
        Profile pro=profileRepository.findOne(id);
        if(pro==null){
            return ResponseEntity.notFound().build();
        }
         profileRepository.delete(id);
        return ResponseEntity.ok().build();
    }




}
