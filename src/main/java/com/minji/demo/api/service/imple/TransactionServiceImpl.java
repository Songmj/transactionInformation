package com.minji.demo.api.service.imple;

import com.minji.demo.api.dao.TransactionDAO;
import com.minji.demo.api.service.TransactionService;
import com.minji.demo.api.vo.MaxPriceCustomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionDAO transactionDAO;

    @Override
    public List<MaxPriceCustomDTO> selectTest() {
        return transactionDAO.selectTest();
    }
}
