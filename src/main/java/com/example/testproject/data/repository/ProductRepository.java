package com.example.testproject.data.repository;

import com.example.testproject.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
    //JpaRepository에서 ProductEntity는 사용할 entity를 String은 pK의 형식을 적는 것이다.
}
