package Day9_1017.DBExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");

        // DB 연결 (url, ID, PW)
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);

        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) values (?, ?, ?);"
        );

        // 쿼리에 파라미터 입력
        ps.setString(1, "0");
        ps.setString(2, "Changbum");
        ps.setString(3, "1234");

        // MySQL에 입력한 쿼리 실행
        int status = ps.executeUpdate();

        ps.close();
        conn.close();
    }

    // UserDao의 add 메소드 실행
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}
