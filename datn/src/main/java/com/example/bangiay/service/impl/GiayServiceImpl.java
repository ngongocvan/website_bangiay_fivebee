package com.example.bangiay.service.impl;

import com.example.bangiay.entity.Giay;
import com.example.bangiay.reponsitory.GiayReponsitory;
import com.example.bangiay.service.GiayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class GiayServiceImpl implements GiayService {
   @Autowired
   private GiayReponsitory reponsitory;
    @Override
    public List<Giay> getAll() {
        return reponsitory.findAll();
    }

    @Override
    public Giay add(Giay giay) {
        return reponsitory.save(giay);
    }

    @Override
    public Giay update(UUID id, Giay giay) {
        Optional<Giay> optional = reponsitory.findById(id);
        return optional.map(o -> {
            o.setMa(giay.getMa());
            o.setTen(giay.getTen());
            o.setMoTa(giay.getMoTa());
            o.setGiaNhap(giay.getGiaNhap());
            o.setGiaBan(giay.getGiaBan());
            o.setGiaSauKhuyenMai(giay.getGiaSauKhuyenMai());
            o.setDoHot(giay.getDoHot());
            o.setTrangThai(giay.getTrangThai());
            o.setThuongHieu(giay.getThuongHieu());
            o.setChatLieu(giay.getChatLieu());
            o.setDeGiay(giay.getDeGiay());
            o.setXuatXu(giay.getXuatXu());
            o.setKieuDang(giay.getKieuDang());
            o.setMauSac(giay.getMauSac());
            return reponsitory.save(o);
        }).orElse(null);
    }

    @Override
    public Giay deleteById(UUID id) {
        Optional<Giay> optional = reponsitory.findById(id);
        return optional.map(o ->{
            reponsitory.delete(o);
            return o;
        }).orElse(null);
    }

    @Override
    public Giay details(UUID id) {
        Optional<Giay> g = reponsitory.findById(id);
        return g.orElse(null);
    }
}
