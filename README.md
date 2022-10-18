# 멋쟁이 사자처럼 JAVA

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
    - 입력받은 숫자의 자릿수 구하기, 각 자릿수 더하기

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
  - 별찍기 (직각삼각형, 피라미드, 마름모 모양)
- JAVA와 DB 연동 (UserExercise)
  - MySQL 라이브러리 다운, 적용
  - DriverManager, 환경변수 사용해 MySQL과 연결
  - Insert, Select문 사용 예제

## Day 10 (10/18 화)
- 알고리즘
  - 별찍기 (직사각형, 정사각형, 재귀활용)
- JAVA와 DB 연동 테스트코드 작성 (UserExercise)
  - Insert한 값과 findById로 Select한 값이 일치하는지 테스트
  - Insert, Select 등에서 Connection 부분이 같으므로 리팩토링 필요
    1. Abstract Class 사용 : 다중 상속 불가
    2. Class 분리 : Method가 고정
    3. Interface 사용 => UserDao에서 interface 구현체 사용

## 미니프로젝트 1. MySQL을 이용한 대용량 데이터 분석 (HospitalExercise)
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

## CodeUp (해결한 문제)
- c언어 기초 100제 : p1000 ~ p1099
- 나머지 연산 활용 : p1155, p1156, p1161
- 자릿수 관련 : p1278, p1620
- 최대값 : p2081, p4596
- 정렬 : p1443(삽입정렬)
- List : p3108
- 별찍기 : p1859, p1356, p1367