package service;

import dao.UserDao;
import dao.UserDaoImpl;
import entities.User;

public class UserServiceImpl implements UserService
{
	private UserDao userDao;
	
	public UserServiceImpl()
	{
		userDao = new UserDaoImpl();
	}

	@Override
	public User addUser(User user) 
	{
		userDao.beginTransaction();
		userDao.addUser(user);
		userDao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user)
	{
		userDao.beginTransaction();
		userDao.updateUser(user);
		userDao.commitTransaction();
		return user;
	}

	@Override
	public User deleteUser(User user)
	{
		userDao.beginTransaction();
		userDao.deleteUser(user);
		userDao.commitTransaction();
		return user;
	}

	@Override
	public User searchUserById(int id) 
	{
		User user = userDao.searchUserById(id);
		return user;
	}
}
