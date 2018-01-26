package itpark.java.repository;

import itpark.java.model.Human;

import java.util.List;

public interface HumansDao extends CrudDao<Human> {
  List<Human> findAllByAge(int age);
  Human findOneByName(String name);
}
