package DBPractice.UserExercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

public class AWSUserDaoImpl extends UserDaoAbstract {
    @Override
    public Connection makeConnection() {
        try {
            // 환경변수는 로컬로 등록해놨음, 예시용
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
