package com.spring.radio.Controllers;


import com.spring.radio.Domain.Radio;
import com.spring.radio.Repository.RadioRepository;
import com.spring.radio.Service.radioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/radio")
public class RadioController {

    @Autowired
    private radioService radioService;

    @GetMapping("/")
    public @ResponseBody
    Iterable<Radio> getAllRadio() {
        return radioService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Radio getRadio(@PathVariable int id) {
        return radioService.findOne(id);
    }

    @PostMapping("/save")
    public void Create(@RequestBody Radio radio){
        radioService.save(radio);
    }

    @PutMapping("/update")
    public void Update(@RequestBody Radio radio){
        radioService.save(radio);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Radio> delete(@PathVariable int id){
        Radio mus= radioService.findOne(id);
        if(mus==null){
            return ResponseEntity.notFound().build();
        }
        radioService.delete(id);
        return ResponseEntity.ok().build();
    }


}
