package blog.services;

public interface UserService {
    boolean authenticate(String username, String password);
    boolean register (String username, String firstName, String lastName, String email, String password, String confirmPassword);
}
