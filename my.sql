/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : my

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2019-07-27 15:10:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `author`
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES ('1', 'summer', '123', 'summer@qq.com');
INSERT INTO `author` VALUES ('2', 'winner', '123', 'winner@qq.com');

-- ----------------------------
-- Table structure for `blog`
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `author_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', 'jsp', '1');
INSERT INTO `blog` VALUES ('2', 'servlet', '2');
INSERT INTO `blog` VALUES ('18', 'english', '4');
INSERT INTO `blog` VALUES ('19', 'math', '5');
INSERT INTO `blog` VALUES ('20', 'physical', '6');
INSERT INTO `blog` VALUES ('24', 'a', '6');
INSERT INTO `blog` VALUES ('25', 'b', '7');
INSERT INTO `blog` VALUES ('26', 'c', '8');

-- ----------------------------
-- Table structure for `contact`
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gowhere` varchar(255) DEFAULT NULL,
  `emotion` varchar(255) DEFAULT NULL,
  `talking` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES ('16', '1', '魏志豪', '滕王阁', '高兴', '南昌是个好地方');

-- ----------------------------
-- Table structure for `piao`
-- ----------------------------
DROP TABLE IF EXISTS `piao`;
CREATE TABLE `piao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `idcard` varchar(255) DEFAULT NULL,
  `at` varchar(255) DEFAULT NULL,
  `go` varchar(255) DEFAULT NULL,
  `time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of piao
-- ----------------------------
INSERT INTO `piao` VALUES ('1', '1', '1', '2', '福建厦门市', '北京市辖区', '2019-07-02');
INSERT INTO `piao` VALUES ('2', '魏志豪', '1', '360', '福建厦门市', '江西南昌市', '2019-08-01');

-- ----------------------------
-- Table structure for `place`
-- ----------------------------
DROP TABLE IF EXISTS `place`;
CREATE TABLE `place` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(50) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `assess` varchar(255) DEFAULT NULL,
  `scene` varchar(50) DEFAULT NULL,
  `price_low` int(11) DEFAULT NULL,
  `price_high` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of place
-- ----------------------------
INSERT INTO `place` VALUES ('1', '江西', '江西,南昌市,滕王阁', '落霞与孤鹜齐飞，秋水共长天一色.', '1.jpg', '50', '100');
INSERT INTO `place` VALUES ('2', '江西', '江西, 九江市,庐山', '飞流直下三千尺，疑是银河落九天', '2.jpg', '120', '150');
INSERT INTO `place` VALUES ('3', '江西', '江西,鹰潭市,龙虎山', '云气蓬莱近，山阴草树香.', '3.jpg', '100', '120');
INSERT INTO `place` VALUES ('4', '江西', '江西,上饶,玉山县,三清山', '烟绕松石雾成纱,日月同辉映彩霞.', '4.jpg', '120', '200');
INSERT INTO `place` VALUES ('5', '江西', '江西,上饶市,婺源县', '烟波浩渺如仙境,黄花璀璨黄金晴.', '5.jpg', '160', '200');
INSERT INTO `place` VALUES ('6', '江西', '江西,上饶市,弋阳县,龟峰', '众山迤逦来，宛然此前列.', '6.jpg', '100', '120');
INSERT INTO `place` VALUES ('7', '湖南', '湖南,衡阳市,南岳区,衡山', '青冥结精气，磅礴宣地脉.', '7.jpg', '100', '120');
INSERT INTO `place` VALUES ('8', '湖南', '湖南, 岳阳市,岳阳楼', '洞庭天下水，岳阳天下楼.', '8.jpg', '120', '150');
INSERT INTO `place` VALUES ('9', '湖南', '湖南,岳阳市,洞庭湖', '洞庭天下水，岳阳天下楼.', '9.jpg', '50', '100');
INSERT INTO `place` VALUES ('10', '湖南', '湖南,长沙市,马王堆', '千古愁思付劫灰，寻幽莫去马王堆.', '10.jpg', '80', '120');
INSERT INTO `place` VALUES ('11', '湖南', '湖南,长沙市,岳麓书院', '屋舍如庠序，读书兼教文.', '11.jpg', '50', '100');
INSERT INTO `place` VALUES ('12', '湖南', '湖南,张家界市,张家界', '五步称奇，七步叫绝；十步之外，目瞪狗呆.', '12.jpg', '100', '150');
INSERT INTO `place` VALUES ('13', '福建', '福建,龙岩市,永定土楼', '绿波旁，青岭下。错落方圆，墙顶琉璃瓦.', '13.jpg', '100', '120');
INSERT INTO `place` VALUES ('14', '福建', '福建, 武夷山市,武夷山', '武夷占尽人间美,愿乘长风我再来.', '14.jpg', '50', '100');
INSERT INTO `place` VALUES ('15', '福建', '福建,厦门市,鼓浪屿', '鼓浪屿—万石山:赤岸黄墙屋，青波白板船.', '15.jpg', '120', '150');
INSERT INTO `place` VALUES ('16', '福建', '福建,龙岩市,连城县,冠豸山', '福建,龙岩市,连城县,冠豸山', '16.jpg', '80', '120');
INSERT INTO `place` VALUES ('17', '福建', '福建省,泉州市,丰泽区,老君岩', '谩说人间假像真，老君形相亦虚言', '17.jpg', '120', '150');
INSERT INTO `place` VALUES ('18', '福建', '福建,宁德市,鸳鸯溪', '千丈谷底鸳鸯溪 高峦万重披绿衣.', '18.jpg', '100', '160');

-- ----------------------------
-- Table structure for `plan`
-- ----------------------------
DROP TABLE IF EXISTS `plan`;
CREATE TABLE `plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `place` varchar(200) DEFAULT NULL,
  `place_price` int(11) DEFAULT NULL,
  `play_time` varchar(200) DEFAULT NULL,
  `place_id` int(11) DEFAULT NULL,
  `hotel` varchar(200) DEFAULT NULL,
  `hotel_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of plan
-- ----------------------------
INSERT INTO `plan` VALUES ('1', '江西,南昌市,滕王阁', '1200', '3', '1', '三星酒店', '122');
INSERT INTO `plan` VALUES ('2', '江西,南昌市,滕王阁', '2200', '3', '1', '五星酒店', '300');
INSERT INTO `plan` VALUES ('3', '江西,南昌市,滕王阁', '600', '2', '1', '青年酒店', '80');
INSERT INTO `plan` VALUES ('4', '江西, 九江市,庐山', '900', '1', '2', '青年旅社', '70');
INSERT INTO `plan` VALUES ('5', '江西, 九江市,庐山', '1100', '1', '2', '三星酒店', '280');
INSERT INTO `plan` VALUES ('6', '江西, 九江市,庐山', '1500', '2', '2', '五星酒店', '670');
INSERT INTO `plan` VALUES ('7', '福建,厦门市,鼓浪屿', '2000', '3', '15', '五星酒店', '600');
INSERT INTO `plan` VALUES ('8', '福建,厦门市,鼓浪屿', '1500', '2', '15', '三星酒店', '300');
INSERT INTO `plan` VALUES ('9', '福建,厦门市,鼓浪屿', '1000', '2', '15', '青年旅社', '90');
INSERT INTO `plan` VALUES ('10', '江西,上饶,玉山县,三清山', '1000', '2', '4', '青年旅社', '70');
INSERT INTO `plan` VALUES ('11', '江西,鹰潭市,龙虎山', '1000', '2', '3', '青年旅社', '80');
INSERT INTO `plan` VALUES ('12', '江西,上饶市,婺源县', '1200', '2', '5', '青年旅社', '90');
INSERT INTO `plan` VALUES ('13', '江西,上饶市,弋阳县,龟峰', '800', '2', '6', '青年旅社', '75');
INSERT INTO `plan` VALUES ('14', '湖南,衡阳市,南岳区,衡山', '900', '2', '7', '青年旅社', '90');
INSERT INTO `plan` VALUES ('15', '湖南, 岳阳市,岳阳楼', '1300', '5', '8', '青年旅社', '50');
INSERT INTO `plan` VALUES ('16', '湖南,岳阳市,洞庭湖', '2000', '2', '9', '青年旅社', '60');
INSERT INTO `plan` VALUES ('17', '湖南,长沙市,马王堆', '3200', '5', '10', '青年旅社', '70');

-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `blog_id` int(10) DEFAULT NULL,
  `post_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', 'about jsp ', '1', '2019-07-17 14:01:49');
INSERT INTO `post` VALUES ('2', 'about java  ', '1', '2019-07-18 14:02:13');
INSERT INTO `post` VALUES ('3', 'about servlet', '1', '2019-07-19 14:02:48');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '111111', 'www@qq.com');
INSERT INTO `user` VALUES ('2', '2', '222222', 'www@qq.com');
