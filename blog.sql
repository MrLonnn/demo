/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.15 : Database - project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`project` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `project`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '课程主键',
  `course_name` varchar(128) DEFAULT NULL COMMENT '课程名',
  `credit` float DEFAULT NULL COMMENT '课程学分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`id`,`course_name`,`credit`) values (1,'语文',3),(2,'数学',4),(3,'英语',3),(4,'政治',5);

/*Table structure for table `score` */

DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sid` bigint(20) unsigned DEFAULT NULL COMMENT '学生id',
  `cid` bigint(20) unsigned DEFAULT NULL COMMENT '课程id',
  `degree` float DEFAULT NULL COMMENT '成绩',
  PRIMARY KEY (`id`),
  KEY `sid` (`sid`),
  KEY `cid` (`cid`),
  CONSTRAINT `score_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `student` (`id`),
  CONSTRAINT `score_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `score` */

insert  into `score`(`id`,`sid`,`cid`,`degree`) values (5,1,2,33.33);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '学生主键',
  `stud_name` varchar(128) DEFAULT NULL COMMENT '学生姓名',
  `sex` tinyint(3) unsigned DEFAULT NULL COMMENT '学生性别',
  `grade` int(11) DEFAULT NULL COMMENT '学生年级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`stud_name`,`sex`,`grade`) values (1,'zhangsan',1,1),(2,'lisi',1,1),(3,'lihua',0,1),(4,'wangwu',1,2),(7,'lilei',0,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
