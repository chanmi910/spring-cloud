package com.example.orderservice.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestOrder implements Serializable {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
}
