package com.example.nbpinternshiptask.Model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class TableADto {
        private String currency;
        private String code;
        private String effectiveDate;
        private double average;
}
