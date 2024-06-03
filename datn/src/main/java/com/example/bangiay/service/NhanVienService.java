package com.example.bangiay.service;

import com.example.bangiay.entity.NhanVien;
import com.example.bangiay.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository repository;

    public List<NhanVien> getAll(){
        return repository.findAll();
    }
}
