package ru.almaz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.almaz.dto.UserDto;
import ru.almaz.forms.UpdateUserForm;
import ru.almaz.models.User;
import ru.almaz.repositories.UserRepository;


@Service
public class ProfileServiceImpl implements ProfileService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User getUserInformationComplete(Authentication authentication) {
    return userRepository.findByUserLogin(authentication.getName()).orElseThrow(IllegalArgumentException::new);
  }

  @Override
  public UserDto getUserInformationInComplete(Authentication authentication) {
    return UserDto.from(userRepository.findByUserLogin(authentication.getName()).orElseThrow(IllegalArgumentException::new));
  }

  @Override
  public void updateProfile(Authentication authentication, UpdateUserForm form) {
    User user =userRepository.findByUserLogin(authentication.getName()).orElseThrow(IllegalArgumentException::new);
    form.update(user);
    System.out.println("proverka");
    userRepository.save(user);


  }
}
