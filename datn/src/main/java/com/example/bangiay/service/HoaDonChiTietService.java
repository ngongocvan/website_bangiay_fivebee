package com.example.bangiay.service;

import com.example.bangiay.entity.HoaDonChiTiet;

import java.util.List;
import java.util.UUID;

public interface HoaDonChiTietService {
    public List<HoaDonChiTiet> getall();
    public HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet);
    HoaDonChiTiet update(HoaDonChiTiet hoaDonChiTiet, UUID id);
    HoaDonChiTiet deleteById(UUID id);
    public HoaDonChiTiet details(UUID id);
}
