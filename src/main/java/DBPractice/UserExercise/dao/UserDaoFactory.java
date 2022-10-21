package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.dao.connectionMaker.LocalConnectionMaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 팩토리에서 조립하는 역할 담당
@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }

    @Bean
    public UserDao awsUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
