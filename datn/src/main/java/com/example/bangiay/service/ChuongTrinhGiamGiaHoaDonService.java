package com.example.bangiay.service;

import com.example.bangiay.entity.ChuongTrinhGiamGiaHoaDon;
import com.example.bangiay.repository.ChuongTrinhGiamGiaHoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuongTrinhGiamGiaHoaDonService {
    @Autowired
    private ChuongTrinhGiamGiaHoaDonRepository repository;

    public List<ChuongTrinhGiamGiaHoaDon> getAll(){
        return repository.findAll();
    }
}
