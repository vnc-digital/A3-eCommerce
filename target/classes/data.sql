DROP TABLE IF EXISTS user;
 
CREATE TABLE user (
user_id VARCHAR(250) PRIMARY KEY,
user_name VARCHAR(250) NOT NULL,
name VARCHAR(250) NOT NULL,
email VARCHAR(250) NOT NULL,
mobile_no VARCHAR(250) NOT NULL,
address VARCHAR(250) NOT NULL,
);

INSERT INTO user VALUES('USR0001', 'FirstUser' ,'First User','FirstUser@FirstUser.com','1111111111','DoorNo , Some Street , Some Address , 560066');
INSERT INTO user VALUES('USR0002', 'SecondUser' ,'Second User','SecondUser@SecondUser.com','1111111112','DoorNo , Extra Street , Same Address , 560066');

DROP TABLE IF EXISTS product;
 
CREATE TABLE product (
  product_id VARCHAR(250) PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  category VARCHAR(250) NOT NULL,
  quantity INT NOT NULL,
  price INT NOT NULL
);

INSERT INTO PRODUCT VALUES('PR0001', 'Milk' ,'ESSENTIALS',12,10);
INSERT INTO PRODUCT VALUES('PR0002', 'Butter' ,'ESSENTIALS',10,10);
INSERT INTO PRODUCT VALUES('PR0003', 'Cheese' ,'ESSENTIALS',20,10);

INSERT INTO PRODUCT VALUES('PR0004', 'Soap' ,'COSMETIC',15,10);
INSERT INTO PRODUCT VALUES('PR0005', 'Scrub' ,'COSMETIC',32,10);
INSERT INTO PRODUCT VALUES('PR0006', 'Cream' ,'COSMETIC',80,10);

DROP TABLE IF EXISTS orders;

CREATE TABLE orders (
  order_id VARCHAR(250) PRIMARY KEY,
  user_id VARCHAR(250) NOT NULL,
  status VARCHAR(250) NOT NULL,
  price INT NOT NULL,
  address VARCHAR(250)
  
);

DROP TABLE IF EXISTS order_item;

CREATE TABLE order_item (
  orderitem_id VARCHAR(250) PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  category VARCHAR(250) NOT NULL,
  quantity INT NOT NULL,
  price INT NOT NULL,
  status VARCHAR(250) NOT NULL,
  order_id VARCHAR(250), 
  FOREIGN KEY(order_id) REFERENCES orders(order_id)
  
);