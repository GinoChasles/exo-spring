-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: localhost    Database: fruitEtLegume
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
-- Dumping data for table `fruit`
--

LOCK TABLES `fruit` WRITE;
/*!40000 ALTER TABLE `fruit` DISABLE KEYS */;
INSERT INTO `fruit` VALUES (1,'tomate',1),(2,'clémentine',2),(3,'pomme',3),(4,'poire',4),(5,'kiwi',3);
/*!40000 ALTER TABLE `fruit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `legume`
--

LOCK TABLES `legume` WRITE;
/*!40000 ALTER TABLE `legume` DISABLE KEYS */;
INSERT INTO `legume` VALUES (1,'poireau',3),(2,'choux',3),(3,'carotte',1),(4,'choux',3),(5,'carotte',1),(6,'haricots',4),(7,'pomme de terre',2);
/*!40000 ALTER TABLE `legume` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `mois`
--

LOCK TABLES `mois` WRITE;
/*!40000 ALTER TABLE `mois` DISABLE KEYS */;
INSERT INTO `mois` VALUES (2,'janvier',3),(3,'fev',3),(4,'mar',3),(5,'avr',4),(6,'mai',4),(7,'juin',4),(8,'juillet',1),(9,'aou',1),(10,'sep',1),(11,'oct',2),(12,'nov',2),(13,'dec',2);
/*!40000 ALTER TABLE `mois` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `saison`
--

LOCK TABLES `saison` WRITE;
/*!40000 ALTER TABLE `saison` DISABLE KEYS */;
INSERT INTO `saison` VALUES (1,'été'),(2,'automne'),(3,'hiver'),(4,'printemps');
/*!40000 ALTER TABLE `saison` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-24 11:33:53
