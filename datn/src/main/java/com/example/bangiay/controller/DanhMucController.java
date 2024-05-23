package com.example.bangiay.controller;

import com.example.bangiay.entity.DanhMuc;
import com.example.bangiay.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/danhmuc")
public class DanhMucController {
    @Autowired
    private DanhMucService service;

    @GetMapping()
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody DanhMuc danhMuc){
//        return ResponseEntity.ok(service.add(danhMuc));
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> update(@PathVariable UUID id, @RequestBody DanhMuc danhMuc){
//        return ResponseEntity.ok(service.update(id, danhMuc));
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity update(@PathVariable UUID id){
//        return ResponseEntity.ok(service.deleteById(id));
//    }
}
