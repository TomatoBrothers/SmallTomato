package com.smalltomato.test;

import com.smalltomato.bean.Stock;
import com.smalltomato.service.StockService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by feiL on 2017/12/4.
 */
public class TestMain {

    private static final ApplicationContext CONTEXT;

    static {
        CONTEXT = new ClassPathXmlApplicationContext(
                new String[] { "classpath*:config/spring/applicationContext-datasource.xml",
                        "classpath*:config/spring/applicationContext-service.xml" });
    }

    public static void main(String[] args) throws Exception {
        StockService stockService = (StockService) CONTEXT.getBean("stockService");
        Stock stock = new Stock();
        stock.setCode("123");
        stock.setName("feiL");
        stock.setDate("2017");
        stockService.insert(stock);
    }
}
