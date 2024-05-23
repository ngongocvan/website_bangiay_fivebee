package com.example.bangiay.controller.api;

import com.example.bangiay.service.ChucVuService;
import com.example.bangiay.service.HangKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/hangkhachhang")
public class HangKhachHangController {
    @Autowired
    private HangKhachHangService service;

    @GetMapping("")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
