# springMVC
demo of springMVC
#数据库MYSQL
-- ----------------------------
-- Table structure for first_table
-- ----------------------------
DROP TABLE IF EXISTS `first_table`;
CREATE TABLE `first_table` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `age` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
