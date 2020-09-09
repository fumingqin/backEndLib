
DROP TABLE IF EXISTS `t_company`;
CREATE TABLE `t_company` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  `create_by` varchar(50) NOT NULL,
  `update_by` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT '公司名称',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '公司地址',
  `tel` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '公司电话',
  `car_id` bigint(11) DEFAULT NULL COMMENT '车辆id',
  `driver_id` bigint(11) DEFAULT NULL COMMENT '驾驶员id',
  `del_flag` char(1) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL COMMENT '联系人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='公司表';

-- ----------------------------
-- Records of t_company
-- ----------------------------
INSERT INTO `t_company` VALUES ('1', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '', '', '晋江市出行汽车服务有限公司', null, null, '2097', '84', '0', null);
INSERT INTO `t_company` VALUES ('2', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '', '', '测试', null, null, '2089', '92', '0', null);
