package agapitov.pp312.Dao;



import agapitov.pp312.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();


    void saveUser(User user);

    void removeUser(int id);

    void changeUser(User updateUser);

    User getUserByID(int id);
}

