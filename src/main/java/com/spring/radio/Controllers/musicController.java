package com.spring.radio.Controllers;


import com.spring.radio.Domain.Music;
import com.spring.radio.Repository.musicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public void Create(@RequestBody Music music){
        musicRepository.save(music);
    }

    @PutMapping("/update")
    public void Update(@RequestBody Music music){
        musicRepository.save(music);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Music> delete(@PathVariable int id){
        Music mus=musicRepository.findOne(id);
        if(mus==null){
            return ResponseEntity.notFound().build();
        }
        musicRepository.delete(id);
        return ResponseEntity.ok().build();
    }


}
