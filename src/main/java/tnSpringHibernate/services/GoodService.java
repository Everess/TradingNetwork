package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.GoodDaoImpl;
import tnSpringHibernate.models.Good;

import javax.transaction.Transactional;

/**
 * Implementation methods of dao for Good
 */
@Service
public class GoodService {

    private GoodDaoImpl goodDao = new GoodDaoImpl();

    public GoodService() {

    }

    public Good findById(int idGood) {
        return goodDao.findById(idGood);
    }

    public Good findByValue(int value) {
        return goodDao.findByValue(value);
    }

    public Good findByDiscount(int discount) {
        return goodDao.findByDiscount(discount);
    }

    public Good findByIdDelivery(int idDelivery) {
        return goodDao.findByDiscount(idDelivery);
    }

    @Transactional
    public void saveGood(Good good) {
        goodDao.save(good);
    }

    @Transactional
    public void updateGood(Good good) {
        goodDao.update(good);
    }

    @Transactional
    public void deleteGood(Good good) {
        goodDao.delete(good);
    }
}
