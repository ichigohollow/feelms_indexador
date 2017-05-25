package db;

/**
 * Created by Arturo on 24-05-2017.
 */
public class User {

    private String name;

    private int date = 0;

    public User(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
