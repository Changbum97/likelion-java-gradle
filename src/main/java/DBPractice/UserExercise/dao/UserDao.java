package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.dao.connectionMaker.ConnectionMakerInterface;
import DBPractice.UserExercise.dao.connectionMaker.LocalConnectionMaker;
import DBPractice.UserExercise.dao.dbStrategy.AddStrategy;
import DBPractice.UserExercise.dao.dbStrategy.DeleteAllStrategy;
import DBPractice.UserExercise.dao.dbStrategy.StatementStrategy;
import DBPractice.UserExercise.domain.User;
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
        jdbcContextWithStatementStrategy(new AddStrategy(user));
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
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());
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

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = connectionMaker.makeConnection();

            // 쿼리 입력
            ps = stmt.makePreparedStatement(conn);

            // 쿼리 실행
            ps.executeUpdate();
            System.out.println("쿼리 실행 완료");

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
}
