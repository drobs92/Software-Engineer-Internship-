package com.example.nbpinternshiptask.WebClient.TableA.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NbpApiTableADto {
    private String currency;
    private String code;
private Set<NbpApiTableARates> rates;



}
