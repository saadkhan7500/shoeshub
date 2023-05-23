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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `mobile` double NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `user_address_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`),
  UNIQUE KEY `UK_r43af9ap4edm43mmtq01oddj6` (`username`),
  KEY `FKf7oru2csbvx460sb5c0qoo7m` (`user_address_id`),
  CONSTRAINT `FKf7oru2csbvx460sb5c0qoo7m` FOREIGN KEY (`user_address_id`) REFERENCES `user_address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'mohammadsaad9690@gmail.com',7500495652,'Mohammad  Saad Khan','saadkhan','saadkhan7500',NULL),(3,'saad@gmail.com',787787898,'Mohammad Saad','saad','saad',NULL),(4,'saad7878@gmail.com',79778708070,'saad','saad','saaduu',NULL),(5,'aa@gmail.com',7878799896,'Mohammad Saad','aaaa','aaa',NULL),(9,'mohammadsaad969086@gmail.com',9690867474,'Mohammad Saad','saadkhan','saadkhan750049',1),(10,'saad123456@gmail.com',698770,'saad','saad','saad123456',2),(11,'mohammadsaad96908674@gmail.com',9690867474,'Mohammad Saad','saadkhan','saadkhan75004956',52),(12,'saad32@gmail.com',6698770,'saad','saad','sad12',53),(13,'saa@gamil.com',9877070,'saa','saa','saa12',54),(14,'saa123@gmail.com',7697979,'saa','saad','sa123',55),(15,'maaz@gmail.com',7970808,'maaz','maaz','maaz12',56),(18,'maazkhan123@gmail.com',6869770,'maazkhan','maaz','maazkhan12',102),(20,'aasim@gmail.com',8780800,'aasim','aasim','aasim123',103),(22,'dinesh@gmail.com',79780807,'dinesh','dinesh','dinesh',152),(23,'yasir@gmail.com',78798989,'yasir','yasir','yasir',153),(24,'sanif@gmail.com',767878777,'sanif','sanif','sanif',202),(25,'maaju@gmail.com',9798770,'maaju','maaju','maaju',252),(26,'wasif',78787898,'wasif','wasif','wasif',253),(27,'monu@gmail.com',978770,'monu','monu','monu',254),(28,'ramu@gmail.com',80808,'ramu','ramu','ramu',255),(29,'sonu@gmail.com',87798889,'sonu','sonu','sonu',256),(30,'',9690867474,'Mohammad Haroon','saadkhan','haroon',352),(31,'naved@gmail.com',8980897712,'naved','naved','naved12',404),(32,'bilal@gmail.com',8789098765,'bilal','bilal','bilal',452),(33,'ramesh@gmail.com',8789098765,'ramesh','ramesh','ramesh',502),(34,'javed@gmail.com',7876567898,'javed','javed','javed',552),(35,'ajez@gmail.com',7876543212,'Ajesz','ajez','ajez123',602);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
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
