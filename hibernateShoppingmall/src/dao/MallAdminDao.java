package dao;

import entities.MallAdmin;

public interface MallAdminDao 
{
	public abstract MallAdmin addMallAdmin(MallAdmin malladmin);
	public abstract MallAdmin updateMallAdmin(MallAdmin malladmin);
	public abstract MallAdmin deleteMallAdmin(MallAdmin malladmin);
	public abstract MallAdmin searchMallAdminById(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();	
}
