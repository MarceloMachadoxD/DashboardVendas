package com.github.marcelomachadoxd.dsvendas.service;

import com.github.marcelomachadoxd.dsvendas.dto.SellerDTO;
import com.github.marcelomachadoxd.dsvendas.entities.Seller;
import com.github.marcelomachadoxd.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    @Transactional(readOnly = true)
    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();

        return result.stream().map( x -> new SellerDTO(x)).collect(Collectors.toList());

    }

}
