package com.github.marcelomachadoxd.dsvendas.repositories;

import com.github.marcelomachadoxd.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
