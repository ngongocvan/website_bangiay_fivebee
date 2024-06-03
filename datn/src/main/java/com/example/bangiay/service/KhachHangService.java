package com.example.bangiay.service;

import com.example.bangiay.entity.KhachHang;
import com.example.bangiay.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository repository;

    public List<KhachHang> getAll(){
        return repository.findAll();
    }
}
