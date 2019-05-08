package tnSpringHibernate.services;

import tnSpringHibernate.dao.SettlementDaoImpl;
import tnSpringHibernate.models.Settlement;

import java.util.List;

/**
 * Implementation methods of dao for settlement
 */
public class SettlementService {

    private SettlementDaoImpl settlementDao = new SettlementDaoImpl();

    public SettlementService() {

    }

    public Settlement findByIdSettlement(int idSettlement) {
        return settlementDao.findByIdSettlement(idSettlement);
    }

    public Settlement findByRegion(String region) {
        return settlementDao.findByRegion(region);
    }

    public Settlement findByCity(String city) {
        return settlementDao.findByCity(city);
    }

    public List<Settlement> findAll() {
        return settlementDao.findAll();
    }

    public void save(Settlement settlement) {
        settlementDao.save(settlement);
    }

    public void update(Settlement settlement) {
        settlementDao.update(settlement);
    }

    public void delete(Settlement settlement) {
        settlementDao.delete(settlement);
    }
}
