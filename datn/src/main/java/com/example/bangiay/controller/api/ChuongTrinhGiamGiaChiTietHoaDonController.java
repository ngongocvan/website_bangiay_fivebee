package com.example.bangiay.controller.api;

import com.example.bangiay.service.ChucVuService;
import com.example.bangiay.service.ChuongTrinhGiamGiaChiTietHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/chuongtrinhgiamgiachitiet")
public class ChuongTrinhGiamGiaChiTietHoaDonController {
    @Autowired
    private ChuongTrinhGiamGiaChiTietHoaDonService service;

    @GetMapping("")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
