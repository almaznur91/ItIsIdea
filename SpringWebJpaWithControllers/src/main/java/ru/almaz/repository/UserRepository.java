package ru.almaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.almaz.models.User;

import java.util.List;


public interface UserRepository extends JpaRepository<User,Long> {
//    List<User> findAllByAgeGreaterThan(int age);


}
