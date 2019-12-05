package by.it.academy.support.model;

import by.it.academy.support.service.ProductService;
import by.it.academy.support.service.ProductServiceImpl;

public class ProductServiceFabric {

    private ProductService productService;

    public ProductService getService(){
        if (productService != null){
            return productService;
        }else {
            productService = new ProductServiceImpl();
            return productService;
        }

    }
}
