package DBPractice.UserExercise.dao.Interface;

import java.sql.Connection;
import java.sql.DriverManager;

public class AWSConnectionMaker implements ConnectionMakerInterface {
    @Override
    public Connection makeConnection() {
        try {
            // AWS는 환경변수 등록 안해서 예시로만 작성
            String dbHost = "jdbc:mysql://[AWS주소]/[테이블명]";
            String dbUser = "[AWS mysql user name]";
            String dbPassword = "[AWS mysql user password]";
            // DB 연결 (url, ID, PW)
            Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
