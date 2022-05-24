package service;

import entities.Shop;

public interface ShopService 
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop deleteShop(Shop shop);
	public abstract Shop searchShopById(int id);
}
