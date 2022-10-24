package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.dao.dbQueryStrategy.StatementStrategy;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcContext {

    private DataSource dataSource;

    public JdbcContext(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // executeUpdate 사용하는 쿼리 실행
    public void workWithStatementStrategy(StatementStrategy stmt) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //conn = connectionMaker.makeConnection();
            conn = dataSource.getConnection();

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
