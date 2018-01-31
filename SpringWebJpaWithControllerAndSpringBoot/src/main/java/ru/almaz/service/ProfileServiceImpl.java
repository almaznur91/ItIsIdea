package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.almaz.models.User;
import ru.almaz.repositories.UserRepository;


@Service
public class ProfileServiceImpl implements ProfileService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User getUserInformation(Authentication authentication) {
    return userRepository.findByUserLogin(authentication.getName()).orElseThrow(IllegalArgumentException::new);
  }
}
