package tnSpringHibernate.dao;

import tnSpringHibernate.models.GoodsType;

public interface GoodsTypeDao {
    /**
     * Find id good type in GoodsType
     * @param idGoodType
     * @return
     */
    GoodsType findById(int idGoodType);

    /**
     * Find good type in GoodsType
     * @param goodType
     * @return
     */
    GoodsType findByGoodType(String goodType);

    /**
     * Save goods type in db
     * @param goodsType
     */
    void save(GoodsType goodsType);

    /**
     * Update goods type in db
     * @param goodsType
     */
    void update(GoodsType goodsType);

    /**
     * Delete goods type in db
     * @param goodsType
     */
    void delete(GoodsType goodsType);
}
