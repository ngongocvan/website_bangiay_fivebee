package com.example.bangiay.service;

import com.example.bangiay.entity.GiayChiTiet;

import java.util.List;
import java.util.UUID;

public interface GiayChiTietService {
    public List<GiayChiTiet> getall();
    public GiayChiTiet add(GiayChiTiet giayChiTiet);
    GiayChiTiet update(GiayChiTiet giayChiTiet, UUID id);
    GiayChiTiet deleteById(UUID id);
    public GiayChiTiet details(UUID id);
}
