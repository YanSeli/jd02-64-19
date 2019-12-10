package by.it.academy.support.service;

import by.it.academy.support.model.Product;

import java.util.List;

public interface ProductService {

    /**
     * Gets all products
     *
     * @return list of found product
     */
    List<Product> getAllProducts();

    /**
     * Add new product
     * generates new Id
     *
     * @param product product to save
     */
    void addNewProduct(Product product);

}
