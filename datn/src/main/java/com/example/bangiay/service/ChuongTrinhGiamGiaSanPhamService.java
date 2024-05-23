package com.example.bangiay.service;

import com.example.bangiay.entity.ChuongTrinhGiamGiaSanPham;

<<<<<<< HEAD
=======

>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
import java.util.List;
import java.util.UUID;

public interface ChuongTrinhGiamGiaSanPhamService {
<<<<<<< HEAD
    public List<ChuongTrinhGiamGiaSanPham> getall();
    public  ChuongTrinhGiamGiaSanPham add(ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham);
    ChuongTrinhGiamGiaSanPham update(ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham, UUID id);
    ChuongTrinhGiamGiaSanPham deleteById(UUID id);
    public ChuongTrinhGiamGiaSanPham details(UUID ID);
=======
    List<ChuongTrinhGiamGiaSanPham> getAll();
    public ChuongTrinhGiamGiaSanPham add(ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham);
    ChuongTrinhGiamGiaSanPham update(UUID id, ChuongTrinhGiamGiaSanPham chuongTrinhGiamGiaSanPham);
    ChuongTrinhGiamGiaSanPham deleteById(UUID id);
    public ChuongTrinhGiamGiaSanPham details(UUID id);
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
}
