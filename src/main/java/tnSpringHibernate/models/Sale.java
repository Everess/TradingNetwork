package tnSpringHibernate.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity describing a specific sale
 */
@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sale")
    private int idSale;

    @Column(name = "id_worker")
    private int idWorker;

    @Column(name = "id_good")
    private int idGood;

    //Import date, sql or util?
    @Column(name = "sale_date")
    private Date saleDate;

    /**
     * Payment method(card, cash)
     */
    @Column(name = "sale_method")
    private SaleMethod saleMethod;

    /**
     * Purchase price
     */
    @Column(name = "price")
    private int price;

    /**
     * Default constructor
     */
    public Sale() {

    }

    public Sale(int idWorker, int idGood, Date saleDate, SaleMethod saleMethod, int price) {
        this.idWorker = idWorker;
        this.idGood = idGood;
        this.saleDate = saleDate;
        this.saleMethod = saleMethod;
        this.price = price;
    }

    /**
     * Get id sale
     * @return idSale
     */
    public int getIdSale() {
        return idSale;
    }

    /**
     * Get worker id
     * @return idWorker
     */
    public int getIdWorker() {
        return idWorker;
    }

    /**
     * Set id worker
     * @param idWorker New id of worker
     */
    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    /**
     * Get id of good
     * @return idGood
     */
    public int getIdGood() {
        return idGood;
    }

    /**
     * Set id of good
     * @param idGood New id of good
     */
    public void setIdGood(int idGood) {
        this.idGood = idGood;
    }

    /**
     * Get sale date
     * @return saleDate
     */
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     * Set sale date
     * @param saleDate Current sale date
     */
    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * Get sale method(card, cash)
     * @return
     */
    public SaleMethod getSaleMethod() {
        return saleMethod;
    }

    /**
     * Set sale method(card, cash)
     * @param saleMethod New sale method
     */
    public void setSaleMethod(SaleMethod saleMethod) {
        this.saleMethod = saleMethod;
    }

    /**
     * Get price of purchase
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Set price of purchase
     * @param price New price
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
