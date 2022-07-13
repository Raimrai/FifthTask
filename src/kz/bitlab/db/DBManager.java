package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<User> users = new ArrayList<>();
    static {

    }
    public static void addUser(User user){
        users.add(user);
    }
    public static ArrayList<User> getAllUsers(){
        return users;
    }
}