package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.dao.UserDao;
import DBPractice.UserExercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User("9", "EternityHwan", "1234");
        userDao.add(user);

        User selectedUser = userDao.findById("9");
        Assertions.assertEquals("EternityHwan", selectedUser.getName());
    }
}