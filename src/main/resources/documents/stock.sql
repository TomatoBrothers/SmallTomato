CREATE TABLE `stock` (
  `id` int(11) NOT NULL,
  `code` varchar(6) NOT NULL COMMENT '股票编号',
  `name` varchar(6) CHARACTER SET cp1250 DEFAULT NULL COMMENT '股票名字',
  `opening` varchar(7) DEFAULT NULL COMMENT '今日开盘价',
  `yesterday_close` varchar(7) DEFAULT NULL COMMENT '昨日收盘价',
  `highest` varchar(7) DEFAULT NULL COMMENT '今日最高价',
  `lowest` varchar(7) DEFAULT NULL COMMENT '今日最低价',
  `total_volume` varchar(12) DEFAULT NULL COMMENT '总成交数量(股)',
  `total_limit` varchar(12) DEFAULT NULL COMMENT '总成交额',
  `buy_one_volume` varchar(7) DEFAULT NULL COMMENT '买一数量(股)',
  `buy_two_volume` varchar(7) DEFAULT NULL COMMENT '买二数量(股)',
  `buy_three_volume` varchar(7) DEFAULT NULL COMMENT '买三数量(股)',
  `buy_four_volume` varchar(7) DEFAULT NULL COMMENT '买四数量(股)',
  `buy_five_volume` varchar(7) DEFAULT NULL COMMENT '买五数量(股)',
  `buy_one_price` varchar(7) DEFAULT NULL COMMENT '买一价格',
  `buy_two_price` varchar(7) DEFAULT NULL COMMENT '买二价格',
  `buy_three_price` varchar(7) DEFAULT NULL COMMENT '买三价格',
  `buy_four_price` varchar(7) DEFAULT NULL COMMENT '买四价格',
  `buy_five_price` varchar(7) DEFAULT NULL COMMENT '买五价格',
  `sell_one_volume` varchar(7) DEFAULT NULL COMMENT '卖一数量(股)',
  `sell_two_volume` varchar(7) DEFAULT NULL COMMENT '卖二数量(股)',
  `sell_three_volume` varchar(7) DEFAULT NULL COMMENT '卖三数量(股)',
  `sell_four_volume` varchar(7) DEFAULT NULL COMMENT '卖四数量(股)',
  `sell_five_volume` varchar(7) DEFAULT NULL COMMENT '卖五数量(股)',
  `sell_one_price` varchar(7) DEFAULT NULL COMMENT '卖一报价',
  `sell_two_price` varchar(7) DEFAULT NULL COMMENT '卖二报价',
  `sell_three_price` varchar(7) DEFAULT NULL COMMENT '卖三报价',
  `sell_four_price` varchar(7) DEFAULT NULL COMMENT '卖四报价',
  `sell_five_price` varchar(7) DEFAULT NULL COMMENT '卖五报价',
  `date` varchar(10) NOT NULL COMMENT '股票日期',
  `time` varchar(8) DEFAULT NULL COMMENT '股票时间',
  `create_date` datetime DEFAULT NULL COMMENT '数据创建时间',
  PRIMARY KEY (`code`,`date`,`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `stock_list` (
  `id` int(11) NOT NULL,
  `stock_code` varchar(6) NOT NULL COMMENT '股票代码',
  `stock_name` varchar(8) DEFAULT NULL COMMENT '股票名字',
  PRIMARY KEY (`stock_code`,`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `smalltomato`.`stock` ADD COLUMN `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键id' FIRST, CHANGE `name` `name` VARCHAR(6) CHARSET cp1250 COLLATE cp1250_general_ci NOT NULL COMMENT '股票名字', CHANGE `opening` `opening` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '今日开盘价', CHANGE `yesterday_close` `yesterday_close` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '昨日收盘价', CHANGE `highest` `highest` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '今日最高价', CHANGE `lowest` `lowest` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '今日最低价', CHANGE `total_volume` `total_volume` VARCHAR(12) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '总成交数量(股)', CHANGE `total_limit` `total_limit` VARCHAR(12) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '总成交额', CHANGE `buy_one_volume` `buy_one_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买一数量(股)', CHANGE `buy_two_volume` `buy_two_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买二数量(股)', CHANGE `buy_three_volume` `buy_three_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买三数量(股)', CHANGE `buy_four_volume` `buy_four_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买四数量(股)', CHANGE `buy_five_volume` `buy_five_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买五数量(股)', CHANGE `buy_one_price` `buy_one_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买一价格', CHANGE `buy_two_price` `buy_two_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买二价格', CHANGE `buy_three_price` `buy_three_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买三价格', CHANGE `buy_four_price` `buy_four_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买四价格', CHANGE `buy_five_price` `buy_five_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '买五价格', CHANGE `sell_one_volume` `sell_one_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖一数量(股)', CHANGE `sell_two_volume` `sell_two_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖二数量(股)', CHANGE `sell_three_volume` `sell_three_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖三数量(股)', CHANGE `sell_four_volume` `sell_four_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖四数量(股)', CHANGE `sell_five_volume` `sell_five_volume` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖五数量(股)', CHANGE `sell_one_price` `sell_one_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖一报价', CHANGE `sell_two_price` `sell_two_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖二报价', CHANGE `sell_three_price` `sell_three_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖三报价', CHANGE `sell_four_price` `sell_four_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖四报价', CHANGE `sell_five_price` `sell_five_price` VARCHAR(7) CHARSET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '卖五报价', CHANGE `date` `date` VARCHAR(10) NOT NULL COMMENT '股票日期', CHANGE `time` `time` VARCHAR(8) NOT NULL COMMENT '股票时间', CHANGE `create_date` `create_date` DATETIME NOT NULL COMMENT '数据创建时间', DROP PRIMARY KEY, ADD PRIMARY KEY (`id`);
