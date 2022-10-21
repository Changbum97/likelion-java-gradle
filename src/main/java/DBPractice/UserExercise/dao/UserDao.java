package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.domain.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // Interface 구현체 사용 => AWS 사용하고 싶으면 AWSConnectionMaker 갖다 쓰면 됨
    private ConnectionMakerInterface connectionMaker;

    public UserDao() {
        connectionMaker = new LocalConnectionMaker();
    }

    // 기본은 local이지만 다른 ConnectionMaker을 주입하는것도 가능
    public UserDao(ConnectionMakerInterface connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    // 입력 받은 User을 DB에 추가
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
            // 쿼리 실행
            int status = ps.executeUpdate();
            System.out.println("status : " + status);
            System.out.println("DB Insert 완료");
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("id 중복");
        }

        ps.close();
        conn.close();
    }

    // Table에 있는 모든 User을 List로 return
    public List<User> findAll() throws SQLException {
        Connection conn = connectionMaker.makeConnection();

        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement( "SELECT * FROM users;" );

        // 쿼리 실행
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

    // 입력받은 id에 해당하는 User return
    public User findById(String id) throws SQLException {
        Connection conn = connectionMaker.makeConnection();

        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?;");

        // 쿼리 파라미터 설정
        ps.setString(1, id);

        // 쿼리 실행
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

        // Exception Test를 위한 작업
        if(user == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return user;
    }

    // Table에 있는 모든 User 삭제
    public void deleteAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = connectionMaker.makeConnection();

            // 쿼리 입력
            ps = new DeleteAllStrategy().makePreparedStatement(conn);

            // 쿼리 실행
            ps.executeUpdate();
            System.out.println("DB DeleteAll 완료");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    // Table에 있는 User의 수 return
    public int getCount() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = connectionMaker.makeConnection();

            // 쿼리 입력
            ps = conn.prepareStatement("SELECT COUNT(*) FROM users;");

            // 쿼리 실행
            rs = ps.executeQuery();
            System.out.println("DB Get Count 완료");
            rs.next();
            int count = rs.getInt(1);

            return count;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
