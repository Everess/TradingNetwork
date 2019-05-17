package tnSpringHibernate.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * An entity describing a specific store.
 */
@Component
@Entity
@Table(name = "shops", schema = "public")
public class Shop implements Serializable {

    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shop")
    private int idShop;

    @Column(name = "name_of_shop")
    private String nameOfShop;

    /**
     * Foreign key for Settlement
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_settlement")
    private Settlement idSettlement;

    /**
     * Primary key for Worker
     */
    @OneToMany(mappedBy = "idShop", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Worker> workerList;

    /**
     * Primary key for Delivery
     */
    @OneToMany(mappedBy = "idShop", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Delivery> deliveryList;

    /**
     * Default constructor
     */
    public Shop() {

    }

    public Shop(String nameOfShop, Settlement idSettlement) {
        this.nameOfShop = nameOfShop;
        this.idSettlement = idSettlement;
    }

    /*public Collection<Worker> getWorkerList() {
        return workerList;
    }*/


    /**
     * Get shop id
     * @return idShop
     */
    public int getIdShop() {
        return idShop;
    }

    /**
     * Get shop name
     * @return nameOfShop
     */
    public String getNameOfShop() {
        return nameOfShop;
    }

    /**
     * Set shop name
     * @param nameOfShop New name of shop
     */
    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    /**
     * Get id settlement
     * @return idSettlement
     */
    public Settlement getIdSettlement() {
        return idSettlement;
    }

    /**
     * Set idSettlement
     * @param idSettlement New id settlement
     */
    public void setIdSettlement(Settlement idSettlement) {
        this.idSettlement = idSettlement;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "idShop=" + idShop +
                ", nameOfShop='" + nameOfShop + '\'' +
                ", idSettlement=" + idSettlement +
                '}';
    }
}
