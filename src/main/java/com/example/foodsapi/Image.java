package com.example.foodsapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image {
    String imgFront;
    String imgBack;
}
