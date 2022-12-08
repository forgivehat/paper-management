/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : xuanti

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2022-12-08 19:02:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES ('1', 'admin', 'admin', '0');

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `level` int(11) NOT NULL,
  `acc_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------

-- ----------------------------
-- Table structure for t_clazz
-- ----------------------------
DROP TABLE IF EXISTS `t_clazz`;
CREATE TABLE `t_clazz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `major_id` int(11) NOT NULL,
  `major_name` varchar(255) DEFAULT NULL,
  `dep_id` int(11) DEFAULT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `college_id` int(11) DEFAULT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_clazz
-- ----------------------------

-- ----------------------------
-- Table structure for t_college
-- ----------------------------
DROP TABLE IF EXISTS `t_college`;
CREATE TABLE `t_college` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_college
-- ----------------------------

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `content` varchar(255) DEFAULT NULL,
  `teacher_id` int(11) NOT NULL,
  `paper_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_comment
-- ----------------------------

-- ----------------------------
-- Table structure for t_department
-- ----------------------------
DROP TABLE IF EXISTS `t_department`;
CREATE TABLE `t_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `college_id` int(11) NOT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_department
-- ----------------------------

-- ----------------------------
-- Table structure for t_major
-- ----------------------------
DROP TABLE IF EXISTS `t_major`;
CREATE TABLE `t_major` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `dep_id` int(11) NOT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `college_id` int(11) DEFAULT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_major
-- ----------------------------

-- ----------------------------
-- Table structure for t_paper
-- ----------------------------
DROP TABLE IF EXISTS `t_paper`;
CREATE TABLE `t_paper` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `thesis_id` int(11) NOT NULL,
  `author_id` int(11) NOT NULL,
  `author_name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_paper
-- ----------------------------

-- ----------------------------
-- Table structure for t_phase
-- ----------------------------
DROP TABLE IF EXISTS `t_phase`;
CREATE TABLE `t_phase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `start_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `end_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `dep_id` int(11) NOT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `college_id` int(11) NOT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_phase
-- ----------------------------

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `clazz_id` int(11) NOT NULL,
  `clazz_name` varchar(255) DEFAULT NULL,
  `dep_id` varchar(255) NOT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `college_id` int(11) NOT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  `acc_id` int(11) NOT NULL,
  `final_thesis_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------

-- ----------------------------
-- Table structure for t_stu_thesis
-- ----------------------------
DROP TABLE IF EXISTS `t_stu_thesis`;
CREATE TABLE `t_stu_thesis` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `thesis_id` int(11) NOT NULL,
  `stu_id` int(11) NOT NULL,
  `stu_preference` int(11) DEFAULT NULL,
  `teacher_id` int(11) NOT NULL,
  `teacher_preference` int(11) DEFAULT NULL,
  `result` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_stu_thesis
-- ----------------------------

-- ----------------------------
-- Table structure for t_teacher
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `dep_id` int(11) NOT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `max_thesis_num` int(11) NOT NULL,
  `acc_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for t_thesis
-- ----------------------------
DROP TABLE IF EXISTS `t_thesis`;
CREATE TABLE `t_thesis` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `direction` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `teacher_id` int(11) NOT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `state` int(12) DEFAULT NULL,
  `dep_id` int(11) NOT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `college_id` int(11) NOT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_thesis
-- ----------------------------
