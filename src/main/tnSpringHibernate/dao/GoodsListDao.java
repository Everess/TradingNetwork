package tnSpringHibernate.dao;

import tnSpringHibernate.models.GoodsList;

public interface GoodsListDao {
    /**
     * Find id good in GoodsList
     * @param idGood
     * @return
     */
    GoodsList findById(int idGood);

    /**
     * Find id good type in GoodsList
     * @param idGoodType
     * @return
     */
    GoodsList findByIdGoodType(int idGoodType);

    /**
     * Find name of good in GoodsList
     * @param nameOfGood
     * @return
     */
    GoodsList findByNameOfGood(String nameOfGood);

    /**
     * Save goodsList in db
     * @param goodsList
     */
    void save(GoodsList goodsList);

    /**
     * Update goodsList in db
     * @param goodsList
     */
    void update(GoodsList goodsList);

    /**
     * Delete goodsList in db
     * @param goodsList
     */
    void delete(GoodsList goodsList);
}
