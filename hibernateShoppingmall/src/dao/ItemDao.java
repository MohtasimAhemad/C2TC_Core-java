package dao;

import entities.Item;

public interface ItemDao 
{
	public abstract Item addItem(Item item);
	public abstract Item updateItem(Item item);
	
	public abstract Item searchItemById(int id);
	public abstract Item deleteItem(Item item);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
