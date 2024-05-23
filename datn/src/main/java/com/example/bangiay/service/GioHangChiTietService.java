package com.example.bangiay.service;

import com.example.bangiay.entity.GioHangChiTiet;

import java.util.List;
import java.util.UUID;

public interface GioHangChiTietService {
    public List<GioHangChiTiet> getall();
    public  GioHangChiTiet add(GioHangChiTiet gioHangChiTiet);
    GioHangChiTiet update(GioHangChiTiet gioHangChiTiet, UUID id);
    GioHangChiTiet deleteById(UUID id);
    public GioHangChiTiet details(UUID id);
}
