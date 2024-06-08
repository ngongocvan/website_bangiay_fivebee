package com.example.bangiay.service.implement;

import com.example.bangiay.entity.ChuongTrinhGiamGiaSanPham;
import com.example.bangiay.entity.GiayChiTiet;
import com.example.bangiay.entity.GioHangChiTiet;
import com.example.bangiay.repository.ChuongTrinhGiamGiaSanPhamRepository;
import com.example.bangiay.repository.GioHangChiTietRepository;
import com.example.bangiay.service.ChuongTrinhGiamGiaSanPhamService;
import com.example.bangiay.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GioHangChiTietServiceImpl implements GioHangChiTietService {
    @Autowired
    private GioHangChiTietRepository reponsitory;
    @Override
    public List<GioHangChiTiet> getAll() {
        return reponsitory.findAll();
    }

    @Override
    public GioHangChiTiet add(GioHangChiTiet gioHangChiTiet) {
        return reponsitory.save(gioHangChiTiet);
    }

    @Override
    public GioHangChiTiet update(UUID id, GioHangChiTiet gioHangChiTiet) {
        Optional<GioHangChiTiet> optional = reponsitory.findById(id);
        return optional.map(o ->{
            o.setGioHang(gioHangChiTiet.getGioHang());
            o.setTrangThai(gioHangChiTiet.getTrangThai());
            o.setGiayChiTiet(gioHangChiTiet.getGiayChiTiet());
            o.setGhiChu(gioHangChiTiet.getGhiChu());
            o.setSoLuong(gioHangChiTiet.getSoLuong());
            return reponsitory.save(o);
        }).orElse(null);
    }

    @Override
    public GioHangChiTiet deleteById(UUID id) {
        Optional<GioHangChiTiet> optional = reponsitory.findById(id);
        return optional.map( o ->{
            reponsitory.delete(o);
            return o;
        }).orElse(null);
    }

    @Override
    public GioHangChiTiet details(UUID id) {
        Optional<GioHangChiTiet> optional = reponsitory.findById(id);
        return optional.orElse(null);
    }


}
