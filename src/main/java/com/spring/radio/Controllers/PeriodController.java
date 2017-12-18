package com.spring.radio.Controllers;

import com.spring.radio.Domain.Period;
import com.spring.radio.Repository.PeriodRepository;
import com.spring.radio.Service.radioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/period")
public class PeriodController {

    @Autowired
    private PeriodRepository periodRepository;

    @GetMapping("/")
    public @ResponseBody
    Iterable<Period> getAllPeriod() {
        return periodRepository.findAll();
    }

    @PostMapping("/save")
    public void Create(@RequestBody Period period){
        periodRepository.save(period);
    }

    @GetMapping("/{id}")
    public Period getRadio(@PathVariable int id){
        return periodRepository.findOne(id);
    }

    @PutMapping("/update")
    public void Update(@RequestBody Period period){
        periodRepository.save(period);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Period> delete(@PathVariable int id){
        Period period=periodRepository.findOne(id);
        if(period==null){
            return ResponseEntity.notFound().build();
        }
        periodRepository.delete(id);
        return ResponseEntity.ok().build();
    }

}
