package classwork.pageobject.entities;

/**
 * Created by Dmitry_Lebedev1 on 1/31/2018.
 */

public class User {
    public static User DMITRY = new User("dmitry", "qwer");
    public static User PETER = new User("epam", "1234");

    public String login;
    public String password;

    public User(String name, String password) {
        this.login = name;
        this.password = password;
    }
}
