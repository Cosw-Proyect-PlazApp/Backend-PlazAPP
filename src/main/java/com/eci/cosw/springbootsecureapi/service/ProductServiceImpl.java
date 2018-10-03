package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl
        implements ProductService {

    private List<Product> products = new ArrayList<>();

    @Autowired
    public ProductServiceImpl(){

    }

    @PostConstruct
    private void populateSampleData(){ products.add(new Product(
            15,
            3000,
            "Fresa",
            "Esta bonita, grande, con buen color, rica"
    ));
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        return products.get(0);
    }

    @Override
    public Product createProduct(Product product) {
        return product;
    }
}
