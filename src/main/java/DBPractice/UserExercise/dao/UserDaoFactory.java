package DBPractice.UserExercise.dao;

// 팩토리에서 조립하는 역할 담당
public class UserDaoFactory {

    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }

    public UserDao awsUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
