package com.example.nbpinternshiptask.WebClient.TableA.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NbpApiTableADto {
private String currency;
private String code;
private String effectiveDate;
private double mid;


}
