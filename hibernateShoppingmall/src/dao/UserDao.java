package dao;

import entities.User;

public interface UserDao 
{
	public abstract User addUser(User user);
	public abstract User updateUser(User user);
	public abstract User deleteUser(User user);
	public abstract User searchUserById(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
