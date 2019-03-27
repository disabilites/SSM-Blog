CREATE DATABASE IF NOT EXISTS `ssm-blog` ;
USE `ssm-blog`;

DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`(
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `date` DATETIME NOT NULL,
  `content_html` LONGTEXT NOT NULL,
  `content_md` LONGTEXT NOT NULL,
  `classification` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `date_UNIQUE` (`date` ASC));

DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `a_id` INT NOT NULL,
  `a_title` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `date` DATETIME NOT NULL,
  `content` VARCHAR(1000) NOT NULL,
  `state` TINYINT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));

DROP TABLE IF EXISTS `user`;
  CREATE TABLE `user` (
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`name`));

DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `name` VARCHAR(100) NOT NULL,
  `url` VARCHAR(100) NOT NULL,
  `date` DATETIME NOT NULL,
  PRIMARY KEY (`name`));