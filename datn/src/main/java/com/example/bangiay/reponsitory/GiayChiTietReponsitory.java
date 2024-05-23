package com.example.bangiay.reponsitory;

import com.example.bangiay.entity.GiayChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GiayChiTietReponsitory extends JpaRepository<GiayChiTiet, UUID> {
}
