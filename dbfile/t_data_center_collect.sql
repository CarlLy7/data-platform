/*
 Navicat Premium Dump SQL

 Source Server         : localhost-mysql
 Source Server Type    : MySQL
 Source Server Version : 80023 (8.0.23)
 Source Host           : localhost:3306
 Source Schema         : data-center

 Target Server Type    : MySQL
 Target Server Version : 80023 (8.0.23)
 File Encoding         : 65001

 Date: 09/03/2025 22:10:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_data_center_collect
-- ----------------------------
DROP TABLE IF EXISTS `t_data_center_collect`;
CREATE TABLE `t_data_center_collect`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `rule_id` bigint NOT NULL COMMENT '规则主键id',
  `en_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '指标英文标识',
  `data_source` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '数据源',
  `collect_way` tinyint NOT NULL DEFAULT 1 COMMENT '数据采集来源 1：sql采集 2：接口采集',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '取决于数据采集来源，如果是sql采集则标识sql脚本，如果是接口采集则标识url',
  `deduplicate` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否去重',
  `period_format` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '统计周期格式',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint NOT NULL DEFAULT 1 COMMENT '状态 1：未删除 0：删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '数据采集表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
