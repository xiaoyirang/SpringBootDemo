/*
Navicat MySQL Data Transfer

Source Server         : lefu
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-03-03 18:00:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plateNum` varchar(11) COLLATE utf8_bin DEFAULT NULL COMMENT '车牌号',
  `parkNum` int(11) DEFAULT NULL COMMENT '停车位号码',
  `brand` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌',
  `color` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '颜色',
  `startTime` datetime DEFAULT NULL COMMENT '入驻时间',
  `serialNumber` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '序列号',
  `endTime` datetime DEFAULT NULL COMMENT '迁出时间',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `roomId` int(11) DEFAULT NULL COMMENT '户号',
  `status` int(255) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES ('1', '京P456V4', '1', '现代', '白色', '2016-12-01 11:28:55', '1111111111', '2017-12-31 11:29:01', '1', 'admin', '1', '0');
INSERT INTO `car` VALUES ('2', '鲁C520GF', '2', '玛莎拉蒂', '黑色', '2017-02-24 11:32:41', '1111111112', '2018-02-24 11:32:45', '3', '王五', '3', '0');
INSERT INTO `car` VALUES ('3', '京A111AA', '3', '宝马', '棕色', '2017-02-24 11:32:41', '1111111113', '2018-02-24 11:32:45', '2', '赵四', '2', '0');
INSERT INTO `car` VALUES ('4', '鲁A1314A', '4', '奔驰', '白色', '2017-02-27 11:37:38', '1111111114', '2019-01-27 11:37:52', '5', '乐富', '4', '1');
INSERT INTO `car` VALUES ('10', '鲁A1314G', '10', '凯迪拉克', '红色', '2017-01-27 13:12:12', '1111111115', '2022-01-27 13:12:12', '9', '乐富支付', '5', '1');
INSERT INTO `car` VALUES ('11', '鲁A00000', '11', '法拉利', '红色', '2017-01-27 00:00:00', '1111111116', '2022-01-27 00:00:00', '12', '企鹅', '5', '1');

-- ----------------------------
-- Table structure for complain
-- ----------------------------
DROP TABLE IF EXISTS `complain`;
CREATE TABLE `complain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '手机',
  `dealTime` datetime DEFAULT NULL COMMENT '处理时间',
  `operaterName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '处理人姓名',
  `operaterUserId` int(11) DEFAULT NULL COMMENT '处理人用户id',
  `content` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '投诉内容',
  `agreement` int(11) DEFAULT NULL COMMENT '是否接受',
  `status` varchar(11) COLLATE utf8_bin DEFAULT NULL COMMENT '状态',
  `comments` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '回复内容或者备注',
  `updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of complain
-- ----------------------------
INSERT INTO `complain` VALUES ('1', '2017-02-15 15:52:26', '2', '赵四', '18429375837', '2017-02-16 00:00:00', 'admin', '1', '绿化不完善', '1', '已处理', '会尽快解决', '2017-02-16 10:57:15');
INSERT INTO `complain` VALUES ('7', '2017-02-16 13:45:23', '3', '王五', '18364738463', '2017-02-17 00:00:00', 'admin', '1', '小区流浪狗多', '1', '已处理', '会尽快解决', '2017-02-17 11:17:28');
INSERT INTO `complain` VALUES ('10', '2017-02-22 15:25:09', '3', '王五', '18364738463', '2017-02-22 00:00:00', 'admin', '1', '楼道不卫生', '1', '已处理', '会尽快解决', '2017-02-22 17:20:09');
INSERT INTO `complain` VALUES ('32', '2017-03-02 12:03:43', '9', '乐富支付', '18638217282', '2017-03-02 00:00:00', 'admin', '1', '楼道不卫生', '1', '已处理', '会尽快解决', '2017-03-02 12:04:19');
INSERT INTO `complain` VALUES ('41', '2017-03-02 18:00:39', '9', '乐富支付', '18638217282', null, null, null, '处理', null, '等待处理', null, null);
INSERT INTO `complain` VALUES ('42', '2017-03-02 18:01:39', '9', '乐富支付', '18638217282', '2017-03-03 00:00:00', 'admin', '1', '吃了', '1', '已处理', '好的', '2017-03-03 17:01:41');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `equipmentName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '设备名称',
  `location` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '位置',
  `serialNumber` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '序列号',
  `boughtDate` datetime DEFAULT NULL COMMENT '购买日期',
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '型号',
  `brand` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌',
  `status` varchar(11) COLLATE utf8_bin DEFAULT NULL COMMENT '状态',
  `conditiona` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '使用状况',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `price` decimal(10,0) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('2', '洗衣机', '仓库', '2222222221', '2015-01-09 11:22:22', '全自动S7', '小天鹅', '废弃', '废弃', '2017-02-17 15:18:55', '2323');
INSERT INTO `equipment` VALUES ('3', '空调', '仓库', '2222222222', '2017-02-07 15:28:57', '挂式机', '美的', '非正常', '非正常', '2017-02-17 15:29:21', '2114');
INSERT INTO `equipment` VALUES ('4', '桌子', '仓库', '2222222223', '2016-01-22 12:12:12', '圆桌', '宜家', '非正常', '非正常', '2017-02-22 13:52:09', '2221');
INSERT INTO `equipment` VALUES ('5', '小圆桌', '会客室', '2222222224', '2017-01-03 00:00:00', '法兰西Q1', 'QQ牌', '正常', '正常', '2017-03-03 17:03:43', '2222');
INSERT INTO `equipment` VALUES ('6', '电视', '会客室', '2222222225', '2017-01-03 00:00:00', '乐视W4', '乐视', '正常', '正常', '2017-03-03 17:17:40', '5000');

-- ----------------------------
-- Table structure for equipmentrepair
-- ----------------------------
DROP TABLE IF EXISTS `equipmentrepair`;
CREATE TABLE `equipmentrepair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `equipmentId` int(11) DEFAULT NULL,
  `equipmentName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '设备名称',
  `operateName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '操作分类',
  `comments` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `createUserId` int(11) DEFAULT NULL COMMENT '创建人',
  `createName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人姓名',
  `operaterName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '维修人',
  `location` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '位置',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `startTime` datetime DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `fee` decimal(10,0) DEFAULT NULL COMMENT '费用',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of equipmentrepair
-- ----------------------------
INSERT INTO `equipmentrepair` VALUES ('1', '3', '空调', '家电', '尽快', '2', 'window', '赵六', '机房', '0', '2017-01-23 12:02:12', '2017-01-23 14:14:14', '324', '2017-02-20 15:06:48');
INSERT INTO `equipmentrepair` VALUES ('2', '2', '洗衣机', '家电', '尽快', '3', 'Linux', '扎欧力', '洗衣房', '0', '2017-01-23 12:02:12', '2017-01-23 14:14:14', '442', '2017-02-20 18:07:55');
INSERT INTO `equipmentrepair` VALUES ('8', '3', '空调', '家电', '尽快', '3', 'Linux', '赵亮', '机房', '0', '2017-01-23 12:02:12', '2017-01-23 14:14:14', '332', '2017-02-21 11:06:55');
INSERT INTO `equipmentrepair` VALUES ('19', null, '冰箱', '家电', '今年高考', '9', '乐富', '阿里里', '底线', '0', '2017-01-27 13:12:12', '2022-01-27 13:12:12', '2322', '2017-03-03 17:33:23');
INSERT INTO `equipmentrepair` VALUES ('20', null, '说说', '说说', '说说', '9', '乐富', '阿里里', '说说', '0', '2017-01-27 13:12:12', '2022-01-27 13:12:12', '223', '2017-03-03 17:37:34');
INSERT INTO `equipmentrepair` VALUES ('21', null, '说说', '说说', '说说', '9', '乐富', '嗷嗷', '说说', '0', '2017-01-27 13:12:12', '2022-01-27 13:12:12', '223', '2017-03-03 17:37:48');
INSERT INTO `equipmentrepair` VALUES ('22', null, '说说', '说说', '说说', '9', '乐富', '嗷嗷', '说说', '0', '2017-01-27 13:12:12', '2022-01-27 13:12:12', '221', '2017-03-03 17:39:23');

-- ----------------------------
-- Table structure for fee
-- ----------------------------
DROP TABLE IF EXISTS `fee`;
CREATE TABLE `fee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `feeName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '费用名称',
  `price` decimal(10,0) DEFAULT NULL COMMENT '单价',
  `fixedCost` decimal(10,0) DEFAULT NULL COMMENT '固定收费价格',
  `costUnit` int(11) DEFAULT NULL COMMENT '收费单位，年，月，日，数字',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `createUserId` int(11) DEFAULT NULL COMMENT '创建人id',
  `createUserName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人姓名',
  `updateUserId` int(11) DEFAULT NULL COMMENT '更新人id',
  `updateUserName` varchar(0) COLLATE utf8_bin DEFAULT NULL COMMENT '更新人姓名',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(255) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of fee
-- ----------------------------

-- ----------------------------
-- Table structure for feelog
-- ----------------------------
DROP TABLE IF EXISTS `feelog`;
CREATE TABLE `feelog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `feeId` int(11) DEFAULT NULL,
  `feeName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '费用名称',
  `startTime` datetime DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `payType` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '支付类型',
  `payTime` datetime DEFAULT NULL COMMENT '交费时间',
  `payCost` decimal(10,0) DEFAULT NULL COMMENT '欠费金额',
  `comments` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `roomId` int(11) DEFAULT NULL COMMENT '户号',
  `dealUserId` int(11) DEFAULT NULL COMMENT '处理人id',
  `dealUserName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '处理人姓名',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `isPay` int(11) DEFAULT NULL COMMENT '是否已缴费',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of feelog
-- ----------------------------

-- ----------------------------
-- Table structure for instrument
-- ----------------------------
DROP TABLE IF EXISTS `instrument`;
CREATE TABLE `instrument` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `roomId` int(11) DEFAULT NULL COMMENT '户号',
  `startTime` datetime DEFAULT NULL COMMENT '开始使用时间',
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '仪表类型',
  `feeType` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '费用类型',
  `brand` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌',
  `lastNum` int(11) DEFAULT NULL COMMENT '上次表数',
  `thisNum` int(11) DEFAULT NULL COMMENT '本次表数',
  `consumeNum` int(11) DEFAULT NULL COMMENT '消费表数',
  `lastInputUserId` int(11) DEFAULT NULL COMMENT '上次录入用户id',
  `lasthInputUserName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '上次录入用户名',
  `thisInputUserId` int(11) DEFAULT NULL COMMENT '本次录入用户id',
  `thisInputUserName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '本次录入用户名',
  `status` int(255) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of instrument
-- ----------------------------

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '标题',
  `date` datetime DEFAULT NULL COMMENT '时间',
  `content` text COLLATE utf8_bin COMMENT '内容',
  `author` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '作者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('1', '如何装修', '2017-02-08 14:20:12', 0xE696B0E688BFE8A385E4BFAEE68A80E5B7A7E4B889E6ADA5E9AAA42020E7ACACE4B880E6ADA5EFBC9AE58588E69C89E5A597E688BFE5AD90EFBC9BE7ACACE4BA8CE6ADA5EFBC9AE689BEE4B880E5AEB6E5A5BDE79A84E585ACE58FB8EFBC9BE7ACACE4B889E6ADA5EFBC9AE58786E5A487E5A5BDE992B1, '刘柳柳');
INSERT INTO `notice` VALUES ('5', '十里桃花', '2017-02-23 00:00:00', 0xE4B889E7949FE4B889E4B89620E58D81E9878CE6A183E88AB120E5A4A7E7BB93E5B1802020686170707920656E64696E67EFBC8CE8BF99E6A0B7E79A84E4BA8BE68385E4BDA0E69C89E6B2A1E69C89E683B3E588B0E591A2EFBC9FE5A2A8E799BDE6B88AE6B5853D3DE5A2A8E799BDE7BC98E6B585, '爵士白');
INSERT INTO `notice` VALUES ('6', '乐富支付', '2017-03-03 00:00:00', 0xE8BF99E698AFE4B880E4B8AAE7A59EE5A587E79A84E4B896E7958CEFBC8CE593AAE69C89E4BB80E4B988E5A696E9AD94E9ACBCE680AAEFBC8CE8BF98E4B88DE698AFE4BABAE4B8BAE59CA8E5819AE4BD9CE680AAEFBC8CE4BABAE59CA8E5819AEFBC8CE5A4A9E59CA8E79C8BE38082E38082E38082E38082E38082E38082E38082E38082, 'admin');

-- ----------------------------
-- Table structure for parkinglots
-- ----------------------------
DROP TABLE IF EXISTS `parkinglots`;
CREATE TABLE `parkinglots` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `serialNumber` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '序列号',
  `location` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '位置',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `sold` int(11) DEFAULT NULL COMMENT '是否售出',
  `startTime` datetime DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '截止时间',
  `carId` int(11) DEFAULT NULL COMMENT '车id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of parkinglots
-- ----------------------------
INSERT INTO `parkinglots` VALUES ('1', '1111111111', '西区', '1', 'admin', '0', '2016-12-01 11:28:55', '2017-12-31 11:29:01', '1');
INSERT INTO `parkinglots` VALUES ('2', '1111111112', '西区', '3', '王五', '0', '2017-02-24 11:32:41', '2018-02-24 11:32:45', '2');
INSERT INTO `parkinglots` VALUES ('3', '1111111113', '西区', '2', '赵四', '0', '2017-02-24 11:33:51', '2018-02-24 11:33:54', '3');
INSERT INTO `parkinglots` VALUES ('4', '1111111114', '东区', '5', '乐富', '1', '2017-01-27 13:12:12', '2022-01-27 13:12:12', '4');
INSERT INTO `parkinglots` VALUES ('10', '1111111115', '东区', '9', '乐富支付', '1', '2017-01-27 13:12:12', '2022-01-27 13:12:12', '10');
INSERT INTO `parkinglots` VALUES ('11', '1111111116', '东区', '12', '企鹅', '1', '2017-01-27 13:12:12', '2022-01-27 13:12:12', '11');

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `communityName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '小区名称',
  `buildingNum` int(11) DEFAULT NULL COMMENT '楼号',
  `unitNum` int(11) DEFAULT NULL COMMENT '单元号',
  `roomNum` int(11) DEFAULT NULL COMMENT '房号',
  `commonArea` double DEFAULT NULL COMMENT '公共面积',
  `area` double DEFAULT NULL COMMENT '总面积',
  `roomType` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '户型',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `sold` int(11) DEFAULT NULL COMMENT '是否售出',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '三生三世', '1', '1', '301', '50', '300', '三室两厅', '1', 'admin', '0');
INSERT INTO `room` VALUES ('2', '三生三世', '1', '1', '201', '50', '300', '三室两厅', '2', '赵四', '0');
INSERT INTO `room` VALUES ('3', '三生三世', '1', '1', '401', '50', '300', '三室两厅', '3', '王五', '0');
INSERT INTO `room` VALUES ('4', '三生三世', '1', '1', '101', '50', '300', '三室两厅', '5', '乐富支付', '0');
INSERT INTO `room` VALUES ('5', '三生三世', '1', '1', '501', '50', '300', '三室两厅', '12', '企鹅', '0');
INSERT INTO `room` VALUES ('6', '三生三世', '1', '1', '102', '40', '260', '三室两厅', null, null, '1');

-- ----------------------------
-- Table structure for syslog
-- ----------------------------
DROP TABLE IF EXISTS `syslog`;
CREATE TABLE `syslog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `userName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '姓名',
  `model` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '模块',
  `msg` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '信息',
  `time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of syslog
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `sex` varchar(11) COLLATE utf8_bin DEFAULT NULL COMMENT '性别',
  `companyName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '公司名称',
  `idCardNum` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证号',
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '手机',
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `settleTime` datetime DEFAULT NULL COMMENT '入住时间',
  `mainAccount` int(11) DEFAULT NULL COMMENT '主账号',
  `relationship` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '家属关系',
  `role` int(11) DEFAULT NULL COMMENT '角色',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `createTime` datetime DEFAULT NULL COMMENT '记录创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '记录更新时间',
  `outmigrationTime` datetime DEFAULT NULL COMMENT '迁出时间',
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '户籍地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '111111', 'admin', '男', '乐富支付', '370305199302013420', '17683737454', '384726475@qq.com', '2017-01-01 10:34:51', null, '独居', '0', '0', '2017-01-02 10:37:47', '2017-02-22 16:25:04', '2017-02-08 10:37:26', '杭州');
INSERT INTO `user` VALUES ('2', 'window', '111111', '赵四', '女', '百度', '370306123456935829', '18429375837', '384726475@qq.com', '2017-02-01 14:13:51', null, '独居', '1', '1', '2017-02-10 09:47:18', '2017-02-14 14:15:03', '2017-02-07 14:15:09', '杭州');
INSERT INTO `user` VALUES ('3', 'Linux', '111111', '王五', '男', '乐富支付', '381934756284758373', '18638217283', '384726475@qq.com', '2017-01-31 14:13:55', null, '独居', '1', '1', '2017-02-10 15:16:13', '2017-02-23 16:47:18', '2017-02-22 14:15:12', '杭州');
INSERT INTO `user` VALUES ('5', '乐富支付', '111111', '乐富', '男', '乐富支付', '370305199409145678', '18638217283', 'lefuzhifu@lefu.com', '2016-12-01 13:54:49', null, '独居', '1', '1', '2017-02-24 09:24:43', '2017-02-24 11:43:56', '2017-02-24 13:54:10', '北京');
INSERT INTO `user` VALUES ('9', '乐富', '111111', '乐富支付', '男', '乐富支付', '370305199409141234', '18638217282', 'lefu8lefu@lefu.com', '2015-01-12 00:00:00', null, '夫妻', '1', '1', '2017-02-24 14:44:34', '2017-03-02 16:21:24', null, '北京');
INSERT INTO `user` VALUES ('12', 'QQ', '111111', '企鹅', '女', '乐富支付', '370305199409145620', '17866613026', '123456@qq.com', '2013-01-10 12:12:12', null, '独居', '1', '1', '2017-03-01 17:42:51', '2017-03-01 17:45:04', null, '山东');

-- ----------------------------
-- Table structure for userrepair
-- ----------------------------
DROP TABLE IF EXISTS `userrepair`;
CREATE TABLE `userrepair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL COMMENT '申请用户id',
  `realName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `applyTime` datetime DEFAULT NULL COMMENT '申请时间',
  `phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
  `bookTime` datetime DEFAULT NULL COMMENT '预约时间',
  `serviceCost` decimal(10,0) DEFAULT NULL COMMENT '服务费',
  `equipmentCost` decimal(10,0) DEFAULT NULL COMMENT '材料费',
  `allCost` decimal(10,0) DEFAULT NULL COMMENT '总费用',
  `comments` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '内容',
  `agreement` int(255) DEFAULT NULL COMMENT '是否接受',
  `status` int(255) DEFAULT NULL COMMENT '状态',
  `replyComments` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of userrepair
-- ----------------------------
INSERT INTO `userrepair` VALUES ('2', '3', '王五', '2017-02-21 17:40:53', '18364738463', '2017-01-22 14:30:00', '200', '100', '300', '马桶堵塞', '1', '0', '准时到达');
INSERT INTO `userrepair` VALUES ('3', '3', '王五', '2017-02-22 10:25:58', '18364738463', '2017-01-23 14:30:00', '200', '200', '400', '下水道堵塞', '1', '0', '准时到达');
INSERT INTO `userrepair` VALUES ('6', '3', '王五', '2017-02-22 11:49:44', '18364738463', '2017-01-24 14:30:00', '150', '333', '483', '油烟机', '1', '0', '准时到达');
INSERT INTO `userrepair` VALUES ('24', '9', '乐富支付', '2017-03-02 14:49:15', '18638217282', '2017-01-02 00:00:00', '150', '200', '350', '马桶堵塞', '1', '0', '准时到达');
INSERT INTO `userrepair` VALUES ('25', '9', '乐富支付', '2017-03-02 14:50:26', '18638217282', '2017-01-02 00:00:00', '150', '222', '372', '下水道堵塞', '1', '0', '准时到达');
INSERT INTO `userrepair` VALUES ('26', '9', '乐富支付', '2017-03-02 14:53:59', '18638217282', '2017-01-02 00:00:00', '150', '200', '350', '油烟机坏了', '1', '0', '准时到达');
INSERT INTO `userrepair` VALUES ('27', '9', '乐富支付', '2017-03-02 18:03:38', '18638217282', '2017-01-02 00:00:00', '150', '200', '350', '嘟嘟嘟', '1', '0', '准时到达');
