package com.example.bangiay.controller;

import com.example.bangiay.service.KichCoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fivebee/KichCo")
public class KichCoController {
    @Autowired
    private KichCoService serviec;
    @GetMapping
    public ResponseEntity<?> getALL(){
        return ResponseEntity.ok(serviec.getall());
    }
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody KichCo kichCo){
//        return ResponseEntity.ok(serviec.add(kichCo));
//    }
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> update(@RequestBody KichCo kichCo, @PathVariable UUID id){
//        return ResponseEntity.ok(serviec.update(kichCo,id));
//    }
//    @DeleteMapping("/delete/{id}")
//    public  ResponseEntity<?> delete(@PathVariable UUID id){
//        return  ResponseEntity.ok(serviec.deleteById(id));
//    }
}
