CREATE TABLE product (
                     id INTEGER NOT NULL AUTO_INCREMENT,
                     ean BIGINT NOT NULL,
                     name VARCHAR(128) NOT NULL,
                     idSupplier INTEGER NOT NULL,
                     idDestination INTEGER NOT NULL,
                     PRIMARY KEY (id)
);

CREATE TABLE supplier (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL
);

CREATE TABLE destination (
                          id INTEGER NOT NULL AUTO_INCREMENT,
                          name VARCHAR(128) NOT NULL
);
