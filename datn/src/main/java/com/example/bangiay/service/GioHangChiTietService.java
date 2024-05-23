package com.example.bangiay.service;

<<<<<<< HEAD
=======
import com.example.bangiay.entity.GiayChiTiet;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
import com.example.bangiay.entity.GioHangChiTiet;

import java.util.List;
import java.util.UUID;

public interface GioHangChiTietService {
<<<<<<< HEAD
    public List<GioHangChiTiet> getall();
    public  GioHangChiTiet add(GioHangChiTiet gioHangChiTiet);
    GioHangChiTiet update(GioHangChiTiet gioHangChiTiet, UUID id);
=======
    List<GioHangChiTiet> getAll();
    public GioHangChiTiet add(GioHangChiTiet gioHangChiTiet);
    GioHangChiTiet update(UUID id, GioHangChiTiet gioHangChiTiet);
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
    GioHangChiTiet deleteById(UUID id);
    public GioHangChiTiet details(UUID id);
}
