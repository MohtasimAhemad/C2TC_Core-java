package dao;

import javax.persistence.EntityManager;

import entities.Shop;


public class ShopDaoImpl implements ShopDao
{
	private EntityManager entityManager;
	
	public ShopDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Shop addShop(Shop shop) 
	{
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) 
	{
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop deleteShop(Shop shop)
	{
		entityManager.remove(shop);
		return shop;
	}

	@Override
	public Shop searchShopById(int id) 
	{
		Shop shop = entityManager.find(Shop.class, id);
		return shop;
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
