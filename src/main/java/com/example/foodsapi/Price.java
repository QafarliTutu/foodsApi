package com.example.foodsapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {
    Double price;
    Double discount;
}
