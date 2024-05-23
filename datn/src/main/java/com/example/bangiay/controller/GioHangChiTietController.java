package com.example.bangiay.controller;

<<<<<<< HEAD

import com.example.bangiay.entity.GioHangChiTiet;
import com.example.bangiay.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
=======
import com.example.bangiay.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa

@RestController
@RequestMapping("/fivebee/GioHangChiTiet")
public class GioHangChiTietController {
    @Autowired
    private GioHangChiTietService service;
    @GetMapping
    public ResponseEntity<?> getall(){
<<<<<<< HEAD
        return ResponseEntity.ok(service.getall());
=======
        return ResponseEntity.ok(service.getAll());
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
    }
//    @PostMapping
//    public ResponseEntity<?> add(@RequestBody GioHangChiTiet gioHangChiTiet){
//        return ResponseEntity.ok(service.add(gioHangChiTiet));
//    }
//    @PutMapping
//    public  ResponseEntity<?> update(@RequestBody GioHangChiTiet gioHangChiTiet, @PathVariable UUID id){
//        return ResponseEntity.ok(service.update(gioHangChiTiet,id));
//    }
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable UUID id){
//        return ResponseEntity.ok(service.deleteById(id));
//    }
}
