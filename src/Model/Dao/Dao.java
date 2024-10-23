package Model.Dao;

import Model.Person.Student;

import java.util.List;
import java.util.Optional;


// persistence, generic CRUD-Operations
public interface Dao<T>{
    Optional<T> get(String id);
    List<T> getAll();
    void save(T t);
    void update(T t, Student s);
    void delete(T t);
}
