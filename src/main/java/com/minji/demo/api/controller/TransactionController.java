package com.minji.demo.api.controller;

import com.minji.demo.api.service.TransactionService;
import com.minji.demo.api.vo.MaxPriceCustomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    /**
     * 2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API
     * 취소 여부가 'Y' 거래는 취소된 거래, 합계 금액은 거래 금액애서 수수료를 차감한 금액
     * @return
     */
    @GetMapping(value = "/maxPriceCustom")
    public List<MaxPriceCustomDTO> maxPriceCustom(){

        return transactionService.selectTest();
    }


}
