# 멋쟁이 사자처럼 JAVA (2022/10/04 ~ )

## Day 1 (10/04 화)
- 배열
- 화폐 개수 알고리즘

## Day 2 (10/05 수)
- 계산기
- 숫자 생성 interface를 사용한 계산기
- 의존 주입(DI)
    - Random 숫자 생성기, Specifit 숫자 생성기를 주입한 Calulator
- List

## Day 3 (10/06 목)
- Set
    - 랜덤 숫자, 랜덤 알파벳 중복 제거
- Map
    - 문자열에서 알파벳 개수 세기
- File 입력
    - FileReader을 사용해서 파일, 디렉토리 불러오기
    - BufferedReader을 사용해서 n개 문자, n개 라인 파일 입력
  
## Day 4 (10/07 금)
- File IO
    - File 입력 복습
    - FileWriter을 사용해서 파일 생성
    - BufferedWriter을 사용해서 text 파일에 출력
- 대용량 파일 처리
    - MDIS에서 2021 인구 전입 / 전출 데이터 다운
    - CSV 파일에 있는 10만개 이상의 데이터 읽기
    - CSV 파일 내용 추출해서 필요한 정보만 text 파일에 출력 (파싱)
    - 추출한 데이터를 바탕으로 도시간에 전입 수 카운트
        - ex) 서울 -> 경기도 : 182,995 명
    - 추출한 데이터를 이용한 Heat Map 그리기

## Day 5 (10/11 화)
- 알고리즘
    - 입력받은 숫자의 자릿수 구하기
    - 각 자릿수 더하기

## Day 6 (10/12 수)
- 알고리즘
    - 최댓값과 위치 구하기
    - Template Callback 패턴을 활용한 최대값, 최소값 구하기
    - Template Callback 패턴을 활용한 4칙연산 계산기

## Day 7 (10/13 목)
- 알고리즘
  - 정렬(버블정렬, 선택정렬)

## Day 8 (10/14 금)
- 알고리즘
  - 삽입정렬

## Day 9 (10/17 월)
- 알고리즘
  - 별찍기
    - 직각삼각형
    - 피라미드 
    - 마름모

## Day 10 (10/18 화)
- 알고리즘
  - 별찍기
    - 직사각형
    - 정사각형
    - 재귀를 활용한 별찍기

## Day 11 (10/19 수)
- 알고리즘
  - 배열을 활용한 Stack 직접 구현 (push, pop)

## Day 12 (10/20 목)
- 알고리즘
  - 배열을 활용한 Stack 직접 구현 (isEmpty, peek)
- Test code에서 Exception Test (lambda 사용)

## Day 13 (10/21 금)
- 알고리즘 - 괄호 풀기
  - int형 변수를 사용한 괄호 풀기 => 3괄호 문제풀 때 활용하기 어려움
  - String의 replace를 사용한 괄호 풀기 => 시간 초과 발생
  - 스택을 활용한 괄호 풀기 (소괄호, 중괄호, 대괄호)
  - 스택 괄호 풀기 테스트 진행
  - 프로그래머스 올바른 괄호

## Day 14 (10/24 월)
- 알고리즘
  - Arrays.copyOfRange() 메소드를 사용한 배열 자르기
  - PriorityQueue 사용 예제
  - 프로그래머스 K번째수

## Day15 (10/25 화)
- 알고리즘
  - Hash, HashTable 사용 예제

## Day16 (10/26 수)
- 알고리즘
  - Hash Table 중복 제거 (List 사용)

## Day17 (10/27 목)
- 알고리즘
  - 프로그래머스 완주하지 못한 선수
    1. Hash Table 사용
    2. Hash Map 사용
    3. Hash Map 사용 -> getOrDefault 사용

## Day18 (10/28 금)
- 알고리즘
  - 프로그래머스 폰켓못
    - Hash Set 사용
  - 프로그래머스 전화번호 목록
    - Hash Set 사용

## Day19 (10/31 월)
- 알고리즘 - 그리디
  - 프로그래머스 모의고사

## Day20 (11/01 화)
- 알고리즘 - 소수구하기
  1. i = 2 ~ n-1 까지 순회하며 n이 i에 한번도 나누어 떨어지지 않으면 소수
  2. i = 2 ~ n/2 까지 순회하며 n이 i에 한번도 나누어 떨어지지 않으면 소수
  3. i = 2 ~ root n까지 순회하며 n이 i에 한번도 나누어 떨어지지 않으면 소수
  4. 위 3가지 방법을 모두 활용해 볼 수 있도록 Template Callback 적용
     1. 익명 클래스 사용
     2. lambda 사용

## Day21 (11/02 수)
- 알고리즘 - 에라토스테네스의 체
  - 프로그래머스 소수찾기 문제 해결

## Day22 (11/07 월)
- 알고리즘
  - 프로그래머스 하샤드 수 (자릿수, 나머지 연산)
  - 프로그래머스 나누어 떨어지는 숫자 배열 (Priority Queue 사용) 

## Day23 (11/08 화)
- 알고리즘 - 탐색
  - 순차 탐색
  - 이진 탐색

## Day24 (11/09 수)
- 알고리즘 - 선택 정렬
  - interface, lambda를 사용해 오름차순 정렬, 내림차순 정렬 구현
  - Function, BiFunction을 사용해 오름차순 정렬, 내림차순 정렬 구현
  - BiPredicate를 사용해 오름차순 정렬, 내림차순 정렬 구현
    
## 미니 프로젝트 1. MySQL을 이용한 대용량 데이터 분석 (HospitalExercise)
- 10/12 수
  - 서울특별시 병의원 위치 정보.csv 파일 다운
  - csv파일 읽어와서 Parsing 작업을 통해 데이터 추출
  - ID, 주소, 지역(~구까지), 병원분류, 응급실 운영여, 병원명 등
  - 추출 데이터를 .sql 파일로 생성
  - 생성한 sql 파일을 MySQL에서 불러와 실행 => 19039개의 병원 데이터 삽입 성공
- 10/13 목
  - Hospital 객체가 아닌 Parser에서 인스턴스들을 수정 후 넘겨줌
  - 각각의 객체에서 Insert Into를 써주지 않고 맨 처음 한번만 써주고 이후에는 튜플만 만들어주도록 수정 => MySQL Insert 속도 증가
  - Test Code 작성
    - 임의의 데이터를 사용해 Test Code 작성 후 테스트 진행
- 10/17 월
  - sql 파일 따로 생성 안하고 JAVA와 DB 연동 후 INSERT 쿼리 직접 데이터 추가
- 10/18 화
  - JAVA 연동을 통한 SELECT

## 미니 프로젝트 2. Java와 DB 연동 (UserExercise)
- 10/17 월
  - JAVA와 DB 연동
    - MySQL 라이브러리 다운, 적용
    - DriverManager, 환경변수 사용해 MySQL과 연결
    - Insert, Select문 사용 예제
- 10/18 화
  - JAVA와 DB 연동 테스트 코드 작성
    - Insert한 값과 findById로 찾아온 값이 일치하는지 테스트
  - Insert, Select 등에서 Connection 부분이 같으므로 리팩토링 필요
    1. Abstract Class 적용 : 다중 상속이 불가능하다는 단점
    2. Class 분리 : Method가 고정되는 단점
    3. Interface 적용
- 10/19 수
  - 리팩토링 이어서 진행
    4. Factory 적용
       - 장점 : 객체들을 한 곳에서 관리할 수 있음, 확장성, 생성자가 아닌 메소드로 작동하기 때문에 리턴값을 가짐 => 상황에 따라 다른 객체 반환 가능
       - 단점 : 너무 많은 클래스들을 정의하게 될 수 있음 => 코드가 복잡해짐
    5. Spring 적용
       - 장점 : Bean을 만들어 놓고 불러 쓰기 좋음, SingleTone 패턴, 테스트하기 좋음
  - 기능 추가
    - deleteAll : 모든 행 지우기
    - getCount : 모든 행의 개수 반환
    - deleteAll, getCount 테스트 코드 추가
- 10/20 목
  - UserDao findById 리팩토링
    - 전에는 findById 결과값이 없었으면 null return
    - 이번에는 결과값이 없으면 EmptyResultDataAccessException 을 발생 시킴
  - 테스트 코드 리팩토링
    - 없는 id를 검색해서 EmptyResultDataAccessException가 제대로 오는지 확인
    - @BeforeEach 를 사용해 Unit Test마다 반복되는 코드 제거
  - 예외 처리를 활용한 리소스 반환
    - 전에 코드에서는 예외가 발생하면 ps.close, conn.close가 실행되지 않아 리소스를 반환하지 못했음
    - try, catch, finally를 사용해 예외가 발생해도 리소스를 반환시켜 주도록 수정
- 10/21 금
  - 반복되는 쿼리 생성 부분 (PreparedStatement)을 Strategy Pattern을 사용해서 반복 줄임
  - connectionMaker, 쿼리 입력, 쿼리 실행, try/catch/finally 부분의 반복도 메소드로 빼서 반복 줄임
- 10/24 월
  - Java에 내장된 DataSource Interface를 적용함으로서 직접 구현했던 ConnectionMakerInterface 필요 없어짐
  - 익명 클래스와 JDBC Context를 적용함으로서 중복되는 코드 줄임 
  - Template Callback을 적용함으로서 deleteAll, add, getCount 등의 기능에서 sql query만 넘겨주면 되게끔 처리
  - JDBC Template 적용
    - 지금까지 했던 모든 작업이 JDBC Template으로 이미 정의되어 있음
    - 다른 코드 작성할 필요 없이 Data Source, JDBC Template만 문법에 맞게끔 사용해주면 모든 기능 구현 가능
  - findAll 기능 추가
  - findById, findAll 등에서 쓰이는 RowMapper 중복 제거
- 10/25 화
  - 총 정리 : [https://github.com/Changbum97/Toby-Spring3-Test](https://github.com/Changbum97/Toby-Spring3-Test)

## CodeUp (해결한 문제)
- c언어 기초 100제 : p1000 ~ p1099
- 나머지 연산 활용 : p1155, p1156, p1161
- 자릿수 관련 : p1278, p1620
- 최대값 : p2081, p4596
- 정렬 : p1443(삽입정렬)
- List : p3108
- 별찍기 : p1859, p1356, p1367
- 괄호 풀기 : p3129, p4624
- 탐색 : p3001, 2083

## Programmers (해결한 문제)
- 코딩테스트 입문 : 자릿수 더하기
- 연습 문제 : 두 정수 사이의 합, 수박수박수박수박수박수?, 하샤드 수, 나누어 떨어지는 숫자 배열
- 스택 : 올바른 괄호
- 정렬 : K번째수
- 해시 : 완주하지 못한 선수, 폰켓몬, 전화번호 목록
- 그리디 : 모의고사
- 소수 : 소수 찾기