package com.minji.demo.api.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MaxPriceCustomDTO {
    /**
     * 거래 연도
     */
    private int year = 0;
    /**
     * 계좌명
     */
    private String name = "";
    /**
     * 계좌 번호
     */
    private String acctNo = "";
    /**
     * 거래 금액
     */
    private int sumAmt = 0;
}
