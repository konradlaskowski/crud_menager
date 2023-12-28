package pl.com.wpi.ldapcrudmanager.service;

import pl.com.wpi.ldapcrudmanager.repository.UserRepository;
import pl.com.wpi.ldapcrudmanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
