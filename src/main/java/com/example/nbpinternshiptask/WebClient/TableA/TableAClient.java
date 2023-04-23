package com.example.nbpinternshiptask.WebClient.TableA;

import com.example.nbpinternshiptask.Model.TableADto;
import com.example.nbpinternshiptask.WebClient.TableA.dto.NbpApiTableADto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TableAClient {
    public static final String TABLEA_URL = "http://api.nbp.pl/api/exchangerates/rates/a/";
    private RestTemplate restTemplate = new RestTemplate();

    public TableADto getTableAForCurrencyAndDate(String currencyCode, String date){
        NbpApiTableADto nbpApiTableADto= callGetMethodTableA(NbpApiTableADto.class, currencyCode,date);
        return TableADto.builder()
                .average(nbpApiTableADto.getRates().stream().iterator().next().getMid())
                .currency(nbpApiTableADto.getCurrency())
                .effectiveDate(nbpApiTableADto.getRates().stream().iterator().next().getEffectiveDate())
                .code(nbpApiTableADto.getCode())
                .build();
    }
    private <T> T callGetMethodTableA(Class<T> responseType, Object... objects){
        return restTemplate.getForObject(TABLEA_URL + "{currencyCode}/{date}",responseType,objects);
    }
}