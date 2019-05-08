package tnSpringHibernate.services;

import tnSpringHibernate.dao.SaleDaoImpl;
import tnSpringHibernate.models.Sale;
import tnSpringHibernate.models.SaleMethod;

import java.util.Date;

/**
 * Implementation methods of dao for sale
 */
public class SaleService {

    private SaleDaoImpl saleDao = new SaleDaoImpl();

    public SaleService() {

    }

    public Sale findById(int idSale) {
        return saleDao.findById(idSale);
    }

    public Sale findByIdWorker(int idWorker) {
        return saleDao.findByIdWorker(idWorker);
    }

    public Sale findByIdGood(int idGood) {
        return saleDao.findByIdGood(idGood);
    }

    public Sale findBySaleDate(Date saleDate) {
        return saleDao.findBySaleDate(saleDate);
    }

    public Sale findBySaleMethod(SaleMethod saleMethod) {
        return saleDao.findBySaleMethod(saleMethod);
    }

    public Sale findByPrice(int price) {
        return saleDao.findByPrice(price);
    }

    public void save(Sale sale) {
        saleDao.save(sale);
    }

    public void update(Sale sale) {
        saleDao.update(sale);
    }

    public void delete(Sale sale) {
        saleDao.delete(sale);
    }
}
