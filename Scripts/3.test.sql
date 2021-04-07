select database(),user();
-- 
select * from employee;


-- 
select titleNo, titleName from title;
select titleNo, titleName from title where titleNo = 4;

insert into title values(8,'아일');
update title set titleName = '아이' where titleNo =8;
delete from title where titleNo = 8;


-- 
select * from department;