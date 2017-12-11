package com.smalltomato.controller;

import com.smalltomato.bean.StockList;
import com.smalltomato.service.StockListService;
import com.smalltomato.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author WangShiChong
 * @ Create Time: 2017/12/4/0004 23:54
 */
@Controller
@RequestMapping("updateCodeList")
public class UpdateCodeListController {

    private final static String URL = "http://quote.eastmoney.com/stock_list.html";
    private final static String REG_EX = ">[a-zA-Z0-9\\u4E00-\\u9FA5]*[()0-9]{8}<";
    private final static Pattern PATTERN = Pattern.compile(REG_EX);

    @Autowired
    private StockListService stockListService;

    @RequestMapping("/update")
    @ResponseBody
    public String updateCodeList() {
        try {
            this.getDataFromInternet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "操作完成！";
    }

    /**
     * 获取所有的股票代码
     * 基础数据
     * @throws Exception 插入数据报错
     */
    private void getDataFromInternet() throws Exception {
        List<String> list = new ArrayList<String>();
        String str = HttpUtil.get(URL);
        Matcher m = PATTERN.matcher(str);
        while (m.find()){
            String group = m.group();
            group = group.substring(1,group.length()-1);
            list.add(group);
        }
        Set<String> allStockCode = stockListService.getAllStockCode();
        for (String s : list) {
            String stockCode = s.substring(s.indexOf("(")+1,s.length()-1);
            if (allStockCode.contains(stockCode))
                continue;
            String stockName = s.substring(0,s.indexOf("("));
            StockList record = new StockList();
            record.setStockCode(stockCode);
            record.setStockName(stockName);
            stockListService.insert(record);
        }
    }
}
