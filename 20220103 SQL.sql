-- ict_practice를 쓰도록 해주세요.
USE ict_practice;

-- 앞에 스키마명을 추가로 입력해 스키마명.테이블명 으로 조회도 가능함.
SELECT * FROM usertbl;

-- 유저를 두 명만 더 추가해주세요.
-- 정보는 전부 여러분들이 알아서 집어넣어 주시되, 키는 한 명은 160대로 해주세요.
INSERT INTO userTbl VALUES('KKK', '크크크', 2001, '서울', '01011112222', 175, '2020-03-05');
INSERT INTO userTbl VALUES('BBB', '뱅뱅뱅', 2001, '서울', '01011112222', 168, '2020-03-05');

-- 새로 추가한 2명의 구매내역을 추가해주세요.
-- 2명 구매내역 합산 3개를 추가해주세요.
INSERT INTO buytbl VALUES(null, 'KKK', '도장', '생필품', 5000, 1);
INSERT INTO buytbl (user_id, prod_name, group_name, price, amount)
     VALUES(null, 'BBB', '무선이어폰', '주변기기', 100000, 1);
INSERT INTO buytbl VALUES(null, 'BBB', '마이크', '전자기기', 30000, 1);
SELECT * FROM buytbl;

-- 여태까지의 SELECT 구문은 조건 없이 모든 데이터를 다 조회했습니다.
-- 극단적인 경우 employees 테이블의 모든 row를 조회하다보니
-- 조회시간이 굉장히 오래 잡히는 케이스가 발생했습니다.
-- 따라서 조건에 맞도록 필터링을 할 수 있고, 이를 위해 사용하는 구문은 WHERE 구문입니다.
-- SELECT 컬럼명1, 컬럼명2 ... FROM 테이블명 WHERE 컬럼명=조건식;

-- 아래는 이름이 손흥민인 사람만 조회하는 구문입니다.
SELECT * FROM usertbl WHERE user_name = '손흥민';

-- 서울에 사는 사람만 조회해보세요.
SELECT * FROM usertbl WHERE addr = '서울';

-- 관계연산자를 이용해서 대소비교를 하거나
-- and, or을 이용해 조건 여러개를 연결할 수 있습니다.
-- 키 180 이상인 사람만 조회해주세요.
SELECT * FROM usertbl WHERE height >= 180; 

-- AND를 이용해 91 ~ 99년생 까지만 조회하는 구문을 만들어보세요.
-- hint : 91보다는 크거나 같고, "그리고", 99보다는 작거나 같다
SELECT * FROM usertbl WHERE (birth_year >= 1991) and (birth_year <= 1999);

-- BETWEEN ~ AND 구문을 이용하면 birth_year를 한 번만 적고도
-- 해당 범위의 조회가 가능합니다.
-- 적어넣은 두 개의 숫자도 포함 합니다.
SELECT * FROM usertbl WHERE birth_year BETWEEN 1991 and 1999;

-- 위와 같이 숫자는 연속된 범위를 갖기 때문에 범위 연산자로 처리가 가능하지만
-- addr같은 자료는 서울이 크다던가 영국이 작다던가 하는 연산적 처리가 불가능합니다.
-- 먼저 지역이 서울이거나 혹은 춘천인 사람의 정보를 WHERE절로 조회해주세요.
SELECT * FROM usertbl WHERE (addr = '서울') or (addr = '춘천');

-- in키워드를 사용하면 컬럼명 in (데이터1, 2, 3, 4...);
-- 특정 컬럼에 괄호에 담긴 데이터가 포함되는 경우를 전부 출력합니다.
-- 경기, 춘천, 남아공에 있는 사람들만 in 키워드로 조회해주세요.
SELECT * FROM usertbl WHERE addr IN ('경기', '춘천', '남아공');

-- like 연산자는 일종의 표현 양식을 만들어줍니다.
-- like 연산자를 이용하면 %라고 불리는 와일드 카드나 혹은 _라고 불리는
-- 와일드 카드 문자를 이용해 매칭되는 문자나 문자열을 찾습니다.

-- 임씨를 찾는 케이스(%는 몇글자가 오더라도 상관 없음)
-- 아래 구문은 임으로 시작하는 모든 요소를 다 가져옵니다. '임'도 포함
SELECT * FROM usertbl WHERE user_name like ('임%');

-- 휴대폰 번호가 01로 시작하는 모든 사람을 찾아보세요
SELECT * FROM usertbl WHERE phone_number like ('01%');

-- 두 글자만 찾는 케이스(_는 하나에 한 글자임)
SELECT * FROM usertbl WHERE user_name like '__';

-- user_id가 3글자이면서 W로 끝나는 사람만 조회해보세요.
SELECT * FROM usertbl WHERE user_id like '__W';

-- 서브쿼리(하위쿼리)란 1차적 결과를 얻어놓고,
-- 거기서 다시 조회구문을 중첩해서 날리는 것을 의미합니다.
-- 임재원보다 키가 큰 사람을 조회하는 예시를 보겠습니다.

-- 원시적인 방법
-- 1. 임재원의 키를 WHERE절을 이용해 확인한다
SELECT height FROM usertbl WHERE user_name = '임재원';
-- 2. 확인한 임재원의 키를 쿼리문에 넣는다
-- 183보다 큰 사람의 이름과 키만 조회해보겠습니다.
SELECT user_name, height FROM usertbl WHERE (height > 183);


-- 서브쿼리 활용 방법
-- 서브쿼리는 FROM절 다음에 ()를 이용해서
-- SELECT 구문을 한 번 더 활용합니다.
SELECT user_name, height FROM usertbl WHERE height >
	(SELECT height FROM usertbl WHERE user_name = '크크크');
    
-- 서브쿼리를 활용해 '임재원' 보다 먼저 태어난 사람들만 골라내보세요.
-- 1. 임재원의 생년을 얻는 쿼리문부터 작성합니다.
SELECT birth_year FROM usertbl WHERE user_name = '임재원';
-- 2. 입력할 생년보다 더 작은 생년값을 가진 요소만 출력되는 쿼리문 작성
SELECT birth_year, user_name FROM usertbl WHERE birth_year < 1996;
-- 3. 2의 WHERE절 숫자 들어갈 부분에 1의 쿼리문을 대신 집어넣기
SELECT birth_year, user_name FROM usertbl WHERE birth_year <
	(SELECT birth_year FROM usertbl WHERE user_name = '임재원');
    
-- 최대값은 max()로 구합니다.
-- 현재 usertbl컬럼에서 가장 나이가 적은 사람의 생년 조회
SELECT max(birth_year) FROM usertbl;
SELECT birth_year FROM usertbl;

-- user_id에 M이 포함된 사람들 중 키가 제일 작은 사람보다
-- 키가 더 큰 사람을 구하시오.(min을 활용하세요)
SELECT  * FROM usertbl WHERE height;
SELECT min(height) FROM usertbl WHERE user_id like '%M%';
SELECT * FROM usertbl WHERE height >
	(SELECT min(height) FROM usertbl WHERE user_id like '%M%');
    
-- 2020년 가입자중 가입일이 제일 빠른 사람보다 키가 큰 사람을 조회해주세요.
-- 날짜도 부등호로 조회 가능합니다.(작다 : 이전날짜, 크다 : 이후날짜)

-- 1. 2020년 가입자중 가입일이 제일 빠른 사람의 가입일자 구하기
SELECT min(reg_date) FROM usertbl WHERE reg_date >= '2020-01-01';
-- 2. 1의 쿼리문을 조건으로 해서 가입일이 제일 빠른 사람의 키 구하기
SELECT height FROM usertbl WHERE reg_date =
	(SELECT min(reg_date) FROM usertbl WHERE reg_date >= '2020-01-01');
-- 3. 2에서 구한 키를 조건으로 해서 최종적인 명단을 얻어냄
SELECT * FROM usertbl WHERE height > 
(SELECT height FROM usertbl WHERE reg_date =
	(SELECT min(reg_date) FROM usertbl WHERE reg_date >= '2020-01-01'));

-- 유저를 다섯명 더 추가하겠습니다
INSERT INTO userTbl VALUES ('KJV', '김자바', 1983, '서울', '01112341234', 171, '2020-08-15');
INSERT INTO userTbl VALUES ('ADR', '압둘라', 1995, '경기', '01012341234', 183, '2021-04-01');
INSERT INTO userTbl VALUES ('YSO', '야스오', 2001, '부산', '01043214321', 165, '2021-10-08');
INSERT INTO userTbl VALUES ('ZYA', '장위안', 1985, '부산', '01155555555', 164, '2020-02-28');
INSERT INTO userTbl VALUES ('SPR', '스프링', 1987, '강원', '01066666666', 184, '2021-12-31');
INSERT INTO userTbl VALUES ('JSP', '쟈스피', 1989, '전라', '01077777777', 177, '2022-01-01');

-- ANY, ALL, SOME 구문은 서브쿼리와 조합해서 사용합니다.
-- 지역이 서울인 사람보다 키가 작은 사람을 찾는 쿼리문
-- 1. 서울 사람의 키 전체 리스트 가져오기
SELECT height FROM usertbl WHERE addr = '서울';
-- 2. 위 구문을 서브쿼리로 해서 서울사람보다 키가 작은 사람을 찾을 경우 에러가 납니다.
-- 현재 데이터셋은 결과가 여러개인데 어느 데이터를 기반으로
-- height을 조건에 잡아줄 지 모호하기 때문에 에러가 납니다.
SELECT * FROM usertbl WHERE height <
	(SELECT height FROM usertbl WHERE addr = '서울');

-- ANY 구문을 사용하면 169, 171, 186 모든 데이터에 대해 OR로 처리가 됩니다.
-- 개별값 모두에 대해 OR처리가 붙고 그래서 아래와 같이
-- (height < 169) OR (height < 171) OR (height < 186) OR ...
-- 여러개 조건이 OR로 연결됩니다.
-- ANY는 OR로 연결된다는 특성상 범위가 가장 넓은 조건 하나로 통일됩니다.
-- 현재 코드에서는 186보다 작은 데이터는 전부 잡혀 나옵니다.
-- ANY와 SOME은 사실상 차이가 없는 구문으로 보셔도 무방합니다.
-- 아래 ANY자리에 SOME을 대신 넣어도 똑같이 작동합니다.
SELECT * FROM usertbl WHERE height < ANY
	(SELECT height FROM usertbl WHERE addr = '서울');
    
-- ALL 구문을 사용하면 모든 데이터에 대해 AND로 처리됩니다.
-- 개별값 모두에 대해 AND 처리가 붙고 그래서 아래와 같이
-- (height < 169) AND (height < 171) AND (height < 186) AND ...
-- 여러개 조건이 AND로 연결됩니다.
-- 제일 작은수 보다 작은 값만 TRUE로 판정합니다.

SELECT * FROM usertbl WHERE height < ALL
	(SELECT height FROM usertbl WHERE addr = '서울');
