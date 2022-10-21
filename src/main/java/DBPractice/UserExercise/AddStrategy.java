package DBPractice.UserExercise;

import DBPractice.UserExercise.dao.StatementStrategy;
import DBPractice.UserExercise.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStrategy implements StatementStrategy {
    @Override
    public PreparedStatement makePreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("INSERT INTO users(id, name, password) values (?, ?, ?);");
    }
}
