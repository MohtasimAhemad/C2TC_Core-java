package dao;

import entities.Shop;

public interface ShopDao
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop deleteShop(Shop shop);
	public abstract Shop searchShopById(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
