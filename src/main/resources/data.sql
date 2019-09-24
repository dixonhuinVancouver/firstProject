INSERT INTO pig (id, sex, birth_date, location, category, is_abnormal, weaned, weight) 
          VALUES (876823771,0,'2019-09-22', '中国浙江省杭州市余杭区 文一西路969号', '长白猪', 1, 5, 10);
INSERT INTO pig (id,sex,birth_date,location,category, is_abnormal,weaned,weight) 
          VALUES (1835095974, 1,'2019-09-20', '浙江省湖州市安吉县', '大约克猪', 1, 2, 8);
INSERT INTO pig (id,sex,birth_date,location,category, is_abnormal,weaned,weight) 
          VALUES (1882610633, 0,'2019-09-22', '广东省云浮市新兴县新城镇东堤北路9号', '杜洛克猪', 0, 3, 6);
INSERT INTO pig (id,sex,birth_date,location,category, is_abnormal,weaned,weight) 
          VALUES (1882610684, 1,'2019-09-20', '河南省南阳市内乡灌涨水田村', '巴马香猪', 1, 7, 8);
INSERT INTO pig (id,sex,birth_date,location,category, is_abnormal,weaned,weight) 
          VALUES (2078054544, 1,'2019-09-20', '河南省新郑市薛店镇', '皮特兰猪', 1, 13, 3);
INSERT INTO pig (id,sex,birth_date,location,category, is_abnormal,weaned,weight) 
          VALUES (2078054543, 0,'2019-09-20', '上海市共和新路2750号', '太湖猪', 1, 13, 3);          
INSERT INTO pork (id, pig_id, sale_date,location, category, weight) 
          VALUES (1, 2078054543,'2019-09-20', '上海市共和新路2750号', '里脊', 6.4);
INSERT INTO pork (id, pig_id, sale_date,location, category, weight) 
          VALUES (2, 2078054543,'2019-09-20', '上海市共和新路2750号', '臀肉', 3.5);
INSERT INTO pork (id, pig_id, sale_date,location, category, weight) 
          VALUES (3, 2078054543,'2019-09-20', '上海市共和新路2750号', '排骨', 2.9);
INSERT INTO pork (id, pig_id, sale_date,location, category, weight) 
          VALUES (4, 1835095974,'2019-09-20', '浙江省湖州市安吉县', '肘子', 20.1);
INSERT INTO pork (id, pig_id, sale_date,location, category, weight) 
          VALUES (5, 1835095974,'2019-09-20', '浙江省湖州市安吉县', '脚', 10.3);

