SELECT * FROM System.emp_details;
create table emp_details_1(id number, first_name varchar2(100), last_name varchar2(100), salary float, CONSTRAINT id_pk PRIMARY KEY (id));
insert into emp_details_1 (id, first_name, last_name, salary) values (104, 'Siri', 'Peram', 2000);
commit;
alter table emp_details modify last_name varchar2(20);
alter table emp_details rename column email to email_id;
alter table emp_details add email varchar2(30);
alter table emp_details drop column email;
truncate table emp_details;
 

delete from emp_details where id = 101;
delete from emp_details;
select * from emp_details;

insert into emp_details_1 (id, first_name, last_name, salary) values (101, 'Mahesh', 'Padmam', 2000);
insert into emp_details_1 (id, first_name, last_name, salary) values (102, 'Ashok', 'Te', 2000);
insert into emp_details_1 (id, first_name, last_name, salary) values (103, 'Gangadhar', 'Perla', 2000);
insert into emp_details_1 (id, first_name, last_name, salary) values (104, 'Dhatrika', 'Sai', 2000);
insert into emp_details_1 (id, first_name, last_name, salary) values (105, 'Dhruvika', 'Shree', 2000);
insert into emp_details_1 (id, first_name, last_name, salary) values (106, 'Siva', 'Reddy', 2000);

--MySQL
create table emp_details_1(id int, first_name varchar(100), last_name varchar(100), salary float, CONSTRAINT id_pk PRIMARY KEY (id));
insert into emp_details_1 (id, first_name, last_name, salary, email) values (104, 'Siri', 'Peram', 2000, 'abc@gmail.com');
create database batch04;
commit;
--MySQL

select * from emp_details_1;
alter table emp_details_1 add email varchar(30);
alter table emp_details_1 ADD CONSTRAINT email_unique UNIQUE (email);

insert into emp_details_1 (id, first_name, last_name, salary, email) values (101, 'Mahesh', 'Padmam', 3000, 'mahesh@gmail.com');
insert into emp_details_1 (id, first_name, last_name, salary, email) values (102, 'Ashok', 'Te', 2000, 'ashok@gmail.com');
insert into emp_details_1 (id, first_name, last_name, salary, email) values (103, 'Gangadhar', 'Perla', 4000,'gangadhar@gmail.com');
insert into emp_details_1 (id, first_name, last_name, salary, email) values (104, 'Dhatrika', 'Sai', 5000, 'dhatrika@gmail.com');
insert into emp_details_1 (id, first_name, last_name, salary, email) values (105, 'Dhruvika', 'Shree', 1000, 'dhruvika@gmail.com');
insert into emp_details_1 (id, first_name, last_name, salary, email) values (106, 'Siva', 'Reddy', 6000, 'siva@gmail.com');


select * from emp_details_1 WHERE FIRST_NAME LIKE '%D%' ORDER BY SALARY ASC;

SELECT Max(SALARY)  FROM emp_details_1  
SELECT min(SALARY)  FROM emp_details_1  
SELECT avg(SALARY)  FROM emp_details_1  
SELECT sum(SALARY)  FROM emp_details_1  


select firs from emp_details_1 WHERE id in(101, 102);

select * from emp_details_1 WHERE FIRST_NAME LIKE '%D%';

UPDATE emp_details_1 SET email = 'abc@gmail.com'  WHERE id= 102
