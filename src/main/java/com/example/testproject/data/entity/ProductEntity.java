package com.example.testproject.data.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") //Database에서 어떤 table과 mapping되는지 확인
public class ProductEntity {

    @Id //SQL에서 PK를 의미하는게 @Id
    String productId;

    String productName;

    Integer productPrice;

    Integer productStock;
}
