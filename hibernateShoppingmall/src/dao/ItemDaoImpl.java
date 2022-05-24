package dao;

import javax.persistence.EntityManager;

import entities.Item;


public class ItemDaoImpl implements ItemDao
{
	private EntityManager entityManager;
	
	public ItemDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Item addItem(Item item) 
	{
		entityManager.persist(item);
		return item;
	}

	@Override
	public Item updateItem(Item item) 
	{
		entityManager.merge(item);
		return item;
	}

	@Override
	public Item searchItemById(int id) 
	{
		Item item = entityManager.find(Item.class, id);
		return item;
	}

	@Override
	public Item deleteItem(Item item) 
	{
		entityManager.remove(item);
		return item;
	}

	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}
}
