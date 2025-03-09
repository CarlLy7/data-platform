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

 Date: 09/03/2025 22:11:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_data_center_metadata
-- ----------------------------
DROP TABLE IF EXISTS `t_data_center_metadata`;
CREATE TABLE `t_data_center_metadata`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `rule_id` bigint NOT NULL COMMENT '规则表主键id',
  `en_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '指标英文标识',
  `cn_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `default_show` bit(1) NOT NULL DEFAULT b'1' COMMENT '指标是否默认展示 0:否 1:是',
  `storage` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否存储当前指标，0:否 1:是',
  `dimension` bit(1) NOT NULL DEFAULT b'1' COMMENT '当前指标是否和维度有关，0:否 1:是',
  `period` bit(1) NOT NULL DEFAULT b'1' COMMENT '当前指标是否和统计周期有关，0:否 1:是',
  `data_type` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '当前指标数据类型',
  `source_type` tinyint NOT NULL COMMENT '指标类型： 1：抽取类型 2：计算类型',
  `life_cycle_rule_id` bigint NOT NULL COMMENT '生命周期规则id',
  `trace_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '追踪的UUID',
  `data_security` int NOT NULL COMMENT '数据安全信息字段id',
  `extra_width` smallint NOT NULL DEFAULT 0 COMMENT '前端展示宽度',
  `description` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '指标描述',
  `rank` int NOT NULL DEFAULT 0 COMMENT '排序字段',
  `base_value` int NOT NULL DEFAULT 10 COMMENT '基准值，用来做展示数据',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint NOT NULL DEFAULT 1 COMMENT '状态 1：未删除 0：删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '数据中台元数据' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
