package blog.services;

import blog.models.User;
import blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@Primary
public class UserServiceJpaImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> findAll() {
        return this.userRepo.findAll();
    }

    public User findById(Long id) {
        return this.userRepo.findOne(id);
    }

    public User create(User user) {
        return this.userRepo.save(user);
    }

    public User edit(User user) {
        return this.userRepo.save(user);
    }

    public void deleteById(Long id) {
        this.userRepo.delete(id);
    }
}