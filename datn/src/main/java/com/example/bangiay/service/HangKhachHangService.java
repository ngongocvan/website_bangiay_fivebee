package com.example.bangiay.service;

import com.example.bangiay.entity.HangKhachHang;
import com.example.bangiay.repository.HangKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangKhachHangService {
    @Autowired
    private HangKhachHangRepository repository;

    public List<HangKhachHang> getAll(){
        return repository.findAll();
    }
}
