/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.5.5-10.1.10-MariaDB : Database - db_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_test`;

/*Table structure for table `tb_iuran` */

DROP TABLE IF EXISTS `tb_iuran`;

CREATE TABLE `tb_iuran` (
  `No` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_KK` varchar(20) DEFAULT NULL,
  `nama_kepala_keluarga` varchar(100) DEFAULT NULL,
  `bulan` varchar(30) DEFAULT NULL,
  `jumlah_iuran` int(11) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tb_iuran` */

insert  into `tb_iuran`(`No`,`id_KK`,`nama_kepala_keluarga`,`bulan`,`jumlah_iuran`) values (3,'13429288','Doni','Oktober',20000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
