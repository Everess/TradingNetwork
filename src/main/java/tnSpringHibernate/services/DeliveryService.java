package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.DeliveryDaoImpl;
import tnSpringHibernate.models.Delivery;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Implementation methods of dao for delivery
 */
@Service
public class DeliveryService {

    private DeliveryDaoImpl deliveryDao = new DeliveryDaoImpl();

    public DeliveryService() {

    }

    public Delivery findById(int idDelivery) {
        return deliveryDao.findById(idDelivery);
    }

    public Delivery findByIdShop(int idShop) {
        return deliveryDao.findByIdShop(idShop);
    }

    public Delivery findByDeliveryDescription(String deliveryDescription) {
        return deliveryDao.findByDeliveryDescription(deliveryDescription);
    }

    public Delivery findByValue(int value) {
        return deliveryDao.findByValue(value);
    }

    public Delivery findByDateOfDelivery(Date dateOfDelivery) {
        return deliveryDao.findByDateOfDelivery(dateOfDelivery);
    }

    public Delivery findByIdProducer(int idProducer) {
        return deliveryDao.findByIdProducer(idProducer);
    }

    @Transactional
    public void saveDelivery(Delivery delivery) { deliveryDao.save(delivery); }

    @Transactional
    public void updateDelivery(Delivery delivery) {
        deliveryDao.update(delivery);
    }

    @Transactional
    public void deleteDelivery(Delivery delivery) {
        deliveryDao.delete(delivery);
    }
}
