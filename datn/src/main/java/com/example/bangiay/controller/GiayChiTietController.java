package com.example.bangiay.controller;

<<<<<<< HEAD
import com.example.bangiay.entity.GiayChiTiet;
import com.example.bangiay.service.GiayChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
=======
import com.example.bangiay.service.GiayChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa

@RestController
@RequestMapping("/fivebee/GiayChiTiet")
public class GiayChiTietController {
    @Autowired
    private GiayChiTietService service;
    @GetMapping
    public ResponseEntity<?> getall(){
<<<<<<< HEAD
        return ResponseEntity.ok(service.getall());
=======
        return ResponseEntity.ok(service.getAll());
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
    }
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody GiayChiTiet giayChiTiet){
//       return ResponseEntity.ok(service.add(giayChiTiet));
//    }
//    @PutMapping
//    public ResponseEntity<?> update(@RequestBody GiayChiTiet giayChiTiet, @PathVariable UUID id){
//        return ResponseEntity.ok(service.update(giayChiTiet,id));
//    }
//    @DeleteMapping
//    public ResponseEntity<?> delete(@PathVariable UUID id){
//        return ResponseEntity.ok(service.deleteById(id));
//    }
}
