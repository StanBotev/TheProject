package blog.services;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceStubImpl implements UserService {
    @Override
    public boolean authenticate(String username, String password) {
        // Provide a sample password check: username == password
        return Objects.equals(username, password);
    }
    public boolean register(String username, String firstName, String lastName, String email, String password, String confirmPassword) {
        return true;
    }
}
