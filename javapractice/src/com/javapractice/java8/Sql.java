package com.javapractice.java8;

public class Sql {
	
	/*
	 * 
	 * CREATE TABLE User (id int not null auto_increment,
	 * LastName varchar(255),FirstName varchar(255),Address varchar(255),
	 * City varchar(255),Salary varchar(255),primary key(id));
	 * 
	 * 
	 * insert into User (lastName,firstName,Address,City,Salary)values ('naik',
	 * 'jay','chinchwad','pune', 25000);
	 * 
	 * update employee set username = 'rohan', password='kulkarni' where id=1;
	 * 
	 * 
	 * delete from user where id=3;
	 * 
	 * select * from user where city='pune';
	 * 
	 * ALTER TABLE user ADD Email varchar(255);
	 * ALTER TABLE user modify Email varchar(125);
	 * ALTER TABLE user drop Email;
	 * 
	 * 
	 * Select customers.customerid,customername, email, accountsid,balance from customers
	 * INNER JOIN accounts on customers.customerid = accounts.customerid;
	 * 
	 * 
	 * select customername, email, accountsid, balance from customers
	 *  LEFT JOIN accounts on customers.customerid = accounts.customerid;
	 *  
	 *  select customername, email, accountsid, balance from customers 
	 *  RIGHT JOIN accounts on customers.customerid = accounts.customerid;
	 *  
	 *  select * from customers left join accounts on customers.customerid =
	 *  accounts.customerid union select * from customers right join accounts on
	 *  customers.customerid = accounts.customerid;
	 *  
	 *  
	 *  3rd Highest salary
	 *  SELECT salary FROM (SELECT salary FROM student ORDER BY salary DESC LIMIT 3) AS
	 *  salary ORDER BY salary LIMIT 1;
	 *  


	 */

}
