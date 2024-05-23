package com.example.bangiay.service.impl;

import com.example.bangiay.entity.GiayChiTiet;
import com.example.bangiay.reponsitory.GiayChiTietReponsitory;
import com.example.bangiay.service.GiayChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class GiayChiTietServiceImpl implements GiayChiTietService {
    @Autowired
    private GiayChiTietReponsitory reponsitory;
    @Override
    public List<GiayChiTiet> getall() {
        return reponsitory.findAll();
    }

    @Override
    public GiayChiTiet add(GiayChiTiet giayChiTiet) {

        return reponsitory.save(giayChiTiet);
    }

    @Override
    public GiayChiTiet update(GiayChiTiet giayChiTiet, UUID id) {
        Optional<GiayChiTiet> optional = reponsitory.findById(id);
        return optional.map(o ->{
            o.setGiay(giayChiTiet.getGiay());
            o.setKichCo(giayChiTiet.getKichCo());
            o.setSoLuongTon(giayChiTiet.getSoLuongTon());
            o.setTrangThai(giayChiTiet.getTrangThai());
            return  reponsitory.save(o);
        }).orElse(null);
    }

    @Override
    public GiayChiTiet deleteById(UUID id) {
        Optional<GiayChiTiet> optional = reponsitory.findById(id);
        return optional.map(o ->{
            reponsitory.delete(o);
            return o;
        }).orElse(null);
    }

    @Override
    public GiayChiTiet details(UUID id) {
        Optional<GiayChiTiet> optional = reponsitory.findById(id);
        return optional.orElse(null);
    }
}
