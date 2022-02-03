/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.132
Source Server Version : 80026
Source Host           : 192.168.1.132:3306
Source Database       : world

Target Server Type    : MYSQL
Target Server Version : 80026
File Encoding         : 65001

Date: 2022-02-03 11:37:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('13', '13');
INSERT INTO `user` VALUES ('14', '14');
INSERT INTO `user` VALUES ('15', '15');
INSERT INTO `user` VALUES ('16', '16');
