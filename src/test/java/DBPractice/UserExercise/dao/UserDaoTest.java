package DBPractice.UserExercise.dao;

import DBPractice.UserExercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    UserDao userDao;

    // Unit 테스트 실행하기 전 userDao를 받아서 가게끔 설정해서 코드 간결하게 함
    @BeforeEach
    void setUserDao() {
        // Spring 적용해 UserDaoFactory 불러오기
        userDao = context.getBean("localUserDao", UserDao.class);
    }

    @Test
    @DisplayName("User Insert And Select Test")
    void addAndFindByIdTest() throws SQLException, ClassNotFoundException {
        // interface 사용
        //UserDao userDao = new UserDao(new LocalConnectionMaker());

        // interface를 자동으로 주입해주는 팩토리 사용
        // UserDao userDao = new UserDaoFactory().localUsexrDao();

        User user = new User("15", "Nunu", "1234");
        userDao.add(user);

        User findUser = userDao.findById("15");
        assertEquals("Nunu", findUser.getName());
        assertEquals("1234", findUser.getPassword());
    }

    @Test
    @DisplayName("User Delete All And Get Count Test")
    void deleteAllAndGetCountTest() throws SQLException, ClassNotFoundException {
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(new User("1", "aa", "1234"));
        assertEquals(1, userDao.getCount());
        userDao.add(new User("2", "bb", "1111"));
        assertEquals(2, userDao.getCount());
        userDao.add(new User("3", "cc", "4321"));
        assertEquals(3, userDao.getCount());
    }

    @Test
    @DisplayName("Test all")
    void finalTest() throws SQLException, ClassNotFoundException {
        User insertUser = new User("1", "kyeonghwan", "123");

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());
        // 모던 자바 표현(lambda)을 사용해서 exception test 진행
        assertThrows(EmptyResultDataAccessException.class, () -> {
            userDao.findById("1");
        });

        userDao.add(insertUser);
        assertEquals(1, userDao.getCount());

        User findUser = userDao.findById(insertUser.getId());

        assertEquals(insertUser.getName(), findUser.getName());
        assertEquals(insertUser.getPassword(), findUser.getPassword());
    }
}