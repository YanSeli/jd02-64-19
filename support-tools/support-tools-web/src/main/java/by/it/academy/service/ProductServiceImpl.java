package by.it.academy.service;

import by.it.academy.staff.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private static final ProductService INSTANCE = new ProductServiceImpl();

    private final List<Product> products;

    private ProductServiceImpl() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Product name 1", 10.0));
        products.add(new Product(2L, "Product name 1", 30.0));
    }

    public static ProductService getService() {
        return INSTANCE;
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public void addNewProduct(Product product) {
        product.setId((long) products.size() + 1);
        products.add(product);
    }
}
