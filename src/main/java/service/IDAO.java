package service;
import jakarta.persistence.EntityManager;
import java.util.List;

public interface IDAO {


    //QUERY ALL
    <T> List<T> getAll(String nameQuery, Class<T> clazz);
    //INSERT
    <T> void insert(T entity);
    //UPDATE
    <T> T update(T entity);

    <T> void remove(T entity);

    <T> T findById(Class<T> clazz, Long id);
}
