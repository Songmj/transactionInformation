package com.minji.demo.api.dao;

import com.minji.demo.api.vo.MaxPriceCustomDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TransactionDAO {

    List<MaxPriceCustomDTO> selectTest();
}
