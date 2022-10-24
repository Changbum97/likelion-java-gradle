package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.dao.connectionMaker.LocalConnectionMaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Map;

// 팩토리에서 조립하는 역할 담당
@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao localUserDao() {
        /*UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;*/
        return new UserDao(localDataSource());
    }

    @Bean
    public UserDao awsUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }

    @Bean
    public DataSource localDataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        Map<String, String> env = System.getenv();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword(env.get("DB_PASSWORD"));
        return dataSource;
    }
}
