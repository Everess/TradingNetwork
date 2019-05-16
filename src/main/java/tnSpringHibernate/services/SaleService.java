package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.SaleDaoImpl;
import tnSpringHibernate.models.Sale;
import tnSpringHibernate.models.SaleMethod;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Implementation methods of dao for sale
 */
@Service
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

    @Transactional
    public void saveSale(Sale sale) {
        saleDao.save(sale);
    }

    @Transactional
    public void updateSale(Sale sale) {
        saleDao.update(sale);
    }

    @Transactional
    public void deleteSale(Sale sale) {
        saleDao.delete(sale);
    }
}
