package com.example.testproject.data.dao.impl;

import com.example.testproject.data.dao.ProductDAO;
import com.example.testproject.data.entity.ProductEntity;
import com.example.testproject.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired //자동으로 연결해주는 어노테이션, DI 의존성 주입
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        ProductEntity productEntity = productRepository.getById(productId);
        return productEntity;
    }
}
