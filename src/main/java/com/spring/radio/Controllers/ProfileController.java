package com.spring.radio.Controllers;

import com.spring.radio.Domain.Member;
import com.spring.radio.Domain.Profile;
import com.spring.radio.Repository.profileRepository;
import com.spring.radio.Service.profileService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private profileRepository profileRepository;
    @Autowired
    private profileService profileService;



    @GetMapping("/")
    public @ResponseBody Iterable<Profile> getAll() {
        return profileRepository.findAll();
    }

    @GetMapping("/search/{name}")
    public  Iterable<Profile> getAllProfile(@PathVariable String name ) {
        return profileService.search(name);
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
