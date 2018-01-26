package ru.itpark.java;

import org.springframework.beans.factory.annotation.Autowired;

public class HumanService {

  @Autowired
  private HumansDao humansDao;



  public void registerUser(Human user) {
    // смотрим, нет ли человека с таким именем,
    String name = user.getName();

    Human existingHuman = humansDao.findOneByName(name);

    if (existingHuman != null) {
      // если есть - выбрасываем ошибку, если нет - сохраняем
      throw new IllegalArgumentException("Already exist");
    }

    humansDao.save(user);


  }
}
