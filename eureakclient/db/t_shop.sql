/*
Navicat MySQL Data Transfer

Source Server         : pjoc
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : paydb

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2018-12-04 20:21:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_shop
-- ----------------------------
DROP TABLE IF EXISTS `t_shop`;
CREATE TABLE `t_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `shop_name` varchar(255) NOT NULL COMMENT '商品名称',
  `price` varchar(20) NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shop
-- ----------------------------
INSERT INTO `t_shop` VALUES ('1', 'vovi x21 i 魅夜紫', '2399');
INSERT INTO `t_shop` VALUES ('2', '飞利浦 剃须刀', '80');
