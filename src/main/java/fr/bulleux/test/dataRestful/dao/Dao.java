package fr.bulleux.test.dataRestful.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Dao<T>{
	
	public static final Logger LOGGER = LoggerFactory.getLogger(Dao.class.getName());
	
	Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[]params);

    String delete(T t);
}
