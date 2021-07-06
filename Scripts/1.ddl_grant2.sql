-- 내 스키마
DROP SCHEMA IF EXISTS web_gradle_erp;

-- 내 스키마
CREATE SCHEMA web_gradle_erp;


-- 부서
CREATE TABLE web_gradle_erp.department (
   deptNo   INT         NOT NULL COMMENT '부서번호', -- 부서번호
   deptName VARCHAR(20) NOT NULL COMMENT '부서명', -- 부서명
   floor    INT         NULL     COMMENT '위치' -- 위치
)
COMMENT '부서';

-- 부서
ALTER TABLE web_gradle_erp.department
   ADD CONSTRAINT PK_department -- 부서 기본키
      PRIMARY KEY (
         deptNo -- 부서번호
      );

-- 사원
CREATE TABLE web_gradle_erp.employee (
   empno   INT         NOT NULL COMMENT '사원번호', -- 사원번호
   empname VARCHAR(20) NOT NULL COMMENT '사원명', -- 사원명
   title   VARCHAR(20) NULL     COMMENT '직책', -- 직책
   manager INT         NULL     COMMENT '직속상사', -- 직속상사
   salary  INT         NULL     COMMENT '급여', -- 급여
   dept    INT         NULL     COMMENT '부서' -- 부서
--    hiredate DATE       NULL     COMMENT '입사일' -- 입사일
   
)
COMMENT '사원';

-- 사원
ALTER TABLE web_gradle_erp.employee
   ADD CONSTRAINT PK_employee -- 사원 기본키
      PRIMARY KEY (
         empno -- 사원번호
      );


-- 사원
ALTER TABLE web_gradle_erp.employee
   ADD CONSTRAINT FK_employee_TO_employee -- 사원 -> 사원
      FOREIGN KEY (
         manager -- 직속상사
      )
      REFERENCES web_gradle_erp.employee ( -- 사원
         empno -- 사원번호
      );

-- 사원
ALTER TABLE web_gradle_erp.employee
   ADD CONSTRAINT FK_department_TO_employee -- 부서 -> 사원
      FOREIGN KEY (
         dept -- 부서
      )
      REFERENCES web_gradle_erp.department ( -- 부서
         deptNo -- 부서번호
      );
      
