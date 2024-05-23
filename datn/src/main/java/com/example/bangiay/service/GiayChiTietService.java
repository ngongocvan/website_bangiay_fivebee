package com.example.bangiay.service;

import com.example.bangiay.entity.GiayChiTiet;
<<<<<<< HEAD
=======
import com.example.bangiay.entity.KichCo;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa

import java.util.List;
import java.util.UUID;

public interface GiayChiTietService {
<<<<<<< HEAD
    public List<GiayChiTiet> getall();
    public GiayChiTiet add(GiayChiTiet giayChiTiet);
    GiayChiTiet update(GiayChiTiet giayChiTiet, UUID id);
=======
    List<GiayChiTiet> getAll();
    public GiayChiTiet add(GiayChiTiet giayChiTiet);
    GiayChiTiet update(UUID id, GiayChiTiet giayChiTiet);
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa
    GiayChiTiet deleteById(UUID id);
    public GiayChiTiet details(UUID id);
}
