package com.example.foodsapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {

    Integer id;
    String title;
    String store;
    Price price;
    SoldCount soldCount;
    SalePercent salePercent;
    String description;
    String category;
    String populate;
    Image image;

}
