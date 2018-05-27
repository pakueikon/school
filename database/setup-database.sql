CREATE SCHEMA IF NOT EXISTS `school` DEFAULT CHARACTER SET utf8mb4 ;
USE `school` ;
DROP TABLE IF EXISTS `school`.`demo` ;

CREATE TABLE IF NOT EXISTS `school`.`demo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `content` VARCHAR(45) NOT NULL DEFAULT 'default content',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
ROW_FORMAT = Dynamic;
