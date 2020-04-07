package com.minji.demo.api.controller;

import com.minji.demo.api.vo.MaxPriceCustomDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {

    @GetMapping(value = "/maxPriceCustom")
    public MaxPriceCustomDTO maxPriceCustom(){

        MaxPriceCustomDTO maxPriceCustomDTO = new MaxPriceCustomDTO();

        return maxPriceCustomDTO;
    }
}
