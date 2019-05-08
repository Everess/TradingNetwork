package tnSpringHibernate.services;

import tnSpringHibernate.dao.ShopDaoImpl;
import tnSpringHibernate.models.Shop;

import java.util.List;

/**
 * Implementation methods of dao for shop
 */
public class ShopService {
    private ShopDaoImpl shopDao = new ShopDaoImpl();

    public ShopService() {

    }

    public Shop findByIdShop(int idShop) {
        return shopDao.findByIdShop(idShop);
    }

    public Shop findByNameOfShop(String nameOfShop) {
        return shopDao.findByNameOfShop(nameOfShop);
    }

    public Shop findByIdSettlement(int idSettlement) {
        return shopDao.findByIdSettlement(idSettlement);
    }

    public List<Shop> findAll() {
        return shopDao.findAll();
    }

    public void saveShop(Shop shop) {
        shopDao.save(shop);
    }

    public void updateShop(Shop shop) {
        shopDao.update(shop);
    }

    public void deleteShop(Shop shop) {
        shopDao.delete(shop);
    }
}
