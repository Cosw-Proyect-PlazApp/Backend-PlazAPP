package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Product;
import com.eci.cosw.springbootsecureapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.ServletException;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping( "api" )
public class ProductController {

    @Autowired
    public ProductService productService = null;



    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    public Product getProduct(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/products", method = RequestMethod.GET )
    public List<Product> getProduct() {
        return productService.getProducts();
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/product", method = RequestMethod.POST )
    public void addProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }






}
