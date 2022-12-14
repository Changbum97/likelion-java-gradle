package DBPractice.UserExercise.dao.dbQueryStrategy;

import DBPractice.UserExercise.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStrategy implements StatementStrategy {

    private User user;

    public AddStrategy(User user) {
        this.user = user;
    }

    @Override
    public PreparedStatement makePreparedStatement(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) values (?, ?, ?);");
        ps.setString(1, this.user.getId());
        ps.setString(2, this.user.getName());
        ps.setString(3, this.user.getPassword());
        return ps;
    }
}
