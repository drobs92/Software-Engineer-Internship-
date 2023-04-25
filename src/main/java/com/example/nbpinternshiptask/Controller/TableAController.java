package com.example.nbpinternshiptask.Controller;

import com.example.nbpinternshiptask.Model.TableADto;
import com.example.nbpinternshiptask.Service.TableAService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TableAController {
private final TableAService tableAService;

@GetMapping("/tableA-average")
    public TableADto getTableA(){
    return tableAService.getTableA();
}
@PostMapping("/tableAInput")
    public TableADto getDataAndCurrencyCode(){
    return null;//todo take data from user
}
}
