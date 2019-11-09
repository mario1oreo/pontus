-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.4.8-MariaDB - mariadb.org binary distribution
-- 服务器OS:                        Win64
-- HeidiSQL 版本:                  10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for pontus
CREATE DATABASE IF NOT EXISTS `pontus` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pontus`;

-- Dumping structure for table pontus.base_address_info
CREATE TABLE IF NOT EXISTS `base_address_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `ADDRESS_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '地址编号',
  `ADDRESS_FULL` varchar(300) NOT NULL DEFAULT '' COMMENT '地址全称',
  `ADDRESS_ADDRESS` varchar(200) NOT NULL COMMENT '完整地址',
  `ADDRESS_PROVINCE` varchar(200) NOT NULL COMMENT '地址-省',
  `ADDRESS_CITY` varchar(200) NOT NULL COMMENT '地址-市',
  `ADDRESS_REGION` varchar(200) NOT NULL COMMENT '地址-区',
  `ADDRESS_STREET` varchar(200) NOT NULL COMMENT '地址-街道',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ADDRESS_ID` (`ADDRESS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table pontus.base_address_info: ~0 rows (大约)
/*!40000 ALTER TABLE `base_address_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `base_address_info` ENABLE KEYS */;

-- Dumping structure for table pontus.base_cust_info
CREATE TABLE IF NOT EXISTS `base_cust_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `CUST_ID` varchar(50) NOT NULL DEFAULT '' COMMENT '客户编号',
  `CUST_NAME` varchar(50) NOT NULL DEFAULT '' COMMENT '客户姓名',
  `CUST_PHONE_NUMBER` varchar(50) NOT NULL DEFAULT '' COMMENT '客户电话号码',
  `CUST_SEX` tinyint(4) NOT NULL DEFAULT 0 COMMENT '客户性别 0:女 1:男',
  `DESCRIPTION` varchar(200) NOT NULL DEFAULT '' COMMENT '客户备注信息',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `CUST_ID` (`CUST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table pontus.base_cust_info: ~0 rows (大约)
/*!40000 ALTER TABLE `base_cust_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `base_cust_info` ENABLE KEYS */;

-- Dumping structure for table pontus.bi_income_info
CREATE TABLE IF NOT EXISTS `bi_income_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRODUCT_ID` varchar(32) NOT NULL COMMENT '商品ID',
  `BATCH_NO` varchar(32) NOT NULL COMMENT '商品批次号',
  `PRODUCT_QUANTITY` decimal(10,2) NOT NULL DEFAULT 1.00 COMMENT '商品数量',
  `SALE_PRICE` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '出售价格',
  `COST_PRICE` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '成本价格',
  `EXPRESS_QUANTITY` decimal(10,2) NOT NULL DEFAULT 1.00 COMMENT '物流数量',
  `EXPRESS_FEE` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '物流费用，单位元',
  `NET_PROFIT` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '净利润',
  `PARTITION` date NOT NULL DEFAULT current_timestamp() COMMENT '日期分区',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='BI-收益日快照';

-- Dumping data for table pontus.bi_income_info: ~11 rows (大约)
/*!40000 ALTER TABLE `bi_income_info` DISABLE KEYS */;
INSERT INTO `bi_income_info` (`ID`, `PRODUCT_ID`, `BATCH_NO`, `PRODUCT_QUANTITY`, `SALE_PRICE`, `COST_PRICE`, `EXPRESS_QUANTITY`, `EXPRESS_FEE`, `NET_PROFIT`, `PARTITION`, `STATUS`, `CREATE_TIME`, `CREATE_BY`, `UPDATE_TIME`, `UPDATE_BY`) VALUES
	(1, '12341234', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:49:52', 'system'),
	(2, '12341234323', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:11', 'system'),
	(3, '1234123422', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:12', 'system'),
	(4, '12341234a', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:16', 'system'),
	(5, '11', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:14', 'system'),
	(6, '12341234e', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:21', 'system'),
	(7, '12341234q', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:19', 'system'),
	(8, 'q', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:18', 'system'),
	(9, '12341234r', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:22', 'system'),
	(10, 'e', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:24', 'system'),
	(11, 'g', '1234234', 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, '2019-06-27', '0', '2019-06-27 17:49:52', 'system', '2019-06-27 17:50:26', 'system');
/*!40000 ALTER TABLE `bi_income_info` ENABLE KEYS */;

-- Dumping structure for table pontus.bi_inventory_info
CREATE TABLE IF NOT EXISTS `bi_inventory_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRODUCT_ID` varchar(32) NOT NULL COMMENT '商品ID',
  `BATCH_NO` varchar(32) NOT NULL COMMENT '商品批次号',
  `PRODUCT_NAME` varchar(100) NOT NULL COMMENT '商品名称',
  `PRODUCT_UNIT` varchar(10) NOT NULL COMMENT '产品规格单位',
  `PRODUCT_QUANTITY` decimal(10,2) NOT NULL DEFAULT 1.00 COMMENT '商品数量',
  `PARTITION` date NOT NULL DEFAULT current_timestamp() COMMENT '日期分区',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='BI-库存日快照';

-- Dumping data for table pontus.bi_inventory_info: ~9 rows (大约)
/*!40000 ALTER TABLE `bi_inventory_info` DISABLE KEYS */;
INSERT INTO `bi_inventory_info` (`ID`, `PRODUCT_ID`, `BATCH_NO`, `PRODUCT_NAME`, `PRODUCT_UNIT`, `PRODUCT_QUANTITY`, `PARTITION`, `STATUS`, `CREATE_TIME`, `CREATE_BY`, `UPDATE_TIME`, `UPDATE_BY`) VALUES
	(1, 'aaas', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:20', 'system'),
	(2, 'aaas1', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:30', 'system'),
	(3, '9', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:45', 'system'),
	(4, 'aaas2', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:33', 'system'),
	(5, 'aaas3', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:35', 'system'),
	(6, 'aaas5', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:37', 'system'),
	(7, '6', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:39', 'system'),
	(8, 'aaas7', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:41', 'system'),
	(9, 'aaas8', 'ddfs', 'swerw', 'ad', 1.00, '2019-06-27', '0', '2019-06-27 18:10:20', 'system', '2019-06-27 18:10:43', 'system');
/*!40000 ALTER TABLE `bi_inventory_info` ENABLE KEYS */;

-- Dumping structure for table pontus.conf_product_category
CREATE TABLE IF NOT EXISTS `conf_product_category` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRODUCT_CATEGORY_ID` varchar(20) NOT NULL COMMENT '产品类别ID',
  `PRODUCT_CATEGORY_CODE` varchar(20) NOT NULL COMMENT '产品类别编码',
  `PRODUCT_CATEGORY_NAME` varchar(100) NOT NULL COMMENT '产品类别名称',
  `PRODUCT_CATEGORY_LEVEL` tinyint(4) NOT NULL DEFAULT 1 COMMENT '产品类别级别 1 2 3',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `PRODUCT_CATEGORY_ID` (`PRODUCT_CATEGORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品类别配置表';

-- Dumping data for table pontus.conf_product_category: ~19 rows (大约)
/*!40000 ALTER TABLE `conf_product_category` DISABLE KEYS */;
INSERT INTO `conf_product_category` (`ID`, `PRODUCT_CATEGORY_ID`, `PRODUCT_CATEGORY_CODE`, `PRODUCT_CATEGORY_NAME`, `PRODUCT_CATEGORY_LEVEL`, `STATUS`, `CREATE_TIME`, `CREATE_BY`, `UPDATE_TIME`, `UPDATE_BY`) VALUES
	(1, 'MATRL', 'MATERIAL', '原料', 1, '0', '2019-07-08 17:36:27', 'system', '2019-11-10 00:11:15', 'system'),
	(2, 'PROC', 'PROCESS', '加工', 1, '0', '2019-07-08 17:42:48', 'system', '2019-11-10 00:08:59', 'system'),
	(3, 'SMPRDT', 'SEMI-PRODUCT', '半成品', 1, '0', '2019-07-08 17:43:05', 'system', '2019-11-10 00:08:59', 'system'),
	(4, 'PRDT', 'PRODUCT', '成品', 1, '0', '2019-07-08 17:43:05', 'system', '2019-11-10 00:08:59', 'system'),
	(5, 'PLLW', 'PILLOW', '枕头', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(6, 'BLNKT', 'BLANKET', '毛毯', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(7, 'TWL', 'TOWEL', '毛巾', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(8, 'BTHTWL', 'BATH TOWEL', '浴巾', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(9, 'SCRF', 'SCARF', '方巾', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(10, 'MTRS', 'MATTRESS', '床垫', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(11, 'MAT', 'MAT', '凉席', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(12, 'SHETS', 'SHEETS', '床单', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(13, 'QLT', 'QUILT', '被子', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(14, 'BTHRB', 'BATHROBE', '浴袍', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(15, 'APRN', 'APRON', '围裙', 2, '0', '2019-07-08 17:43:06', 'system', '2019-11-10 00:08:01', 'system'),
	(16, 'SLPRS', 'SLIPPERS', '拖鞋', 2, '0', '2019-07-08 17:43:07', 'system', '2019-11-10 00:08:01', 'system'),
	(17, 'GZ', 'GAUZE', '纱线', 2, '0', '2019-07-08 17:43:07', 'system', '2019-11-10 00:08:01', 'system'),
	(18, '3PST', 'THREE-PIECE SUIT', '三件套', 2, '0', '2019-07-08 17:43:07', 'system', '2019-11-10 00:08:01', 'system'),
	(19, '4PST', 'FOUR-PIECE SUIT', '四件套', 2, '0', '2019-07-08 17:43:07', 'system', '2019-11-10 00:08:01', 'system');
/*!40000 ALTER TABLE `conf_product_category` ENABLE KEYS */;

-- Dumping structure for table pontus.conf_product_colour
CREATE TABLE IF NOT EXISTS `conf_product_colour` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `FORMAT_COLOUR_ID` int(11) NOT NULL DEFAULT 0 COMMENT '颜色ID',
  `FORMAT_COLOUR_CODE` varchar(7) NOT NULL DEFAULT '#ff0000' COMMENT '颜色色号编码 RGB色号 #开头',
  `FORMAT_COLOUR_NAME` varchar(20) NOT NULL DEFAULT '红色' COMMENT '颜色名称',
  `FORMAT_COLOUR_CLASS` varchar(20) NOT NULL DEFAULT 'RED' COMMENT '颜色类别 英文命名',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `FORMAT_COLOUR_ID` (`FORMAT_COLOUR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品颜色配置表';

-- Dumping data for table pontus.conf_product_colour: ~0 rows (大约)
/*!40000 ALTER TABLE `conf_product_colour` DISABLE KEYS */;
/*!40000 ALTER TABLE `conf_product_colour` ENABLE KEYS */;

-- Dumping structure for table pontus.conf_product_format
CREATE TABLE IF NOT EXISTS `conf_product_format` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `FORMAT_ID` tinyint(4) NOT NULL DEFAULT 100 COMMENT '规格ID',
  `FORMAT_CODE` varchar(50) NOT NULL DEFAULT '' COMMENT '规格编号',
  `FORMAT_LENGTH` mediumint(9) NOT NULL DEFAULT 100 COMMENT '规格长度,单位:毫米 mm',
  `FORMAT_WIDTH` mediumint(9) NOT NULL DEFAULT 100 COMMENT '规格宽度,单位:毫米 mm',
  `FORMAT_HEIGHT` mediumint(9) NOT NULL DEFAULT 100 COMMENT '规格高度,单位:毫米 mm',
  `FORMAT_WEIGHT` int(11) NOT NULL DEFAULT 100 COMMENT '规格重量,单位:克 g',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `FORMAT_ID` (`FORMAT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品规格配置表';

-- Dumping data for table pontus.conf_product_format: ~0 rows (大约)
/*!40000 ALTER TABLE `conf_product_format` DISABLE KEYS */;
/*!40000 ALTER TABLE `conf_product_format` ENABLE KEYS */;

-- Dumping structure for table pontus.conf_product_size
CREATE TABLE IF NOT EXISTS `conf_product_size` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `FORMAT_SIZE_ID` tinyint(4) NOT NULL DEFAULT 0 COMMENT '尺码ID',
  `FORMAT_SIZE_CODE` varchar(6) NOT NULL DEFAULT '' COMMENT '尺寸码 鞋子EUR 欧码  衣服标准码 ',
  `FORMAT_SIZE_NAME` varchar(20) NOT NULL DEFAULT '通码' COMMENT '尺码名称',
  `FORMAT_SIZE_CLASS` varchar(20) NOT NULL DEFAULT 'shose' COMMENT '尺码类型  鞋子 欧码',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `FORMAT_SIZE_ID` (`FORMAT_SIZE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品尺寸配置表';

-- Dumping data for table pontus.conf_product_size: ~0 rows (大约)
/*!40000 ALTER TABLE `conf_product_size` DISABLE KEYS */;
/*!40000 ALTER TABLE `conf_product_size` ENABLE KEYS */;

-- Dumping structure for table pontus.conf_voucher_type
CREATE TABLE IF NOT EXISTS `conf_voucher_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `VOUCHER_TYPE` tinyint(4) NOT NULL DEFAULT 1 COMMENT '凭证类型',
  `VOUCHER_TYPE_MEMO` varchar(100) DEFAULT NULL COMMENT '凭证类型说明',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `VOUCHER_TYPE` (`VOUCHER_TYPE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单类型表';

-- Dumping data for table pontus.conf_voucher_type: ~0 rows (大约)
/*!40000 ALTER TABLE `conf_voucher_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `conf_voucher_type` ENABLE KEYS */;

-- Dumping structure for table pontus.prd_express_info
CREATE TABLE IF NOT EXISTS `prd_express_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `VOUCHER_ID` varchar(32) NOT NULL COMMENT '订单凭证流水编号',
  `EXPRESS_ID` varchar(32) NOT NULL COMMENT '物流信息号',
  `EXPRESS_COMPANY` varchar(50) NOT NULL COMMENT '物流公司名称',
  `SENDER_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '发货日期',
  `RECEIVE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '送达日期',
  `EXPRESS_COST_TIME` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '物流耗时,单位：小时',
  `EXPRESS_FEE` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '物流费用,单位：元RMB',
  `RECEIVE_PERSON_NAME` varchar(200) NOT NULL COMMENT '收件人姓名',
  `RECEIVE_PHONE_NUMBER` varchar(200) NOT NULL COMMENT '收件人电话号码',
  `RECEIVE_ADDRESS` varchar(200) NOT NULL COMMENT '收货完整地址',
  `RECEIVE_PROVINCE` varchar(200) NOT NULL COMMENT '收货地址-省',
  `RECEIVE_CITY` varchar(200) NOT NULL COMMENT '收货地址-市',
  `RECEIVE_REGION` varchar(200) NOT NULL COMMENT '收货地址-区',
  `RECEIVE_STREET` varchar(200) NOT NULL COMMENT '收货地址-街道',
  `SENDER_PERSON_NAME` varchar(200) NOT NULL COMMENT '发件人姓名',
  `SENDER_PHONE_NUMBER` varchar(200) NOT NULL COMMENT '发件人电话号码',
  `SENDER_ADDRESS` varchar(200) NOT NULL COMMENT '发货完整地址',
  `SENDER_PROVINCE` varchar(200) NOT NULL COMMENT '发货地址-省',
  `SENDER_CITY` varchar(200) NOT NULL COMMENT '发货地址-市',
  `SENDER_REGION` varchar(200) NOT NULL COMMENT '发货地址-区',
  `SENDER_STREET` varchar(200) NOT NULL COMMENT '发货地址-街道',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物流信息表';

-- Dumping data for table pontus.prd_express_info: ~0 rows (大约)
/*!40000 ALTER TABLE `prd_express_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `prd_express_info` ENABLE KEYS */;

-- Dumping structure for table pontus.prd_inventory_changing_info
CREATE TABLE IF NOT EXISTS `prd_inventory_changing_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `VOUCHER_ID` varchar(32) NOT NULL COMMENT '订单凭证流水编号',
  `PRODUCT_ID` varchar(32) NOT NULL COMMENT '商品ID',
  `BATCH_NO` varchar(32) NOT NULL COMMENT '商品批次号',
  `PRODUCT_NAME` varchar(100) NOT NULL COMMENT '商品名称',
  `PRODUCT_UNIT` varchar(10) NOT NULL COMMENT '产品规格单位',
  `PRODUCT_QUANTITY` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '商品数量,增加库存正数，减少库存负数',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `VOUCHER_ID` (`VOUCHER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库存变更信息表';

-- Dumping data for table pontus.prd_inventory_changing_info: ~0 rows (大约)
/*!40000 ALTER TABLE `prd_inventory_changing_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `prd_inventory_changing_info` ENABLE KEYS */;

-- Dumping structure for table pontus.prd_inventory_info
CREATE TABLE IF NOT EXISTS `prd_inventory_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRODUCT_ID` varchar(32) NOT NULL COMMENT '商品ID',
  `BATCH_NO` varchar(32) NOT NULL DEFAULT '0' COMMENT '商品批次号',
  `PRODUCT_NAME` varchar(100) NOT NULL COMMENT '商品名称',
  `PRODUCT_UNIT` varchar(10) NOT NULL COMMENT '产品规格单位',
  `PRODUCT_QUANTITY` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '商品数量',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `PRODUCT_ID` (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库存信息表';

-- Dumping data for table pontus.prd_inventory_info: ~0 rows (大约)
/*!40000 ALTER TABLE `prd_inventory_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `prd_inventory_info` ENABLE KEYS */;

-- Dumping structure for table pontus.prd_product_info
CREATE TABLE IF NOT EXISTS `prd_product_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `BAR_CODE` varchar(50) NOT NULL COMMENT '条形码',
  `PRODUCT_ID` varchar(32) NOT NULL COMMENT '商品ID',
  `PRODUCT_NAME` varchar(100) NOT NULL COMMENT '商品名称',
  `PRODUCT_CATEGORY_ONE` varchar(20) NOT NULL COMMENT '商品类别:一级',
  `PRODUCT_CATEGORY_TWO` varchar(20) NOT NULL COMMENT '商品类别:二级',
  `PRODUCT_UNIT` varchar(10) NOT NULL COMMENT '产品度量单位',
  `DESCRIPTION` varchar(400) NOT NULL DEFAULT '' COMMENT '商品描述信息',
  `FORMAT_COLOUR_ID` int(11) NOT NULL DEFAULT 0 COMMENT '产品颜色',
  `FORMAT_SIZE_ID` tinyint(4) NOT NULL DEFAULT 0 COMMENT '产品尺码',
  `FORMAT_ID` tinyint(4) NOT NULL DEFAULT 0 COMMENT '产品规格',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(50) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(50) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `PRODUCT_ID` (`PRODUCT_ID`),
  UNIQUE KEY `BAR_CODE` (`BAR_CODE`,`STATUS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息表';

-- Dumping data for table pontus.prd_product_info: ~0 rows (大约)
/*!40000 ALTER TABLE `prd_product_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `prd_product_info` ENABLE KEYS */;

-- Dumping structure for table pontus.prd_product_price_info
CREATE TABLE IF NOT EXISTS `prd_product_price_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `PRODUCT_ID` varchar(32) NOT NULL COMMENT '商品ID',
  `BATCH_NO` int(11) NOT NULL DEFAULT 0 COMMENT '商品批次号',
  `BUY_PRICE` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '采购价格',
  `SALE_PRICE` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '出售价格',
  `COST_PRICE` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '成本价格',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品价格表';

-- Dumping data for table pontus.prd_product_price_info: ~0 rows (大约)
/*!40000 ALTER TABLE `prd_product_price_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `prd_product_price_info` ENABLE KEYS */;

-- Dumping structure for table pontus.prd_voucher_info
CREATE TABLE IF NOT EXISTS `prd_voucher_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `VOUCHER_ID` varchar(32) NOT NULL COMMENT '订单凭证流水编号',
  `VOUCHER_TYPE` tinyint(4) NOT NULL DEFAULT 1 COMMENT '凭证类型',
  `VOUCHER_AMOUNT` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '凭证金额',
  `VOUCHER_REAL_AMOUNT` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '实付金额',
  `INVOICE_DEMAND` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否需要发票：0：不需要   1：需要',
  `INVOICE_RATE` decimal(10,4) NOT NULL DEFAULT 0.0000 COMMENT '发票税率',
  `INVOICE_AMOUNT` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '发票金额',
  `INVOICE_NO` varchar(64) DEFAULT NULL COMMENT '发票号',
  `TRANSATION_TYPE` tinyint(4) NOT NULL DEFAULT 1 COMMENT '交易类型：0:支出   1:收入',
  `TRANSATION_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '交易时间',
  `PRODUCT_ID` varchar(32) NOT NULL COMMENT '商品ID',
  `BATCH_NO` int(11) NOT NULL DEFAULT 0 COMMENT '商品批次号',
  `PRODUCT_QUANTITY` decimal(10,2) NOT NULL DEFAULT 1.00 COMMENT '商品数量',
  `CHANNEL` varchar(50) NOT NULL DEFAULT '线下门店' COMMENT '销售渠道',
  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '状态：0：正常   1：作废',
  `CREATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `CREATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '创建者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `UPDATE_BY` varchar(20) NOT NULL DEFAULT 'system' COMMENT '更新者',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `VOUCHER_ID` (`VOUCHER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单交易流水表';

-- Dumping data for table pontus.prd_voucher_info: ~7 rows (大约)
/*!40000 ALTER TABLE `prd_voucher_info` DISABLE KEYS */;
INSERT INTO `prd_voucher_info` (`ID`, `VOUCHER_ID`, `VOUCHER_TYPE`, `VOUCHER_AMOUNT`, `VOUCHER_REAL_AMOUNT`, `INVOICE_DEMAND`, `INVOICE_RATE`, `INVOICE_AMOUNT`, `INVOICE_NO`, `TRANSATION_TYPE`, `TRANSATION_TIME`, `PRODUCT_ID`, `BATCH_NO`, `PRODUCT_QUANTITY`, `CHANNEL`, `STATUS`, `CREATE_TIME`, `CREATE_BY`, `UPDATE_TIME`, `UPDATE_BY`) VALUES
	(1, '11111', 0, 0.00, 0.00, 0, 0.0000, 0.00, NULL, 0, '2019-06-28 15:22:45', '1', 1, 1.00, '线下门店', '0', '2019-06-28 15:22:54', 'system', '2019-06-28 15:22:54', 'system'),
	(2, '111112', 0, 0.00, 0.00, 0, 0.0000, 0.00, NULL, 0, '2019-06-28 15:22:45', '1', 1, 1.00, '线下门店', '0', '2019-06-28 15:22:54', 'system', '2019-06-28 15:23:04', 'system'),
	(3, '111113', 0, 0.00, 0.00, 0, 0.0000, 0.00, NULL, 0, '2019-06-28 15:22:45', '1', 1, 1.00, '线下门店', '0', '2019-06-28 15:22:54', 'system', '2019-06-28 15:23:06', 'system'),
	(4, '111114', 0, 0.00, 0.00, 0, 0.0000, 0.00, NULL, 0, '2019-06-28 15:22:45', '1', 1, 1.00, '线下门店', '0', '2019-06-28 15:22:54', 'system', '2019-06-28 15:23:07', 'system'),
	(5, '111115', 0, 0.00, 0.00, 0, 0.0000, 0.00, NULL, 0, '2019-06-28 15:22:45', '1', 1, 1.00, '线下门店', '0', '2019-06-28 15:22:54', 'system', '2019-06-28 15:23:08', 'system'),
	(6, '111116', 0, 0.00, 0.00, 0, 0.0000, 0.00, NULL, 0, '2019-06-28 15:22:45', '1', 1, 1.00, '线下门店', '0', '2019-06-28 15:22:54', 'system', '2019-06-28 15:23:09', 'system'),
	(7, '111117', 0, 0.00, 0.00, 0, 0.0000, 0.00, NULL, 0, '2019-06-28 15:22:45', '1', 1, 1.00, '线下门店', '0', '2019-06-28 15:22:54', 'system', '2019-06-28 15:23:11', 'system');
/*!40000 ALTER TABLE `prd_voucher_info` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
