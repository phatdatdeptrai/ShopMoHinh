package com.example.ShopMoHinh.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "price",nullable = false)
    private double price;

    @Column(name = "number_of_product",nullable = false)
    private int numberOfProducts;

    @Column(name = "total_money",nullable = false)
    private Float totalMoney;


}
