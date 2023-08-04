
INSERT INTO book (id, name) VALUES  (1, 'trading_book_1');
INSERT INTO book (id, name) VALUES  (2, 'trading_book_2');
INSERT INTO book (id, name) VALUES  (3, 'trading_book_3');
INSERT INTO book (id, name) VALUES  (4, 'trading_book_4');
INSERT INTO book (id, name) VALUES  (5, 'trading_book_5');
INSERT INTO book (id, name) VALUES  (6, 'trading_book_6');

INSERT INTO counterparty (name) VALUES ('AZ Holdings Inc');
INSERT INTO counterparty (name) VALUES ('ABC');

INSERT INTO security (coupon, currency, face_value, isin, issuer_name, maturity_date, status, type, trading_book_id, counterparty_id) VALUES  ('4.37', 'USD', '1000', 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '05-08-21', 'active', 'CORP', 1, 1);
INSERT INTO security (coupon, currency, cusip, face_value, isin, issuer_name, maturity_date, status, type, trading_book_id, counterparty_id) VALUES  ('3.15', 'USD', '123456780', '900', 'USN0280EAR64', 'Airbus 3.15%  USD', '30-07-21', 'active', 'CORP', 2, 2);
INSERT INTO security (coupon, currency, cusip, face_value, isin, issuer_name, maturity_date, status, type, trading_book_id, counterparty_id) VALUES  ('3.15', 'USD', '123456780', '900', 'USN0280EAR64', 'Airbus 3.15%  USD', '30-07-21', 'active', 'CORP', 2, 2);



INSERT INTO users (mail, password, trading_book_id) VALUES ('user1@db.com', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4', 1);
INSERT INTO users (mail, password, trading_book_id) VALUES ('user2@db.com', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', 2);

INSERT INTO book_users (trading_book_id, user_id) VALUES (1, 1);
INSERT INTO book_users (trading_book_id, user_id) VALUES (2, 1);
INSERT INTO book_users (trading_book_id, user_id) VALUES (1, 2);

INSERT INTO trades (buy_sell, currency, quantity, settlement_date, status, trade_date, unit_price, book_id, security_id, counterparty_id) VALUES  ('buy', 'USD', 50, '04-08-21', 'open', '13-05-21', 90, 1, 2, 1);
INSERT INTO trades (buy_sell, currency, quantity, settlement_date, status, trade_date, unit_price, book_id, security_id, counterparty_id) VALUES  ('sell', 'GBP', 40, '04-08-21', 'open', '04-02-21', 89.56, 1, 2, 1);

