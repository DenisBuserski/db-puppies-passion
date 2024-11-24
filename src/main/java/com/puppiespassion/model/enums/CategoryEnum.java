package com.puppiespassion.model.enums;

import lombok.Getter;

@Getter
public enum CategoryEnum {
    BAGS("Bags", "/images/categories/bags/dog-bags.jpg"),
    BEDS("Beds", "/images/categories/beds/dog-beds.jpg"),
    BOWLS("Bowls", "/images/categories/bowls/dog-bowls.jpg"),
    CLOTHES("Clothes", "/images/categories/clothes/dog-clothes.jpg"),
    COMBS("Combs", "/images/categories/combs/dog-combs.jpg"),
    JEWELRY("Jewelry", "/images/categories/jewelry/dog-jewelry.jpg"),
    LEASHES("Leashes", "/images/categories/leashes/dog-leashes.jpg"),
    TOYS("Toys", "/images/categories/toys/dog-toys.jpg");

    private final String name;
    private final String url;

    CategoryEnum(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
