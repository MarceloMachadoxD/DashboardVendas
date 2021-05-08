package com.github.marcelomachadoxd.dsvendas.repositories;

import com.github.marcelomachadoxd.dsvendas.dto.SaleSuccessDTO;
import com.github.marcelomachadoxd.dsvendas.dto.SaleSumDTO;
import com.github.marcelomachadoxd.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.github.marcelomachadoxd.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
        " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.github.marcelomachadoxd.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
        " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();

}
