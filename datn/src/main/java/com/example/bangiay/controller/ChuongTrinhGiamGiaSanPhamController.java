package com.example.bangiay.controller;

import com.example.bangiay.entity.ChuongTrinhGiamGiaSanPham;
import com.example.bangiay.service.ChuongTrinhGiamGiaSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/fivebee/ChuongTrinhGiamGiaSanPham")
public class ChuongTrinhGiamGiaSanPhamController {
    @Autowired
    private ChuongTrinhGiamGiaSanPhamService service;
    @GetMapping
    public ResponseEntity<?> getall(){
        return ResponseEntity.ok(service.getall());
    }
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham){
//        return  ResponseEntity.ok(service.add(chuongTrinhGiamGiaSanPham));
//    }
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> update(@PathVariable UUID id,@RequestBody ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham){
//        return  ResponseEntity.ok(service.update(chuongTrinhGiamGiaSanPham,id));
//    }
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable UUID id){
//        return  ResponseEntity.ok(service.deleteById(id));
//    }
}
