package com.spring.radio.Controllers;

import com.spring.radio.Domain.Radio;
import com.spring.radio.Repository.radioRepository;
import com.spring.radio.Service.radioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/radio")
public class radioController {

    @Autowired
    private radioRepository radioRepository;

    @Autowired
    private radioService radioService;

    @GetMapping("/")
    public @ResponseBody
    Iterable<Radio> getAllProfile() {
        return radioService.findAll();
    }

    @PostMapping("/save")
    public void Create(@RequestBody Radio radio){
        radioService.save(radio);
    }

    @GetMapping("/{id}")
    public Radio getRadio(@PathVariable int id){
        return radioService.findOne(id);
    }

    @PutMapping("/update")
    public void Update(@RequestBody Radio radio){
        radioService.save(radio);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Radio> delete(@PathVariable int id){
        Radio pro=radioService.findOne(id);
        if(pro==null){
            return ResponseEntity.notFound().build();
        }
        radioService.delete(id);
        return ResponseEntity.ok().build();
    }

}
