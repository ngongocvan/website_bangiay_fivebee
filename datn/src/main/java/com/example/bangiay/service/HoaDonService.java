package com.example.bangiay.service;

import com.example.bangiay.entity.HoaDon;
import com.example.bangiay.repository.HoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HoaDonService {
    @Autowired
    private HoaDonRepository repository;

    public List<HoaDon> getAll(){
        return repository.findAll();
    }
}
