package DBPractice.UserExercise;

public class User {
    private String id;
    private String name;
    private String password;

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "id : " + id + " name : " + name + " password : " + password;
    }
}
