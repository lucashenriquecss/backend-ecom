CREATE TABLE products(
     id VARCHAR(255) PRIMARY KEY UNIQUE NOT NULL,
     code VARCHAR(255) NOT NULL,
     name VARCHAR(255) NOT NULL,
     description VARCHAR(255) NOT NULL,
     price INT NOT NULL
)