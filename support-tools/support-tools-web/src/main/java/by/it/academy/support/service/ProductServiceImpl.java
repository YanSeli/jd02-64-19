package by.it.academy.support.service;

import by.it.academy.support.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final List<Product> products;

    public ProductServiceImpl() {
        products = new ArrayList<>();
        products.add(new Product(1l, "Product name 1", 10));
        products.add(new Product(2l, "Product name 2", 30));



    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public void addNewProduct(Product product) {
        products.add(product);
    }
}
