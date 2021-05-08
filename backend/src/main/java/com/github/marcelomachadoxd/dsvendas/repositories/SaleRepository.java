package com.github.marcelomachadoxd.dsvendas.repositories;

import com.github.marcelomachadoxd.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
