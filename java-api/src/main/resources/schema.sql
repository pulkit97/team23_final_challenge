DROP TABLE IF EXISTS trades;
DROP TABLE IF EXISTS book_users;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS counterparty;
DROP TABLE IF EXISTS security;
DROP TABLE IF EXISTS book;

CREATE TABLE book (
id INT PRIMARY KEY NOT NULL UNIQUE,
name VARCHAR(100) NOT NULL
);

CREATE TABLE security (
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
isin VARCHAR(100) NOT NULL,
cusip VARCHAR(100) DEFAULT NULL,
issuer_name VARCHAR(100) NOT NULL,
maturity_date DATE NOT NULL,
coupon FLOAT NOT NULL,
type VARCHAR(100) NOT NULL,
face_value FLOAT NOT NULL,
currency VARCHAR(20) NOT NULL,
status VARCHAR(50) NOT NULL,
trading_book_id INT NOT NULL,
bond_holder VARCHAR(100) NOT NULL,
FOREIGN KEY (trading_book_id) REFERENCES book(id)
);

CREATE TABLE counterparty (
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL
);

CREATE TABLE users (
id INT PRIMARY KEY NOT NULL  AUTO_INCREMENT UNIQUE,
mail VARCHAR(30) NOT NULL UNIQUE,
password VARCHAR(500) NOT NULL,
trading_book_id INT NOT NULL  UNIQUE,
FOREIGN KEY (trading_book_id) REFERENCES book(id)
);


CREATE TABLE book_users (
trading_book_id int NOT NULL,
user_id int NOT NULL,
FOREIGN KEY (trading_book_id) REFERENCES book(id),
FOREIGN KEY (user_id) REFERENCES users(id)
);



CREATE TABLE trades (
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
book_id INT NOT NULL,
security_id INT NOT NULL,
counterparty_id int NOT NULL,
currency VARCHAR(20) NOT NULL,
status VARCHAR(20) NOT NULL,
quantity INT NOT NULL,
unit_price FLOAT NOT NULL,
buy_sell VARCHAR(25) NOT NULL,
trade_date DATE NOT NULL,
settlement_date DATE NOT NULL,
FOREIGN KEY (book_id) REFERENCES book(id),
FOREIGN KEY (security_id) REFERENCES security(id),
FOREIGN KEY (counterparty_id) REFERENCES counterparty(id)
);