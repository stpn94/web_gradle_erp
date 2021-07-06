select database(),user();
-- 
select * from employee;
SELECT * FROM department;

-- 
select titleNo, titleName from title;
select titleNo, titleName from title where titleNo = 4;

insert into title values(8,'아일');
update title set titleName = '아이' where titleNo =8;
delete from title where titleNo = 8;

SELECT *
  FROM employee;

-- 
select * from department;

-- <select id="selectEmployeeByAll" resultMap="resEmployee">
		SELECT empno, empname, title, manager, salary, dept
		FROM Employee;

-- 	<select id="selectEmployeeByNo" resultMap="resEmployee">
		SELECT empno, empname, title, manager, salary, dept
		FROM Employee
		WHERE empno = #{empno}

-- 	<insert id="insertEmployee" parameterType="Employee">
		insert
		into Employee (empno, empname, title, manager, salary, dept)
		values (#{empno}, #{empname}, #{title}, #{manager}, #{salary}, #{dept})
		
-- 		values (5000, '이종윤', '대리', '4377', 2000000, 2);
-- 	<update id="updateEmployee">
		update Employee
		set empname=#{empname}, title=#{title}, manager=#{manager}, salary=#{salary}, dept=#{dept}
		where empno=#{empno}
		
-- 		set empname='이종윤', title='대리', manager='4377', salary=2000000, dept=2
-- 		where empno=5000

-- 	<delete id="deleteEmployee">
		delete
		from Employee
		where empno=#{empno}
