package com.example.controller;

import com.example.entity.Limit;
import com.example.service.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/limit")
public class LimitController {

    @Autowired
    private LimitService limitService;

    @PostMapping("/save")
    public ResponseEntity<HttpStatus> save(@RequestBody Limit limit) {
        limitService.save(limit);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Limit>> findAll() {
        return new ResponseEntity<>(limitService.findAll(), HttpStatus.OK);
    }
}
