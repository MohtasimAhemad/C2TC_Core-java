package dao;

import javax.persistence.EntityManager;

import entities.ShopOwner;

public class ShopOwnerDaoImpl implements ShopOwnerDao
{
	private EntityManager entityManager;
	
	public ShopOwnerDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public ShopOwner addShopOwner(ShopOwner shopowner)
	{
		entityManager.persist(shopowner);
		return shopowner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopowner) 
	{
		entityManager.merge(shopowner);
		return shopowner;
	}

	@Override
	public ShopOwner deleteShopOwner(ShopOwner shopowner)
	{
		entityManager.remove(shopowner);
		return shopowner;
	}

	@Override
	public ShopOwner searchShopOwnerById(int id) 
	{
		ShopOwner shopowner = entityManager.find(ShopOwner.class, id);
		return shopowner;
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
