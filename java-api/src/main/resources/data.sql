
INSERT INTO book (id, name) VALUES  (1, 'trading_book_1');
INSERT INTO book (id, name) VALUES  (2, 'trading_book_2');
INSERT INTO book (id, name) VALUES  (3, 'trading_book_3');
INSERT INTO book (id, name) VALUES  (4, 'trading_book_4');
INSERT INTO book (id, name) VALUES  (5, 'trading_book_5');
INSERT INTO book (id, name) VALUES  (6, 'trading_book_6');

INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (4.37,'USD','',1000,'XS1988387210','BNPParibasIssu 4,37% Microsoft Corp (USD)','2021-08-05','active','CORP',1,'AZ Holdings Inc');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (3.15,'USD','123456780',900,'USN0280EAR64','Airbus 3.15%  USD','2021-07-30','active','CORP',2,'Acme co, Astra Trading Ltd');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (2,'USD','123456bh0',900,'A12356111','UBS Facebook (USD)','2021-09-30','active','CORP',3,'Sovereign Investments');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (3.15,'USD','AMZN 3.15 08/22/27 REGS',900,'USU02320AG12','Amazon','2021-08-03','active','CORP',4,'Muncipal Gov Of Orange County');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460505','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'Goldman Sachs');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460506','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'Goldman Sachs');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460507','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'UBS');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460508','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'UBS');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460509','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'Barclays');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460510','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'Barclays');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460511','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'Barclays');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460512','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'British Telecom');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460513','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'Pension Holdings');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460514','HM Treasury United Kingdon','2021-08-09','active','GOVN',6,'Pension Holdings');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (0.75,'GBP','BDCHBW8',900,'GB00B6460515','HM Treasury United Kingdon','2021-08-09','active','GOVN',6, 'Pension Holdings');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (2.02,'USD','87973RAA8',690,'US87973RAA86','TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S','2021-08-06','active','SOVN',4,'Zurich Pension fund 4');
INSERT INTO security (coupon,currency,cusip,face_value,isin,issuer_name,maturity_date,status,type,trading_book_id, bond_holder) VALUES (1.123,'USD','87973RAA8',340,'IE00B29LNP31','First Norway Alpha Kl.IV','2030-12-22','active','SOVN',4,'Zurich Pension fund 4');

INSERT INTO counterparty (name) VALUES ('AZ Holdings Inc');
INSERT INTO counterparty (name) VALUES ('Acme co');
INSERT INTO counterparty (name) VALUES ('Sovereign Investments');
INSERT INTO counterparty (name) VALUES ('Astra Trading Ltd');
INSERT INTO counterparty (name) VALUES ('Muncipal Gov Of Orange County');
INSERT INTO counterparty (name) VALUES ('Goldman Sachs');
INSERT INTO counterparty (name) VALUES ('UBS');
INSERT INTO counterparty (name) VALUES ('Barclays');
INSERT INTO counterparty (name) VALUES ('British Telecom');
INSERT INTO counterparty (name) VALUES ('Pension Holdings');
INSERT INTO counterparty (name) VALUES ('Zurich Pension fund 4');

INSERT INTO users (mail, password, trading_book_id) VALUES ('user1@db.com','03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4',1);
INSERT INTO users (mail, password, trading_book_id) VALUES ('user2@db.com','5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5',2);
INSERT INTO users (mail, password, trading_book_id) VALUES ('user3@db.com','fe2592b42a727e977f055947385b709cc82b16b9a87f88c6abf3900d65d0cdc3',3);
INSERT INTO users (mail, password, trading_book_id) VALUES ('user4@db.com','20f3765880a5c269b747e1e906054a4b4a3a991259f1e16b5dde4742cec2319a',4);
INSERT INTO users (mail, password, trading_book_id) VALUES ('user5@db.com','79737ac46dad121166483e084a0727e5d6769fb47fa9b0b627eba4107e696078',5);
INSERT INTO users (mail, password, trading_book_id) VALUES ('user6@db.com','f76043a74ec33b6aefbb289050faf7aa8d482095477397e3e63345125d49f527',6);


INSERT INTO book_users (trading_book_id, user_id) VALUES (1, 1);
INSERT INTO book_users (trading_book_id, user_id) VALUES (2, 2);
INSERT INTO book_users (trading_book_id, user_id) VALUES (3, 3);
INSERT INTO book_users (trading_book_id, user_id) VALUES (4, 4);
INSERT INTO book_users (trading_book_id, user_id) VALUES (5, 5);
INSERT INTO book_users (trading_book_id, user_id) VALUES (6, 6);

INSERT INTO trades (buy_sell, currency, quantity, settlement_date, status, trade_date, unit_price, book_id, security_id, counterparty_id) VALUES  ('buy', 'USD', 50, '04-08-21', 'open', '13-05-21', 90, 1, 2, 1);
INSERT INTO trades (buy_sell, currency, quantity, settlement_date, status, trade_date, unit_price, book_id, security_id, counterparty_id) VALUES  ('sell', 'GBP', 40, '04-08-21', 'open', '04-02-21', 89.56, 1, 2, 1);


INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',50,'2021-08-04','open','2021-05-13',90,1,1,1);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','GBP',40,'2021-08-04','open','2021-02-04',89.56,1,1,1);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',1000,'2021-08-23','open','2021-05-13',105.775,2,2,2);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','GBP',900,'2021-09-10','open','2021-02-04',105.775,2,2,2);

INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',50,'2021-08-23','open','2021-05-13',90,3,3,3);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',1000,'2021-08-23','open','2021-05-13',105.775,2,2,4);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','USD',50,'2021-08-23','open','2021-05-13',90,3,3,3);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',60,'2021-09-27','open','2021-02-04',98.56,4,4,5);

INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',50,'2021-08-23','open','2021-08-23',98.56,4,4,5);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',1100,'2021-09-27','open','2021-09-27',110.35,6,5,6);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','GBP',900,'2021-09-28','open','2021-09-28',110.35,6,6,6);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',2000,'2021-09-29','open','2021-09-29',110.35,6,7,7);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','GBP',2000,'2021-09-30','open','2021-09-30',110.35,6,8,7);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',1000,'2021-10-01','open','2021-10-01',110.35,6,9,8);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',900,'2019-10-02','open','2019-10-02',110.35,6,10,8);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','GBP',1900,'2019-10-03','open','2019-10-03',110.35,6,11,8);

INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',600,'2018-10-04','open','2018-10-04',110.35,6,12,9);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',600,'2019-10-05','open','2019-10-05',110.35,6,13,10);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','GBP',700,'2021-06-06','open','2021-06-06',110.35,6,14,10);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','GBP',1300,'2021-10-07','open','2011-10-07',110.35,6,15,10);

INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',60,'2021-09-27','open','2012-02-04',100.13,4,16,11);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',50,'2021-08-23','open','2012-08-23',100.13,4,16,11);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',75,'2021-09-27','open','2013-02-04',100.13,4,16,11);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',50,'2021-08-23','open','2014-08-23',100.13,4,16,11);

INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',300,'2021-09-27','open','2016-02-04',98.76,4,17,11);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',300,'2021-08-23','open','2012-08-23',98.76,4,17,11);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('buy','USD',300,'2021-09-27','open','2013-02-04',98.76,4,17,11);
INSERT INTO trades (buy_sell,currency,quantity,settlement_date,status,trade_date,unit_price,book_id,security_id,counterparty_id) VALUES ('sell','USD',300,'2021-08-23','open','2015-08-23',98.76,4,17,11);