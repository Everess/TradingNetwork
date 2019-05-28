package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.ShopDaoImpl;
import tnSpringHibernate.exceptions.EntityNotFoundException;
import tnSpringHibernate.models.Shop;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation methods of dao for shop
 */
@Service
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

    public List<Shop> findAllShops() {
        List<Shop> shop = shopDao.findAllShops();

        if(shop == null) {
            throw new EntityNotFoundException();
        }

        return shop;
        //return shopDao.findAllShops();

    }

    @Transactional
    public void saveShop(Shop shop) {
        shopDao.save(shop);
    }

    @Transactional
    public void updateShop(Shop shop) {
        shopDao.update(shop);
    }

    @Transactional
    public void deleteShop(Shop shop) {
        shopDao.delete(shop);
    }
}
