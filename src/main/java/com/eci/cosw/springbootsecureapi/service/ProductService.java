
package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Product;
import java.util.List;

/**
 * @author Juan Ortiz
 *
 */
public interface ProductService{

    List<Product> getProducts();

    Product getProductById( Long id );

    Product createProduct( Product product );


}