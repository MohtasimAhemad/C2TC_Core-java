package service;

import entities.Item;

public interface ItemService 
{
	public abstract Item addItem(Item item);
	public abstract Item updateItem(Item item);
	
	public abstract Item searchItemById(int id);
	public abstract Item deleteItem(Item item);
}
