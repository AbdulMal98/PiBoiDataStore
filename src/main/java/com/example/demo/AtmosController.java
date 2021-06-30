package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequiredArgsConstructor
public class herAtmosController {

    private final AtmosRepository repository;

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
