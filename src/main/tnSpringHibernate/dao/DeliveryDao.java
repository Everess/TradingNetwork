package tnSpringHibernate.dao;

import tnSpringHibernate.models.Delivery;

import java.util.Date;

public interface DeliveryDao {
    /**
     * Find delivery with id
     * @param idDelivery
     * @return
     */
    Delivery findById(int idDelivery);

    /**
     * Find id shop for delivery
     * @param idShop
     * @return
     */
    Delivery findByIdShop(int idShop);

    /**
     * Find delivery by delivery description
     * @param deliveryDescription
     * @return
     */
    Delivery findByDeliveryDescription(String deliveryDescription);

    /**
     * Find delivery value
     * @param value
     * @return
     */
    Delivery findByValue(int value);

    /**
     * Find date of delivery
     * @param dateOfDelivery
     * @return
     */
    Delivery findByDateOfDelivery(Date dateOfDelivery);

    /**
     * Find id producer
     * @param idProducer
     * @return
     */
    Delivery findByIdProducer(int idProducer);

    /**
     * Save delivery in database
     * @param delivery
     */
    void save(Delivery delivery);

    /**
     * Update delivery in database
     * @param delivery
     */
    void update(Delivery delivery);

    /**
     * Delete delivery in database
     * @param delivery
     */
    void delete(Delivery delivery);
}
