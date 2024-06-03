package com.example.bangiay.service;

import com.example.bangiay.entity.ChucVu;
import com.example.bangiay.repository.ChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChucVuService {
    @Autowired
    private ChucVuRepository repository;

    public List<ChucVu> getAll(){
        return repository.findAll();
    }
}
