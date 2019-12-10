package by.it.academy.elearning.service;

import by.it.academy.elearning.model.Users;

import java.util.HashMap;
import java.util.Map;

public class UsersServiceImpl {
    private Map<String, Users> users = new HashMap<>();
    public UsersServiceImpl(){
        users.put("admin", new Users("admin", "12345"));
    }

    public Users
}
