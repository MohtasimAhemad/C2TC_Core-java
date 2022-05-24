package service;

import entities.Mall;

public interface MallService 
{
	public abstract Mall addMall(Mall mall);
	public abstract Mall updateMall(Mall mall);
	
	public abstract Mall deleteMall(Mall mall);
	public abstract Mall searchMallById(int id);
}
