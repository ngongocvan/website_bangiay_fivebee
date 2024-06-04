package com.example.bangiay.service.implement;

import com.example.bangiay.entity.HoaDonChiTiet;
import com.example.bangiay.repository.HoaDonChiTietRepository;
import com.example.bangiay.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {
    @Autowired
    private HoaDonChiTietRepository repository;
    @Override
    public List<HoaDonChiTiet> getall() {
        return repository.findAll();
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
    public HoaDonChiTiet delete(UUID id) {
        return null;
    }

    @Override
    public HoaDonChiTiet details(UUID id) {
        return null;
    }
}
