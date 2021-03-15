package com.ugromart.productsms.repository;

import com.ugromart.productsms.models.Product;
import com.ugromart.productsms.models.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DatabaseInitializer implements CommandLineRunner {
    @Autowired
    VendorRespository vendorRespository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {
        Vendor vendor1 =new Vendor("Mukwaano");
        vendor1=vendorRespository.save(vendor1);
        Product product1=new Product("White Bar Soap","For washing", BigDecimal.valueOf(3500.00),vendor1);
        productRepository.save(product1);
        Product product2=new Product("Fortune Butto","For all your cooking needs", BigDecimal.valueOf(8300.00),vendor1);
        productRepository.save(product2);

        Vendor vendor2 =new Vendor("Uniliver");
        vendor2=vendorRespository.save(vendor2);
        Product product3=new Product("Blue Band","For all your bakery products", BigDecimal.valueOf(5000.00),vendor2);
        Product product4=new Product("Geisha","Kills all germs, with a nice body fresh smell", BigDecimal.valueOf(12000.00),vendor2);
        productRepository.save(product3);
        productRepository.save(product4);
    }
}
