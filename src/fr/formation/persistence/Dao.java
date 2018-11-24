package fr.formation.persistence;

import java.util.List;

public interface Dao<T> {
	
	public void create(T entity);
	
	public void update(T entity);
	
	public T read(int id);
	
	public void delete(int id);
	
	public List<T> readAll();
	

}
