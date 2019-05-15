package tnSpringHibernate.dao;

import tnSpringHibernate.models.Good;

public interface GoodDao {
    /**
     * Find id good
     * @param idGood
     * @return
     */
    Good findById(int idGood);

    /**
     * Find goods value
     * @param value
     * @return
     */
    Good findByValue(int value);

    /**
     * Find discount of good
     * @param discount
     * @return
     */
    Good findByDiscount(int discount);

    /**
     * Find id of good
     * @param idDelivery
     * @return
     */
    Good findByIdDelivery(int idDelivery);

    /**
     * Save good in DB
     * @param good
     */
    void save(Good good);

    /**
     * Update good in DB
     * @param good
     */
    void update(Good good);

    /**
     * Delete good in DB
     * @param good
     */
    void delete(Good good);
}
