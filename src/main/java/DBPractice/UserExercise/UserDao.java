package DBPractice.UserExercise;

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

    public void add(User user) throws ClassNotFoundException, SQLException {
        // 쿼리 입력
        ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) values (?, ?, ?);"
        );

        // 쿼리 파라미터 설정
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

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

        // 쿼리 파라미터 설정
        ps.setString(1, "Changbum");

        // MySQL에 입력한 쿼리 실행
        ResultSet resultSet = ps.executeQuery();
        System.out.println("DB Search 완료");

        List<User> users = new ArrayList<>();

        // search 결과값 읽어서 users에 넣어주는 작업
        while(resultSet.next()) {
            users.add(new User(resultSet.getString("id"), resultSet.getString("name"),
                    resultSet.getString("password")));
        }
        resultSet.close();
        ps.close();

        return users;
    }

    public User findById(String id) throws SQLException {
        // 쿼리 입력
        ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?;");

        // 쿼리 파라미터 설정
        ps.setString(1, id);

        // MySQL에 입력한 쿼리 실행
        ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()) {
            System.out.println("DB Search 완료");
            return new User(resultSet.getString("id"), resultSet.getString("name"),
                    resultSet.getString("password"));
        } else {
            System.out.println("Search 결과 없음");
            return null;
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add(new User("3", "Ruru", "12345678"));

        List<User> searchUsers = userDao.search();
        for(User user : searchUsers) {
            System.out.println(user);
        }
        userDao.conn.close();
    }
}
