package tnSpringHibernate.dao;

import tnSpringHibernate.models.Shop;

import java.util.List;

public interface ShopDao {
    /**
     * Find id shop in shops
     * @param idShop
     * @return
     */
    Shop findByIdShop(int idShop);

    /**
     * Find name of shop in shops
     * @param nameOfShop
     * @return
     */
    Shop findByNameOfShop(String nameOfShop);

    /**
     * Find id settlement shop in shops
     * @param idSettlement
     * @return
     */
    Shop findByIdSettlement(int idSettlement);

    /**
     * Find all shops in shops
     * @return
     */
    List<Shop> findAllShops();

    /**
     * Save shop in db
     * @param shop
     */
    void save(Shop shop);

    /**
     * Update shop in db
     * @param shop
     */
    void update(Shop shop);

    /**
     * Delete shop in db
     * @param shop
     */
    void delete(Shop shop);

}
