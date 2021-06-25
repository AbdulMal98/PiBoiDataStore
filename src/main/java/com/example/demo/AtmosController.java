package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/atp")
@ResponseBody
@RequiredArgsConstructor
public class AtmosController {

    private final AtmosRepository repository;

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("it work");
    }


    @GetMapping("/data")
    public List<AtmosData> getData() {
        List<AtmosData> atmosData = repository.findAll();
        return atmosData;
    }

    @PostMapping("/add")
    public AtmosData getData_entry(@RequestBody AtmosData data_entry) {

        return repository.save(data_entry);
    }
    @PostMapping("/test")
    public Test getTest(@RequestBody Test test){
        return test;
    }


}
