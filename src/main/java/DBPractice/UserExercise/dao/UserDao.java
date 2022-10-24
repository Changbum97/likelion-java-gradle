package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.dao.connectionMaker.ConnectionMakerInterface;
import DBPractice.UserExercise.dao.connectionMaker.LocalConnectionMaker;
import DBPractice.UserExercise.dao.dbQueryStrategy.AddStrategy;
import DBPractice.UserExercise.dao.dbQueryStrategy.DeleteAllStrategy;
import DBPractice.UserExercise.dao.dbQueryStrategy.GetCountStrategy;
import DBPractice.UserExercise.dao.dbQueryStrategy.StatementStrategy;
import DBPractice.UserExercise.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // Interface 구현체 사용 => AWS 사용하고 싶으면 AWSConnectionMaker 갖다 쓰면 됨
    private ConnectionMakerInterface connectionMaker;

    private final DataSource dataSource;
    private final JdbcContext jdbcContext;

    private JdbcTemplate jdbcTemplate;

    /*
    public UserDao() {
        connectionMaker = new LocalConnectionMaker();
    }

    // 기본은 local이지만 다른 ConnectionMaker을 주입하는것도 가능
    public UserDao(ConnectionMakerInterface connectionMaker) {
        this.connectionMaker = connectionMaker;
    }*/

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcContext = new JdbcContext(dataSource);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // Table에 있는 모든 User 삭제
    public void deleteAll() {
        jdbcContext.executeSql("delete from users");
    }

    // 입력 받은 User을 DB에 추가
    public void add(User user) {
        this.jdbcTemplate.update("insert into users(id, name, password) values (?,?,?);",
                user.getId(), user.getName(), user.getPassword());
    }

    // Table에 있는 User의 수 return
    public int getCount() throws SQLException {
        return this.jdbcTemplate.queryForObject("select count(*) from users;", Integer.class);
    }

    // Table에 있는 모든 User을 List로 return
    public List<User> findAll() throws SQLException {
        //Connection conn = connectionMaker.makeConnection();
        Connection conn = dataSource.getConnection();

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
        //Connection conn = connectionMaker.makeConnection();
        Connection conn = dataSource.getConnection();

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
}
