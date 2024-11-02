package pl.com.gryfmultimedia.askmate.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.gryfmultimedia.askmate.entity.User;
import pl.com.gryfmultimedia.askmate.repository.UserRepository;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public User createNewUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> getUserById(UUID id) {
        return userRepository.findById(id);
    }
}
