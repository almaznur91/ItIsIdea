package ru.almaz.service;

import org.springframework.security.core.Authentication;
import ru.almaz.models.User;

public interface ProfileService {
  User getUserInformation(Authentication authentication);
}
