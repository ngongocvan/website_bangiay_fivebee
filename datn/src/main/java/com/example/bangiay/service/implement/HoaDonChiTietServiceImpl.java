package com.example.bangiay.service.implement;

import com.example.bangiay.entity.HoaDonChiTiet;
import com.example.bangiay.repository.HoaDonChiTiepRepository;
import com.example.bangiay.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {
    @Autowired
    private HoaDonChiTiepRepository hoaDonChiTiepRepository;
    @Override
    public List<HoaDonChiTiet> getall() {
        return hoaDonChiTiepRepository.findAll();
    }

    @Override
    public HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet) {
        return null;
    }

    @Override
    public HoaDonChiTiet update(HoaDonChiTiet hoaDonChiTiet, UUID id) {
        return null;
    }

    @Override
    public HoaDonChiTiet deleteById(UUID id) {
        return null;
    }

    @Override
    public HoaDonChiTiet details(UUID id) {
        return null;
    }
}
