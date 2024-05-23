package com.example.bangiay.controller;

<<<<<<< HEAD
import com.example.bangiay.entity.GioHang;
import com.example.bangiay.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
=======
import com.example.bangiay.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa

@RestController
@RequestMapping("/fivebee/GioHang")
public class GioHangController {
    @Autowired
    private GioHangService service;
    @GetMapping
    public ResponseEntity<?> getall(){
        return ResponseEntity.ok(service.getall());
    }
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody GioHang gioHang){
//        return  ResponseEntity.ok(service.add(gioHang));
//    }
//    @PutMapping("update/{id}")
//    public ResponseEntity<?> update(@RequestBody GioHang gioHang, @PathVariable UUID id){
//        return ResponseEntity.ok(service.update(gioHang,id));
//    }
//    @DeleteMapping("delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable UUID id){
//        return  ResponseEntity.ok((service.deleteById(id)));
//    }
}
