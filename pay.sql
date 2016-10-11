/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : pay

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-11 18:17:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `name` varchar(255) NOT NULL,
  `hobby` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `num` int(11) DEFAULT NULL,
  KEY `num` (`num`) USING BTREE,
  KEY `index_name` (`age`,`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('ryx', '游泳', '4', '3');
INSERT INTO `test` VALUES ('fdd', '跑步', '5', '4');
INSERT INTO `test` VALUES ('fds', '足球', '7', '6');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL COMMENT 'id主键 32位UUID',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '名字',
  `phone` varchar(11) NOT NULL COMMENT '手机号码 11位',
  `pwd` varchar(64) NOT NULL DEFAULT '' COMMENT '密码 64MD5',
  `sex` int(11) NOT NULL DEFAULT '0' COMMENT '未定：0，男：1，女：2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('032f4e2afb4c4394b817ef088c032617', '13262', '18957141080', 'E10ADC3949BA59ABBE56E057F20F883E', '0');
INSERT INTO `user` VALUES ('032f4e2afb4c4394b817ef088c032618', '13263', '18888888832', 'E10ADC3949BA59ABBE56E057F20F883E', '0');
INSERT INTO `user` VALUES ('1d7f2c9d21e448398c363188024ffcde', 'zhangsan', '18957141082', 'E10ADC3949BA59ABBE56E057F20F883E', '0');
INSERT INTO `user` VALUES ('1efc9c9a93584b62827a279eac2b25ee', 'lisi', '18957141081', 'E10ADC3949BA59ABBE56E057F20F883E', '0');
INSERT INTO `user` VALUES ('890be6a757324397961b4bff81f20684', 'wangwu', '18957141083', 'E10ADC3949BA59ABBE56E057F20F883E', '0');
