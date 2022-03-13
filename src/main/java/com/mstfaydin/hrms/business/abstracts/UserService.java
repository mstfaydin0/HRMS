package com.mstfaydin.hrms.business.abstracts;

import com.mstfaydin.hrms.entities.abstracts.User;

import java.util.List;


public interface UserService {

    public void createUser(User user);

    public void deleteUser(User user);

    public void updateUser(User user);

    public void login(User user);

    public void logout(User user);

}
