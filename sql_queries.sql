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

commit;

select * from emp_details_1;
alter table emp_details_1 add email varchar(30);
alter table emp_details_1 ADD CONSTRAINT email_unique UNIQUE (email);
