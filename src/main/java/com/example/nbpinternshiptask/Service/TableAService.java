package com.example.nbpinternshiptask.Service;


import com.example.nbpinternshiptask.Model.TableADto;
import com.example.nbpinternshiptask.WebClient.TableA.TableAClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class TableAService {
private final TableAClient tableAClient;
    public TableADto getTableA(){
       return tableAClient.getTableAForCurrencyAndDate("AUD", "2023-04-20");
    }


}
