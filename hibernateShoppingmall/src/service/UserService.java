package service;

import entities.User;

public interface UserService 
{
	public abstract User addUser(User user);
	public abstract User updateUser(User user);
	public abstract User deleteUser(User user);
	public abstract User searchUserById(int id);
}
