package rut.almaz.repository;

import java.util.List;

public interface CrudDao<T> {


    void save(T model);
    T find(Long id);
    void update(T model);
    void delete(T model);
    List<T> findAll();


}
