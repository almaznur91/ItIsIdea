package ru.almaz.service;

import org.springframework.security.core.Authentication;
import ru.almaz.dto.UserDto;
import ru.almaz.forms.UpdateUserForm;
import ru.almaz.models.User;

public interface ProfileService {
  User getUserInformationComplete(Authentication authentication);

  UserDto getUserInformationInComplete(Authentication authentication);

  void updateProfile(Authentication authentication, UpdateUserForm form);
}
