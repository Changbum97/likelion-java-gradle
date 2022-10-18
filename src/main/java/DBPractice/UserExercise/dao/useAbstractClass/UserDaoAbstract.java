package DBPractice.UserExercise.dao.useAbstractClass;

import DBPractice.UserExercise.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class UserDaoAbstract {

    // makeConnection만 추상 메소드로 지정
    // 나머지 메소드들은 일반 메소드로 바로 사용 가능
    public abstract Connection makeConnection();

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection conn = makeConnection();

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

    public User findById(String id) throws SQLException {
        Connection conn = makeConnection();

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

}
