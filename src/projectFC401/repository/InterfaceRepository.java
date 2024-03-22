package projectFC401.repository;

import java.util.List;
import java.util.Locale;

// Интерфейс репозитория
public interface InterfaceRepository<T> {

    void save(T object);

    void save(Locale.Category category);

    T findById(int id);

    List<T> findAll();

}