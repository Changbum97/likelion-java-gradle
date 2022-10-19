package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        // interface 사용
        //UserDao userDao = new UserDao(new LocalConnectionMaker());

        // interface를 자동으로 주입해주는 팩토리 사용
        UserDao userDao = new UserDaoFactory().localUserDao();

        User user = new User("10", "Nunu", "1234");
        userDao.add(user);

        User selectedUser = userDao.findById("10");
        Assertions.assertEquals("Nunu", selectedUser.getName());
    }
}