package tnSpringHibernate.dao;

import tnSpringHibernate.models.Settlement;

import java.util.List;

public interface SettlementDao {

    /**
     * Find id settlement in settlements
     * @param idSettlement
     * @return
     */
    Settlement findByIdSettlement(int idSettlement);

    /**
     * Find region in settlements
     * @param region
     * @return
     */
    Settlement findByRegion(String region);

    /**
     * Find city in settlements
     * @param city
     * @return
     */
    Settlement findByCity(String city);

    /**
     * Find all settlements in settlements
     * @return
     */
    List<Settlement> findAll();

    /**
     * Save settlement in db
     * @param settlement
     */
    void save(Settlement settlement);

    /**
     * Update settlement in db
     * @param settlement
     */
    void update(Settlement settlement);

    /**
     * Delete settlement in db
     * @param settlement
     */
    void delete(Settlement settlement);
}
