package DBPractice.UserExercise.dao;

public class UserDaoFactory {
    // 조립
    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }

    public UserDao awsUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
