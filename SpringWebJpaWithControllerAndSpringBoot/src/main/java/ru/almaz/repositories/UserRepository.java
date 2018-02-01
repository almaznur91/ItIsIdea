package ru.almaz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.almaz.models.Role;
import ru.almaz.models.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByConfirmString(String confirmString);
    Optional<User> findByUserLogin(String userLogin);
    Optional<User> findByRole(String role);
    Optional<User> findByUserLoginAndRole(String userLogin, Role role);


}
