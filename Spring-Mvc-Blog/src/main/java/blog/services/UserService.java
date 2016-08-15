package blog.services;

import blog.models.User;
import java.util.List;
public interface UserService {
<<<<<<< HEAD
//    List<User> findAll();
//    User findById(Long id);
//    User create(User user);
//    User edit(User user);
//    void deleteById(Long id);
=======
    boolean authenticate(String username, String password);
    boolean register (String username, String firstName, String lastName, String email, String password, String confirmPassword);
>>>>>>> Registration-Creation
}
