package com.heiyu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Card {
    private final String suit;
    private final int rank;
}
