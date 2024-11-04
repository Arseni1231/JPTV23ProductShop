package org.example.intefaces;
import java.util.List;
public class Repository<T> {
    void save(T entity);
    void saveAll(List<T> entities);
    List<T> load();
}
