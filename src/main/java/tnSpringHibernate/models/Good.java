package tnSpringHibernate.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * An entity describing a product in a particular store
 */
@Component
@Entity
@Table(name = "goods")
public class Good implements Serializable {

    /**
     * Foreign key of Goods List
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_good")
    private GoodsList idGood;

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
     * Foreign key of Delivery
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_delivery")
    private Delivery idDelivery;

    /**
     * Primary key of Sale
     */
    @OneToMany(mappedBy = "idGood", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Sale> goodSaleList;

    /**
     * Default constructor
     */
    public Good() {}

    public Good(GoodsList idGood, int value, int discount, Delivery idDelivery) {
        this.idGood = idGood;
        this.value = value;
        this.discount = discount;
        this.idDelivery = idDelivery;
    }

    /**
     * Get id good
     * @return idGood
     */
    public GoodsList getIdGood() {
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
    public Delivery getIdDelivery() {
        return idDelivery;
    }

    /**
     * Set id of delivery
     * @param idDelivery New id of delivery concrete good
     */
    public void setIdDelivery(Delivery idDelivery) {
        this.idDelivery = idDelivery;
    }
}
