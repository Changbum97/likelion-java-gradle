package DBPractice.UserExercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

public class LocalConnectionMakerImpl implements ConnectionMakerInterface {
    @Override
    public Connection makeConnection() {
        try {
            // 등록한 환경변수 사용
            Map<String, String> env = System.getenv();
            String dbHost = env.get("DB_HOST");
            String dbUser = env.get("DB_USER");
            String dbPassword = env.get("DB_PASSWORD");
            // DB 연결 (url, ID, PW)
            Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
