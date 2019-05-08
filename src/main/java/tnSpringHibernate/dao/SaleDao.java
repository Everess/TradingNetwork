package tnSpringHibernate.dao;

import tnSpringHibernate.models.Sale;
import tnSpringHibernate.models.SaleMethod;

import java.util.Date;

public interface SaleDao {
    /**
     * Find id sale
     * @param idSale
     * @return
     */
    Sale findById(int idSale);

    /**
     * Find id worker in sale
     * @param idWorker
     * @return
     */
    Sale findByIdWorker(int idWorker);

    /**
     * Find id good in sale
     * @param idGood
     * @return
     */
    Sale findByIdGood(int idGood);

    /**
     * Find sale date in sale
     * @param saleDate
     * @return
     */
    Sale findBySaleDate(Date saleDate);

    /**
     * Find sale method in sale
     * @param saleMethod
     * @return
     */
    Sale findBySaleMethod(SaleMethod saleMethod);

    /**
     * Find price in sale
     * @param price
     * @return
     */
    Sale findByPrice(int price);

    /**
     * Save sale in db
     * @param sale
     */
    void save(Sale sale);

    /**
     * Update sale in db
     * @param sale
     */
    void update(Sale sale);

    /**
     * Delete sale in db
     * @param sale
     */
    void delete(Sale sale);
}
