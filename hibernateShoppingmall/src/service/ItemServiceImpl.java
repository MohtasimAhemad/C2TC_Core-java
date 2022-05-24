package service;

import dao.ItemDao;
import dao.ItemDaoImpl;
import entities.Item;

public class ItemServiceImpl implements ItemService
{
	private ItemDao itemDao;
	
	public ItemServiceImpl()
	{
		itemDao = new ItemDaoImpl();
	}

	@Override
	public Item addItem(Item item) 
	{
		itemDao.beginTransaction();
		itemDao.addItem(item);
		itemDao.commitTransaction();
		return item;
	}

	@Override
	public Item updateItem(Item item)
	{
		itemDao.beginTransaction();
		itemDao.addItem(item);
		itemDao.commitTransaction();
		return item;
	}

	@Override
	public Item searchItemById(int id) 
	{
		Item item = itemDao.searchItemById(id);
		return item;
	}

	@Override
	public Item deleteItem(Item item)
	{
		itemDao.beginTransaction();
		itemDao.deleteItem(item);
		itemDao.commitTransaction();
		return item;
	}
}
