package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/atp")
@RequiredArgsConstructor
public class AtmosController {
    private final AtmosRepository repository;
    @GetMapping("/test")
    public String test(){
        return "dog no work";
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


}
