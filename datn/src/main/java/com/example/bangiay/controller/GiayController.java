package com.example.bangiay.controller;

import com.example.bangiay.entity.Giay;
import com.example.bangiay.service.GiayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/fivebee/Giay")
public class GiayController {
    @Autowired
    private GiayService service;
    @GetMapping
    public ResponseEntity<?> getall(){
        return  ResponseEntity.ok(service.getAll());
    }
//     @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody Giay giay){
//        return ResponseEntity.ok(service.add(giay));
//     }
//     @PutMapping("/update/{id}")
//    public ResponseEntity<?> update(@PathVariable UUID id, @RequestBody Giay giay){
//        return ResponseEntity.ok(service.update(id,giay));
//     }
//     @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable UUID id){
//        return  ResponseEntity.ok(service.deleteById(id));
//     }
}
