package tnSpringHibernate.models;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * The entity that describes the delivery.
 */
//@Component
@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_delivery")
    private int idDelivery;

    @Column(name = "id_shop")
    private int idShop;

    @Column(name = "delivery_description")
    private String deliveryDescription;

    /**
     * Quantity of goods delivered.
     */
    @Column(name = "value")
    private int value;

    //Импорт Date, из sql или util?
    /**
     * Date of concrete delivery
     */
    @Column(name = "date_of_delivery")
    private Date dateOfDelivery;

    @Column(name = "id_producer")
    private int idProducer;

    /**
     * Default constructor.
     */
    public Delivery() {

    }

    public Delivery(int idShop, String deliveryDescription, int value, Date dateOfDelivery, int idProducer) {
        this.idShop = idShop;
        this.deliveryDescription = deliveryDescription;
        this.value = value;
        this.dateOfDelivery = dateOfDelivery;
        this.idProducer = idProducer;
    }

    /**
     * Get id of delivery
     * @return idDelivery
     */
    public int getIdDelivery() {
        return idDelivery;
    }

    /**
     * Get id of shop
     * @return idShop
     */
    public int getIdShop() {
        return idShop;
    }

    /**
     * Set id of shop
     * @param idShop new id shop
     */
    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    /**
     * Get concrete delivery description
     * @return
     */
    public String getDeliveryDescription() {
        return deliveryDescription;
    }

    /**
     * Set concrete delivery description
     * @param deliveryDescription
     */
    public void setDeliveryDescription(String deliveryDescription) {
        this.deliveryDescription = deliveryDescription;
    }

    /**
     * Get the quantity of goods delivered
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the quantity of goods delivered
     * @param value new value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Get date of concrete delivery
     * @return dateOfDelivery date
     */
    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    /**
     * Set date of concrete delivery
     * @param dateOfDelivery new date of delivery
     */
    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    /**
     * Get id producer
     * @return idProducer
     */
    public int getIdProducer() {
        return idProducer;
    }

    /**
     * Set id producer
     * @param idProducer new id producer
     */
    public void setIdProducer(int idProducer) {
        this.idProducer = idProducer;
    }
}
