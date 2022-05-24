package service;

import entities.ShopOwner;

public interface ShopOwnerService 
{
	public abstract ShopOwner addShopOwner(ShopOwner shopowner);
	public abstract ShopOwner updateShopOwner(ShopOwner shopowner);
	public abstract ShopOwner deleteShopOwner(ShopOwner shopowner);
	public abstract ShopOwner searchShopOwnerById(int id);
}
