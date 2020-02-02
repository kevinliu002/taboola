
/* Create a table called Products that has columns name and category.*/
CREATE TABLE PRODUCTS(Name varchar(255), Category varchar(255),
PRIMARY KEY (Name));


/*Create a tabe called Price History that has column name, price,
and start/end date */
CREATE TABLE PRICEHISTORY AS
SELECT Name
FROM PRODUCTS;

/*SQLLite doesn't support multiple adds, so using ALTER/ADD in sucession*/
ALTER TABLE PRICEHISTORY
ADD COLUMN Price VARCHAR(255);
ALTER TABLE PRICEHISTORY
ADD COLUMN StartDate VARCHAR(255);
ALTER TABLE PRICEHISTORY
ADD COLUMN EndDate VARCHAR(255);


/* Join query joins Products and PriceHistory together.*/
SELECT  PRODUCTS.Name,
        PRODUCTS.Category,
        PRICEHISTORY.Price,
        PRICEHISTORY.StartDate,
        PRICEHISTORY.EndDate
FROM PRODUCTS
INNER JOIN PRICEHISTORY
ON PRODUCTS.Name = PRICEHISTORY.Name
