package app.first.in.furore;

/**
 * Created by venkateshtata on 05/03/16.
 */
public class User {

    String name, username, password;
    int age;

    public User(String name, int age, String password, String username){
        this.name=name;
        this.username=username;
        this.password=password;
        this.age=age;
    }
    public User(String username, String password){
        this.username=username;
        this.password=password;
        this.age=-1;
        this.name="";
    }
}
