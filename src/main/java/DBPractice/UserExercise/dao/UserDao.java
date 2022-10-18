package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.dao.useAbstractClass.LocalUserDaoAbstractImpl;
import DBPractice.UserExercise.dao.useInterface.LocalConnectionMaker;
import DBPractice.UserExercise.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // Interface 구현체 사용
    private LocalConnectionMaker connectionMaker;

    public UserDao() {
        connectionMaker = new LocalConnectionMaker();
    }

    // 기본은 local이지만 다른 ConnectionMaker을 주입하는것도 가능
    public UserDao(LocalConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection conn = connectionMaker.makeConnection();

        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement( "INSERT INTO users(id, name, password) values (?, ?, ?);" );

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
        conn.close();
    }

    public List<User> findAll() throws SQLException {
        Connection conn = connectionMaker.makeConnection();

        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement( "SELECT * FROM users;" );

        // MySQL에 입력한 쿼리 실행
        ResultSet resultSet = ps.executeQuery();
        System.out.println("DB FindAll 완료");

        List<User> users = new ArrayList<>();

        // search 결과값 읽어서 users에 넣어주는 작업
        while(resultSet.next()) {
            users.add(new User(resultSet.getString("id"), resultSet.getString("name"),
                    resultSet.getString("password")));
        }

        resultSet.close();
        ps.close();
        conn.close();

        return users;
    }

    public User findById(String id) throws SQLException {
        Connection conn = connectionMaker.makeConnection();

        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?;");

        // 쿼리 파라미터 설정
        ps.setString(1, id);

        // MySQL에 입력한 쿼리 실행
        ResultSet resultSet = ps.executeQuery();
        User user = null;

        if(resultSet.next()) {
            System.out.println("DB FindById 완료");
            user = new User(resultSet.getString("id"), resultSet.getString("name"),
                    resultSet.getString("password"));
        } else {
            System.out.println("FindById 결과 없음");
        }

        resultSet.close();
        ps.close();
        conn.close();

        return user;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add(new User("4", "Ruru", "12345678"));

        List<User> searchUsers = userDao.findAll();
        for(User user : searchUsers) {
            System.out.println(user);
        }
    }
}
