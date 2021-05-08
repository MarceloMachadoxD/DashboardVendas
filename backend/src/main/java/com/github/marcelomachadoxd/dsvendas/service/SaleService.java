package com.github.marcelomachadoxd.dsvendas.service;

import com.github.marcelomachadoxd.dsvendas.dto.SaleDTO;
import com.github.marcelomachadoxd.dsvendas.dto.SellerDTO;
import com.github.marcelomachadoxd.dsvendas.entities.Sale;
import com.github.marcelomachadoxd.dsvendas.entities.Seller;
import com.github.marcelomachadoxd.dsvendas.repositories.SaleRepository;
import com.github.marcelomachadoxd.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private  SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll(); //evitar consultas repetidas para cada seller pelo Hibernate

        Page<Sale> result = repository.findAll(pageable);

        return result.map( x -> new SaleDTO(x));

    }

}
