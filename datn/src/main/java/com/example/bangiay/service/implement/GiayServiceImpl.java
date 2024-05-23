package com.example.bangiay.service.implement;

import com.example.bangiay.entity.Giay;
import com.example.bangiay.repository.GiayRepository;
import com.example.bangiay.service.GiayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GiayServiceImpl implements GiayService {

    @Autowired
    private GiayRepository giayRepository;

    @Override
    public List<Giay> getAll() {
        return giayRepository.findAll();
    }

    @Override
    public Giay add(Giay giay) {
        return giayRepository.save(giay);
    }

    @Override
    public Giay update(UUID id, Giay gg) {
        Optional<Giay> optional = giayRepository.findById(id);
        return optional.map(o -> {
            o.setMa(gg.getMa());
            o.setTen(gg.getTen());
            o.setMoTa(gg.getMoTa());
            o.setGiaNhap(gg.getGiaNhap());
            o.setGiaBan(gg.getGiaBan());
            o.setGiaSauKhuyenMai(gg.getGiaSauKhuyenMai());
            o.setDoHot(gg.getDoHot());
            o.setTrangThai(gg.getTrangThai());
            o.setThuongHieu(gg.getThuongHieu());
            o.setChatLieu(gg.getChatLieu());
            o.setDeGiay(gg.getDeGiay());
            o.setXuatXu(gg.getXuatXu());
            o.setKieuDang(gg.getKieuDang());
            o.setMauSac(gg.getMauSac());
            return giayRepository.save(o);
        }).orElse(null);
    }

    @Override
    public Giay deleteById(UUID id) {
        Optional<Giay> optional = giayRepository.findById(id);
        return optional.map(o -> {
            giayRepository.delete(o);
            return o;
        }).orElse(null);
    }

    @Override
    public Giay details(UUID id) {
        Optional<Giay> ag = giayRepository.findById(id);
        return ag.orElse(null);
    }
}
