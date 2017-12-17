package com.spring.radio.Controllers;


import com.spring.radio.Domain.Music;
import com.spring.radio.Repository.musicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class musicController {
    @Autowired
    private musicRepository musicRepository;

    @GetMapping("/")
    public @ResponseBody
    Iterable<Music> getAllProfile() {
        return musicRepository.findAll();
    }


}
