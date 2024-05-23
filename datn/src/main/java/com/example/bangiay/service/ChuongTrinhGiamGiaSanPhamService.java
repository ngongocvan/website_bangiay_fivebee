package com.example.bangiay.service;

import com.example.bangiay.entity.ChuongTrinhGiamGiaSanPham;

import java.util.List;
import java.util.UUID;

public interface ChuongTrinhGiamGiaSanPhamService {
    public List<ChuongTrinhGiamGiaSanPham> getall();
    public  ChuongTrinhGiamGiaSanPham add(ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham);
    ChuongTrinhGiamGiaSanPham update(ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham, UUID id);
    ChuongTrinhGiamGiaSanPham deleteById(UUID id);
    public ChuongTrinhGiamGiaSanPham details(UUID ID);
}
