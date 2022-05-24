package dao;

import entities.ShopOwner;

public interface ShopOwnerDao 
{
	public abstract ShopOwner addShopOwner(ShopOwner shopowner);
	public abstract ShopOwner updateShopOwner(ShopOwner shopowner);
	public abstract ShopOwner deleteShopOwner(ShopOwner shopowner);
	public abstract ShopOwner searchShopOwnerById(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
