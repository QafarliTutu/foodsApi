package com.example.foodsapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SalePercent {
    Integer percent;
    String percentBColor;
    String stock;
    String stockTime;
}
