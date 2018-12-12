/*
Navicat MySQL Data Transfer

Source Server         : pjoc
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : paydb

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2018-12-12 16:02:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` varchar(225) NOT NULL COMMENT '订单编号',
  `user_id` varchar(225) NOT NULL COMMENT '用户编号',
  `shop_id` varchar(255) NOT NULL COMMENT '商品编号',
  `pay_status` varchar(1) NOT NULL COMMENT '订单状态  0：待支付 1:已支付 2：删除订单  ',
  `number` varchar(20) NOT NULL COMMENT '商品数量',
  `pay_type` varchar(255) NOT NULL COMMENT '支付类型',
  `sumPrice` varchar(255) NOT NULL COMMENT '总价格',
  `createDate` datetime DEFAULT NULL COMMENT '订单创建时间',
  `payTime` datetime DEFAULT NULL COMMENT '支付时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
