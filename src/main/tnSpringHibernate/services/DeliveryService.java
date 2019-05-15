package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.DeliveryDaoImpl;
import tnSpringHibernate.models.Delivery;

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

    public void save(Delivery delivery) {
        deliveryDao.save(delivery);
    }

    public void update(Delivery delivery) {
        deliveryDao.update(delivery);
    }

    public void delete(Delivery delivery) {
        deliveryDao.delete(delivery);
    }
}
