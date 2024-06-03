package com.example.bangiay.service;

import com.example.bangiay.entity.ChuongTrinhGiamGiaChiTietHoaDon;
import com.example.bangiay.repository.ChuongTrinhGiamGiaChiTietHoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuongTrinhGiamGiaChiTietHoaDonService {
    @Autowired
    private ChuongTrinhGiamGiaChiTietHoaDonRepository repository;

    public List<ChuongTrinhGiamGiaChiTietHoaDon> getAll(){
        return repository.findAll();
    }
}
