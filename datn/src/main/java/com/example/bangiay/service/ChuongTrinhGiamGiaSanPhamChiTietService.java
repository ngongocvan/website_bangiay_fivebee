package com.example.bangiay.service;

import com.example.bangiay.entity.ChuongTrinhGiamGiaChiTietSanPham;

import java.util.List;
import java.util.UUID;

public interface ChuongTrinhGiamGiaSanPhamChiTietService {
<<<<<<< HEAD
    public List<ChuongTrinhGiamGiaChiTietSanPham> getall();
    public ChuongTrinhGiamGiaChiTietSanPham add(ChuongTrinhGiamGiaChiTietSanPham chuongTrinhGiamGiaChiTietSanPham);
    ChuongTrinhGiamGiaChiTietSanPham update(ChuongTrinhGiamGiaChiTietSanPham chuongTrinhGiamGiaChiTietSanPham , UUID id);
    ChuongTrinhGiamGiaChiTietSanPham deleteByID(UUID id);
=======
    List<ChuongTrinhGiamGiaChiTietSanPham> getAll();
    public ChuongTrinhGiamGiaChiTietSanPham add(ChuongTrinhGiamGiaChiTietSanPham chuongTrinhGiamGiaChiTietSanPham);
    ChuongTrinhGiamGiaChiTietSanPham update(UUID id, ChuongTrinhGiamGiaChiTietSanPham chuongTrinhGiamGiaChiTietSanPham);
    ChuongTrinhGiamGiaChiTietSanPham deleteById(UUID id);
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
    public ChuongTrinhGiamGiaChiTietSanPham details(UUID id);
}
