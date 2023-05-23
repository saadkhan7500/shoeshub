-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: sportsshoes
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `user_address`
--

DROP TABLE IF EXISTS `user_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_address` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip_code` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_address`
--

LOCK TABLES `user_address` WRITE;
/*!40000 ALTER TABLE `user_address` DISABLE KEYS */;
INSERT INTO `user_address` VALUES (1,'Dariyapur','Bulandshahr','India','Uttar Pradesh',203001),(2,'dp','Bulandshahr','India','UP',0),(52,'Dariyapur','Bulandshahr','India','Uttar Pradesh',203001),(53,'dp','Bulandshahr','India','UP',0),(54,'dp','Bulandshahr','India','UP',0),(55,'dp','Bulandshahr','India','UP',0),(56,'dp','Bulandshahr','India','UP',0),(102,'Dp','Bulandshahr','India','UP',0),(103,'Faislabad','Bulandshahr','India','UP',0),(152,'Kahira','Bulandshahr','India','UP',0),(153,'DP','Bulandshahr','India','UP',203001),(202,'DP','Bulandshahr','India','UP',203001),(252,'DP','Bulandshahr','India','UP',203001),(253,'DP','Bulandshahr','India','UP',203001),(254,'Village and Post Dariyapur','Bulandshahr','India','UP',203001),(255,'DP','Bulandshahr','India','UP',203001),(256,'Village and Post Dariyapur','Bulandshahr','India','UP',203001),(352,'Dariyapur','Bulandshahr','India','Uttar Pradesh',203001),(404,'dariyapur','bulandshahr','India','UP',203001),(452,'amroha','amroha','India','Uttar Pradesh',244221),(502,'Village and Post Dariyapur','Bulandshahr','India','Uttar Pradesh',203001),(552,'Village and Post Dariyapur','Bulandshahr','Inida','Uttar Pradesh',203001),(602,'Khairtabad ','Hyderabad','India','Talengna',50004);
/*!40000 ALTER TABLE `user_address` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-23 16:54:14
