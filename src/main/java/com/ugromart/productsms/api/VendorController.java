package com.ugromart.productsms.controllers;


import com.ugromart.productsms.models.Product;
import com.ugromart.productsms.models.Vendor;
import com.ugromart.productsms.repository.ProductRepository;
import com.ugromart.productsms.repository.VendorRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productsms")
public class VendorController {
    private static final Logger log = LoggerFactory.getLogger(VendorController.class);
    @Autowired
    private VendorRespository vendorRespository;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/vendors")
    public ResponseEntity<List<Vendor>> getVendors(){
        List<Vendor> response=vendorRespository.findAll();
        return ResponseEntity.ok().body(response);
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        List<Product> response=productRepository.findAll();
        return ResponseEntity.ok().body(response);
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "id") int id){
        Optional<Product> response=productRepository.findById(id);
        return ResponseEntity.ok().body(response.get());
    }
}
