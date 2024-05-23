package com.example.bangiay.service;

import com.example.bangiay.entity.ChuongTrinhGiamGiaChiTietSanPham;

import java.util.List;
import java.util.UUID;

public interface ChuongTrinhGiamGiaSanPhamChiTietService {
    public List<ChuongTrinhGiamGiaChiTietSanPham> getall();
    public ChuongTrinhGiamGiaChiTietSanPham add(ChuongTrinhGiamGiaChiTietSanPham chuongTrinhGiamGiaChiTietSanPham);
    ChuongTrinhGiamGiaChiTietSanPham update(ChuongTrinhGiamGiaChiTietSanPham chuongTrinhGiamGiaChiTietSanPham , UUID id);
    ChuongTrinhGiamGiaChiTietSanPham deleteByID(UUID id);
    public ChuongTrinhGiamGiaChiTietSanPham details(UUID id);
}
