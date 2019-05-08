package tnSpringHibernate.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * An entity describing a product in a particular store
 */
@Component
@Entity
@Table(name = "goods")
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_good")
    private int idGood;

    /**
     * The number of specific goods in the store
     */
    @Column(name = "value")
    private int value;

    /**
     * Product discount
     */
    @Column(name = "discount")
    private int discount;

    /**
     * Id of concrete delivery
     */
    @Column(name = "id_delivery")
    private int idDelivery;

    /**
     * Default constructor
     */
    public Good() {}

    public Good(int value, int discount, int idDelivery) {
        this.value = value;
        this.discount = discount;
        this.idDelivery = idDelivery;
    }

    /**
     * Get id good
     * @return idGood
     */
    public int getIdGood() {
        return idGood;
    }

    /**
     * Get goods value
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set goods value
     * @param value New value of good
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Get good discount
     * @return discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * Set discount of concrete good
     * @param discount New discount value of good
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * Get id of delivery
     * @return idDelivery
     */
    public int getIdDelivery() {
        return idDelivery;
    }

    /**
     * Set id of delivery
     * @param idDelivery New id of delivery concrete good
     */
    public void setIdDelivery(int idDelivery) {
        this.idDelivery = idDelivery;
    }
}
