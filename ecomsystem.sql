-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ecomsystem
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `good`
--

DROP TABLE IF EXISTS `good`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `good` (
  `gid` int(10) NOT NULL AUTO_INCREMENT,
  `gname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gimg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pro_date` date DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `gtype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `shop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`gid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `good`
--

LOCK TABLES `good` WRITE;
/*!40000 ALTER TABLE `good` DISABLE KEYS */;
INSERT INTO `good` VALUES (1,'麦乐鸡','1.jpg','酥脆可口，鸡肉香气四溢','2023-05-19',15.00,'食品','沈阳分店'),(2,'大宝护肤霜','2.jpg','滋润肌肤，防晒保湿，让你肌肤嫩滑','2023-04-15',30.00,'日用品','沈阳分店'),(3,'安踏运动鞋','3.jpg','科技创新，贴合足部，让你跑得更快','2023-05-01',300.00,'衣服','沈阳分店'),(4,'森马牛仔裤','4.jpg','经典耐穿，百搭随心，让你随意搭配','2023-04-15',200.00,'衣服','铁岭分店'),(5,'老干妈','5.jpg','辣中带香，香中带辣，让你欲罢不能','2023-04-26',8.00,'食品','铁岭分店'),(6,'蒙牛纯牛奶','6.jpg','天然营养，健康美味，每天一杯，精力充沛','2023-04-02',60.00,'食品','铁岭分店'),(7,'高露洁牙膏','7.jpg','清新口气，亮白牙齿，让你笑得更灿烂','2023-05-04',20.00,'日用品','上海分店'),(8,'李宁运动服','8.jpg','舒适透气，轻松自在，让你动起来','2023-04-26',400.00,'衣服','上海分店'),(9,'飘柔洗发水','9.jpg','滋养头发，修复受损，让你秀发飘逸','2023-05-19',30.00,'日用品','上海分店'),(10,'六神花露水','10.jpg','清凉止痒，驱蚊防虫，让你夏日无忧','2023-05-19',24.00,'日用品','无锡分店'),(11,'好丽友派','11.jpg','酥皮夹心，甜而不腻，满足你的味蕾','2023-03-01',18.00,'食品','无锡分店'),(12,'奥利奥饼干','12.jpg','夹心酥脆，黑白搭配，让你一口一个','2023-04-15',15.00,'食品','无锡分店'),(13,'暴龙眼镜','13.jpg','优雅时尚，高端大气，让你自信开朗','2023-03-15',300.00,'日用品','锦州分店'),(14,'可口可乐','14.jpg','开启快乐时刻，分享无限乐趣','2023-04-15',4.00,'食品','锦州分店'),(15,'雀巢咖啡','15.jpg','香浓醇厚，提神醒脑，让你精神百倍','2023-03-01',8.00,'食品','锦州分店'),(16,'娃哈哈八宝粥','16.jpg','传统工艺，粒粒饱满，让你暖心暖胃','2023-05-19',12.00,'食品','北京分店'),(17,'耐克运动背包','17.jpg','轻便耐用，收纳方便，让你出行无忧','2023-04-26',120.00,'日用品','北京分店'),(37,'测试','https://web-wfz.oss-cn-beijing.aliyuncs.com/2fbfb238-73b7-4513-b4fc-c42265b0cfe3.jpg','接口测试','2024-01-02',1.00,'食品','沈阳分店'),(38,'测试2','https://web-wfz.oss-cn-beijing.aliyuncs.com/bcfea2cc-f69f-4b8e-b2c7-27316ca24602.jpg','功能测试','2024-01-02',2.00,'日用品','北京分店');
/*!40000 ALTER TABLE `good` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operate_log`
--

DROP TABLE IF EXISTS `operate_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operate_log` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `operate_user` int(10) unsigned DEFAULT NULL COMMENT '操作人ID',
  `operate_time` datetime DEFAULT NULL COMMENT '操作时间',
  `class_name` varchar(100) DEFAULT NULL COMMENT '操作的类名',
  `method_name` varchar(100) DEFAULT NULL COMMENT '操作的方法名',
  `method_params` varchar(1000) DEFAULT NULL COMMENT '方法参数',
  `return_value` varchar(2000) DEFAULT NULL COMMENT '返回值',
  `cost_time` bigint(20) DEFAULT NULL COMMENT '方法执行耗时, 单位:ms',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='操作日志表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operate_log`
--

LOCK TABLES `operate_log` WRITE;
/*!40000 ALTER TABLE `operate_log` DISABLE KEYS */;
INSERT INTO `operate_log` VALUES (1,1,'2024-01-03 15:54:20','com.ecom.controller.ShopController','add','[Shop(sid=null, sname=测试, introduce=日志测试)]','{\"code\":1,\"msg\":\"success\"}',17),(2,1,'2024-01-03 15:54:54','com.ecom.controller.ShopController','delete','[24]','{\"code\":1,\"msg\":\"success\"}',24);
/*!40000 ALTER TABLE `operate_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop` (
  `sid` int(10) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE,
  UNIQUE KEY `sname_UNIQUE` (`sname`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` VALUES (1,'沈阳分店','高端优雅'),(2,'无锡分店','便宜皮实'),(3,'铁岭分店','物美价廉'),(4,'上海分店','爱买不买'),(5,'锦州分店','物美价廉'),(6,'北京分店','纯正地道'),(7,'深圳分店','高端奢侈'),(8,'武汉分店','假一赔十'),(23,'江阴分店','家的味道');
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'wfz','123'),(2,'www','111'),(3,'fff','222'),(4,'zzz','333');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-03 15:58:44
