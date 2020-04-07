package com.minji.demo.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("===============");
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE transactionInform(date date , accountNum VARCHAR(50),  transactionNum VARCHAR(50), price int, fees int, isCanceled boolean)\n" +
                    "    AS SELECT * FROM CSVREAD('E:/minji/kakaopay/transactionInform.csv');";
            statement.executeUpdate(sql);

            sql = "CREATE TABLE accountInform(accountNum  VARCHAR(50),  accountName VARCHAR(50), managementCode VARCHAR(50))\n" +
                    "    AS SELECT * FROM CSVREAD('E:/minji/kakaopay/accountInform.csv');";
            statement.executeUpdate(sql);

            sql = "CREATE TABLE managementInform(managementCode VARCHAR(50), managementName VARCHAR(50))\n" +
                    "    AS SELECT * FROM CSVREAD('E:/minji/kakaopay/managementInform.csv');";
            statement.executeUpdate(sql);
        }
    }
}
