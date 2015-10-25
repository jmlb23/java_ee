package Exercicio2b.utilidades;

import java.util.ArrayList;
public abstract class AbstractDao<T>{
	public abstract ArrayList<T> selectAll();
	public abstract T selectOne(int id);
	public abstract int removeOne(int id);
	public abstract int updateOne(T element);
	public abstract int createOne(T element);
	
	
}
