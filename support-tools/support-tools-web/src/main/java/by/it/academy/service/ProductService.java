package by.it.academy.service;

import by.it.academy.staff.Staff;

import java.util.List;

/**
 * Product service
 */
public interface ProductService {

    /**
     * Gets all products
     *
     * @return list of found product
     */
    List<Staff> getAllProducts();

    /**
     * Add new product
     * generates new Id
     *
     * @param product product to save
     */
    void addNewProduct(Staff product);

}
