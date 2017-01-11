/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50505
 Source Host           : localhost
 Source Database       : extjs_mall

 Target Server Type    : MySQL
 Target Server Version : 50505
 File Encoding         : utf-8

 Date: 01/10/2017 22:27:21 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `Address`
-- ----------------------------
DROP TABLE IF EXISTS `Address`;
CREATE TABLE `Address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(50) NOT NULL,
  `defaultAddress` varchar(255) NOT NULL,
  `consumerId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_remprd5fjl4cv7xtvqt3p3drp` (`consumerId`),
  CONSTRAINT `FK_remprd5fjl4cv7xtvqt3p3drp` FOREIGN KEY (`consumerId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `Address`
-- ----------------------------
BEGIN;
INSERT INTO `Address` VALUES ('1', 'qweqweqwe', 'Y', '1');
COMMIT;

-- ----------------------------
--  Table structure for `Commodity`
-- ----------------------------
DROP TABLE IF EXISTS `Commodity`;
CREATE TABLE `Commodity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `brand` varchar(50) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  `createDate` datetime NOT NULL,
  `effect` varchar(50) DEFAULT NULL,
  `name` varchar(12) NOT NULL,
  `merchantId` bigint(20) DEFAULT NULL,
  `price` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_v1go8fxvhwd3gfeasvrl698v` (`merchantId`),
  CONSTRAINT `FK_v1go8fxvhwd3gfeasvrl698v` FOREIGN KEY (`merchantId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `Commodity`
-- ----------------------------
BEGIN;
INSERT INTO `Commodity` VALUES ('1', 'qqq', 'www', '2016-12-28 13:59:11', 'eee', 'xiezi', '1', '0');
COMMIT;

-- ----------------------------
--  Table structure for `Indent`
-- ----------------------------
DROP TABLE IF EXISTS `Indent`;
CREATE TABLE `Indent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createDate` datetime NOT NULL,
  `phoneNumber` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `totalNumber` int(11) NOT NULL,
  `totalPrice` int(11) NOT NULL,
  `addressId` bigint(20) DEFAULT NULL,
  `commodityId` bigint(20) DEFAULT NULL,
  `consumerId` bigint(20) DEFAULT NULL,
  `merchantId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_gtl6u4rdxcw9x435oawblbj4s` (`addressId`),
  KEY `FK_3y5naqsa7gstp95uwq51ej38o` (`commodityId`),
  KEY `FK_pfo9f7ocw7yk4lnmkmiy8d9tq` (`consumerId`),
  KEY `FK_okwfxdu3w0kjlftbgw85tl1rd` (`merchantId`),
  CONSTRAINT `FK_3y5naqsa7gstp95uwq51ej38o` FOREIGN KEY (`commodityId`) REFERENCES `Commodity` (`id`),
  CONSTRAINT `FK_gtl6u4rdxcw9x435oawblbj4s` FOREIGN KEY (`addressId`) REFERENCES `Address` (`id`),
  CONSTRAINT `FK_okwfxdu3w0kjlftbgw85tl1rd` FOREIGN KEY (`merchantId`) REFERENCES `User` (`id`),
  CONSTRAINT `FK_pfo9f7ocw7yk4lnmkmiy8d9tq` FOREIGN KEY (`consumerId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `Indent`
-- ----------------------------
BEGIN;
INSERT INTO `Indent` VALUES ('1', '2016-12-28 13:58:10', '19199817161', '12', 'create', '2', '24', '1', '1', '1', null);
COMMIT;

-- ----------------------------
--  Table structure for `MerchantCommodity`
-- ----------------------------
DROP TABLE IF EXISTS `MerchantCommodity`;
CREATE TABLE `MerchantCommodity` (
  `userId` bigint(20) NOT NULL,
  `commodityId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`,`commodityId`),
  UNIQUE KEY `UK_syve3mogsaw32d6yhss0cy0i0` (`commodityId`),
  CONSTRAINT `FK_5stsbxcyfqfnejiwq80kmtt47` FOREIGN KEY (`userId`) REFERENCES `User` (`id`),
  CONSTRAINT `FK_syve3mogsaw32d6yhss0cy0i0` FOREIGN KEY (`commodityId`) REFERENCES `Commodity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `Role`
-- ----------------------------
DROP TABLE IF EXISTS `Role`;
CREATE TABLE `Role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createDate` datetime NOT NULL,
  `name` varchar(12) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_7d8a768x6aiuvmsa24hqiharg` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `Role`
-- ----------------------------
BEGIN;
INSERT INTO `Role` VALUES ('1', '2016-12-28 13:57:56', 'user');
COMMIT;

-- ----------------------------
--  Table structure for `User`
-- ----------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `answer` varchar(100) NOT NULL,
  `createDate` datetime NOT NULL,
  `iDCardNumber` varchar(18) NOT NULL,
  `name` varchar(12) NOT NULL,
  `passWord` varchar(16) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `question` varchar(100) NOT NULL,
  `userName` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `User`
-- ----------------------------
BEGIN;
INSERT INTO `User` VALUES ('1', 'wang', '2016-12-28 13:57:17', '421123199408210010', 'pin', '123456', '18111678350', 'who are you ?', 'san');
COMMIT;

-- ----------------------------
--  Table structure for `UserAddress`
-- ----------------------------
DROP TABLE IF EXISTS `UserAddress`;
CREATE TABLE `UserAddress` (
  `userId` bigint(20) NOT NULL,
  `addressId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`,`addressId`),
  UNIQUE KEY `UK_j3b0x1x14dydp31g191uyfrg5` (`addressId`),
  CONSTRAINT `FK_6lp356d9swwklnpw1n5539r9s` FOREIGN KEY (`userId`) REFERENCES `User` (`id`),
  CONSTRAINT `FK_j3b0x1x14dydp31g191uyfrg5` FOREIGN KEY (`addressId`) REFERENCES `Address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `UserRole`
-- ----------------------------
DROP TABLE IF EXISTS `UserRole`;
CREATE TABLE `UserRole` (
  `userId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`,`roleId`),
  KEY `FK_4d5ecklcbwo3ybq33l38oebcu` (`roleId`),
  CONSTRAINT `FK_4d5ecklcbwo3ybq33l38oebcu` FOREIGN KEY (`roleId`) REFERENCES `Role` (`id`),
  CONSTRAINT `FK_axfa5hhechrcegaxd5eelwdr` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
