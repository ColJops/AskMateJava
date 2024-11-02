package pl.com.gryfmultimedia.askmate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.com.gryfmultimedia.askmate.entity.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    Optional<User> findByUserName(String username);
    Optional<User> findByEmail(String email);
}
