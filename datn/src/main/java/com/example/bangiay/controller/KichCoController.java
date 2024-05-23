package com.example.bangiay.controller;

<<<<<<< HEAD
import com.example.bangiay.entity.KichCo;
import com.example.bangiay.service.KichCoServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
=======
import com.example.bangiay.service.KichCoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa

@RestController
@RequestMapping("/fivebee/KichCo")
public class KichCoController {
    @Autowired
<<<<<<< HEAD
    private KichCoServiec serviec;
=======
    private KichCoService serviec;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
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
