# 거래내역 조회 서비스

지점 마케팅 API 개발

## 프레임 워크 구성

IntelliJ 에서 Sprint boot 를 이용한 Rest API

### H2

자바 기반의 RDBMS 이고, DB 서버가 꺼지면 모든 데이터가 유실된다.

#### build.gradle

gradle에 의존성 추가

```
runtimeOnly 'com.h2database:h2'
```

#### application.properties

콘솔 사용 여부 추가

```
spring.h2.console.enabled = true
```

#### h2 console

기본 설정 콘솔 접속 url은 http://localhost:8080/h2-console 이다. 접속 후, connect 하면 콘솔에서 쿼리문 작성이 가능하다.

#### ApplicationRunner

spring boot 실행 시, 자동으로 테이블 생성 및 csv 파일 데이터가 insert 되도록 설정

```
@Component
public class H2Runner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("===============");
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE transactionInform(date date , accountNum VARCHAR(50),  transactionNum VARCHAR(50), price int, fees int, isCanceled boolean)\n" +
                    "    AS SELECT * FROM CSVREAD('E:/minji/kakaopay/transactionInform.csv');";
            statement.executeUpdate(sql);

            sql = "CREATE TABLE accountInform(accountNum  VARCHAR(50),  accountName VARCHAR(50), managementCode VARCHAR(50))\n" +
                    "    AS SELECT * FROM CSVREAD('E:/minji/kakaopay/accountInform.csv');";
            statement.executeUpdate(sql);

            sql = "CREATE TABLE managementInform(managementCode VARCHAR(50), managementName VARCHAR(50))\n" +
                    "    AS SELECT * FROM CSVREAD('E:/minji/kakaopay/managementInform.csv');";
            statement.executeUpdate(sql);
        }
    }
}
```


### Gradle

gradle 관련 내용

```
Give the example
```


### MyBatis

Mybatis 관련 내용

```
Give an example
```

## 문제 해결

문제 해결 관련 내용

```
Give an example
```

## 빌드 및 실행 방법


* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

