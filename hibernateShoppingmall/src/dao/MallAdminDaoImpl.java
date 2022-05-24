package dao;


import javax.persistence.EntityManager;

import entities.MallAdmin;


public class MallAdminDaoImpl implements MallAdminDao
{
	private EntityManager entityManager;
	
	public MallAdminDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public MallAdmin addMallAdmin(MallAdmin malladmin)
	{
		entityManager.persist(malladmin);
		return malladmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin malladmin) 
	{
		entityManager.merge(malladmin);
		return malladmin;
	}

	@Override
	public MallAdmin deleteMallAdmin(MallAdmin malladmin) 
	{
		entityManager.remove(malladmin);
		return malladmin;
	}

	@Override
	public MallAdmin searchMallAdminById(int id)
	{
		MallAdmin malladmin = entityManager.find(MallAdmin.class, id);
		return malladmin;
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
