package com.appsdeveloperblog.ws.products.service;

import com.appsdeveloperblog.ws.products.rest.CreateProductDto;

public interface ProductService {
    String createProduct(CreateProductDto createProductDto) throws Exception;
}
