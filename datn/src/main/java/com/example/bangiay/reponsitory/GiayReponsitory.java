package com.example.bangiay.reponsitory;

import com.example.bangiay.entity.Giay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GiayReponsitory extends JpaRepository<Giay, UUID> {
}
