package com.example.bangiay.reponsitory;

import com.example.bangiay.entity.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public interface GioHangController extends JpaRepository<GioHang, UUID> {
}
