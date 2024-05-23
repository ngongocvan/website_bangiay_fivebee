package com.example.bangiay.service;

import com.example.bangiay.entity.DiaChi;
import com.example.bangiay.repository.DiaChiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaChiService {
    @Autowired
    private DiaChiRepository repository;

    public List<DiaChi> getAll(){
        return repository.findAll();
    }
}
