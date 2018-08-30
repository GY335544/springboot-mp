/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-08-30 11:31:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `plant`
-- ----------------------------
DROP TABLE IF EXISTS `plant`;
CREATE TABLE `plant` (
  `ID` varchar(20) NOT NULL COMMENT '种植批次ID',
  `FARMER_NAME` varchar(255) DEFAULT NULL COMMENT '农户名称',
  `GOODS_NAME` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `GOODVARIETY_NAME` varchar(255) DEFAULT NULL COMMENT '品种名称',
  `AREAS` bigint(20) DEFAULT NULL COMMENT '区域',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='种植批次';

-- ----------------------------
-- Records of plant
-- ----------------------------
INSERT INTO `plant` VALUES ('1010870924980887553', '光明一号', '苹果', '一号果苗', '4000', '2014-06-24 21:03:04');
INSERT INTO `plant` VALUES ('1010876166153805826', '光明号', '苹果', '一号果苗', '100', '2016-06-24 21:23:54');
INSERT INTO `plant` VALUES ('1010878161275166721', '光明一号', '苹果', '一号果苗', '50', '2018-06-24 21:31:50');
INSERT INTO `plant` VALUES ('1010878407224958977', '光明一号', '红富士苹果', '三号果苗', '50', '2015-06-24 21:32:48');
INSERT INTO `plant` VALUES ('1010880800444489730', '光明号', '辣椒', '彩椒种苗', '3000', '2018-06-24 21:42:19');
INSERT INTO `plant` VALUES ('1010881255916544001', '光明二号', '大彩椒', '彩椒种苗', '1000', '2015-06-24 21:44:07');
INSERT INTO `plant` VALUES ('1010888037216919554', '光明号', '辣椒', '彩椒种苗', '500', '2018-06-24 22:11:04');
INSERT INTO `plant` VALUES ('1010898289815564289', '光明一号', '红富士', '二号果苗', '100', '2016-06-24 22:51:48');
INSERT INTO `plant` VALUES ('1011086392324784129', '张三', '鸭梨', '鸭梨种苗', '500', '2018-06-25 11:19:16');
INSERT INTO `plant` VALUES ('1011088689859657730', '张三', '小辣椒', '小辣椒', '400', '2017-06-25 11:28:23');
INSERT INTO `plant` VALUES ('1011133189961285633', '刘村长', '秦冠苹果一号', '秦冠苹果', '10000', '2018-06-25 14:25:13');
INSERT INTO `plant` VALUES ('1011530564076830722', '光明二号', '大彩椒', '彩椒种苗', '40', '2019-06-26 16:44:14');
INSERT INTO `plant` VALUES ('1012167423127715841', '李嘉懿', '晚秋黄梨', '梨树苗', '300', '2016-06-28 10:54:53');
INSERT INTO `plant` VALUES ('1012173169135452162', '王金泉', '富硒梨', '梨树苗', '120', '2018-06-28 11:17:43');
INSERT INTO `plant` VALUES ('1012174802187714561', '莫巨超', '辣椒', '线椒', '200', '2018-06-28 11:24:13');
INSERT INTO `plant` VALUES ('1019394441443602433', '光明一号', '辣椒', '二号果苗', '10', '2017-07-18 09:32:29');
INSERT INTO `plant` VALUES ('1020608509823217666', '光明二号', '阜南大苹果', '二号果苗', '333', '2014-07-21 17:56:45');
INSERT INTO `plant` VALUES ('1021633759067303938', '光明二号', '水稻', '三号果苗', '230', '2018-07-24 13:50:44');
INSERT INTO `plant` VALUES ('1021633763030921217', '光明一号', '大空心菜', '二号果苗', '30', '2017-07-24 13:50:45');
INSERT INTO `plant` VALUES ('1021658853126762497', '光明二号', '茄子', '三号果苗', '20', '2018-07-24 15:30:27');
INSERT INTO `plant` VALUES ('1024493525418459138', '农户', '苹果', '苹果苗木', '100', '2014-08-01 11:14:25');

-- ----------------------------
-- Table structure for `t_config`
-- ----------------------------
DROP TABLE IF EXISTS `t_config`;
CREATE TABLE `t_config` (
  `id` varchar(128) NOT NULL,
  `variable` varchar(128) DEFAULT NULL,
  `value` varchar(128) DEFAULT NULL,
  `set_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_config
-- ----------------------------
INSERT INTO `t_config` VALUES ('1010870924980887553', 'diagnostics.allow_i_s_tables', 'OFF', '2018-08-20 14:53:16');
INSERT INTO `t_config` VALUES ('1010881255916544001', 'diagnostics.include_raw', 'OFF', '2018-08-20 14:53:21');
INSERT INTO `t_config` VALUES ('1011088689859657730', 'ps_thread_trx_info.max_length', '65535', '2018-08-20 14:53:27');
INSERT INTO `t_config` VALUES ('1011133189961285633', 'statement_performance_analyzer.view', '213', '2018-08-20 14:53:42');
INSERT INTO `t_config` VALUES ('1012167423127715841', 'statement_truncate_len', '64', '2018-08-20 14:53:37');
INSERT INTO `t_config` VALUES ('1012167423127715843', 'statement_performance_analyzer.limit', '100', '2018-08-20 14:54:51');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(32) NOT NULL,
  `username` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '账号',
  `password` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '密码',
  `nickname` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT '' COMMENT '昵称',
  `roles` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '身份',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'anoy', 'pwd', 'anoy', 'ROLE_USER');
INSERT INTO `t_user` VALUES ('2', 'admin', 'pwd', 'admin', 'ROLE_USER,ROLE_ADMIN');
INSERT INTO `t_user` VALUES ('3', 'test', 'test', 'test', 'ROLE_USER');
DROP TRIGGER IF EXISTS `sys_config_insert_set_user`;
DELIMITER ;;
CREATE TRIGGER `sys_config_insert_set_user` BEFORE INSERT ON `t_config` FOR EACH ROW BEGIN IF @sys.ignore_sys_config_triggers != true AND NEW.set_by IS NULL THEN SET NEW.set_by = USER(); END IF; END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `sys_config_update_set_user`;
DELIMITER ;;
CREATE TRIGGER `sys_config_update_set_user` BEFORE UPDATE ON `t_config` FOR EACH ROW BEGIN IF @sys.ignore_sys_config_triggers != true AND NEW.set_by IS NULL THEN SET NEW.set_by = USER(); END IF; END
;;
DELIMITER ;
