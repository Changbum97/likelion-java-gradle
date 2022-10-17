package Day9_1017.DBExercise;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDao {

    private Map<String, String> env;
    private String dbHost, dbUser, dbPassword;
    private Connection conn;
    private PreparedStatement ps;

    public UserDao() throws SQLException {
        env = System.getenv();
        dbHost = env.get("DB_HOST");
        dbUser = env.get("DB_USER");
        dbPassword = env.get("DB_PASSWORD");
        // DB 연결 (url, ID, PW)
        conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
    }

    public void add() throws ClassNotFoundException, SQLException {
        // 쿼리 입력
        ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) values (?, ?, ?);"
        );

        // 쿼리에 파라미터 입력
        ps.setString(1, "2");
        ps.setString(2, "Changbum");
        ps.setString(3, "1234");

        // id가 PK이기 때문에 중복되면 에러 발생 => try, catch로 잡아줌
        try {
            // MySQL에 입력한 쿼리 실행
            int status = ps.executeUpdate();
            System.out.println("status : " + status);
            System.out.println("DB Insert 완료");
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("id 중복");
        }
        ps.close();
    }

    public List<User> search() throws SQLException {
        // 쿼리 입력
        ps = conn.prepareStatement(
                "SELECT * FROM users WHERE name = ?;"
        );

        // 쿼리에 파라미터 입력
        ps.setString(1, "Changbum");

        // MySQL에 입력한 쿼리 실행
        ResultSet resultSet = ps.executeQuery();
        System.out.println("DB Search 완료");

        List<User> users = new ArrayList<>();
        // 여러개 search도 가능
        while(resultSet.next()) {
            users.add(new User(resultSet.getString("id"), resultSet.getString("name"),
                    resultSet.getString("password")));
        }
        resultSet.close();
        ps.close();

        return users;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();

        List<User> searchUsers = userDao.search();
        for(User user : searchUsers) {
            System.out.println(user);
        }
        userDao.conn.close();
    }
}
