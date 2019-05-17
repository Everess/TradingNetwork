package tnSpringHibernate.models;

import javax.persistence.*;
import java.util.Collection;

/**
 * An entity describing a settlement of shop or producer.
 */
@Entity
@Table(name = "settlements")
public class Settlement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_settlement")
    private int idSettlement;

    @Column(name = "region", length = 50)
    private String region;

    @Column(name = "city", length = 50)
    private String city;

    /**
     * Primary key for Shop
     */
    @OneToMany(mappedBy = "idSettlement", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Shop> shopList;

    /**
     * Primary key for Producer
     */
    @OneToMany(mappedBy = "idSettlement", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Producer> producerList;

    /**
     * Default constructor
     */
    public Settlement() {

    }

    public Settlement(String region, String city) {
        this.region = region;
        this.city = city;
    }

   /* public Collection<Shop> getShopList() {
        return shopList;
    }*/

    /**
     * Get id of settlement
     * @return idSettlement
     */
    public int getIdSettlement() {
        return idSettlement;
    }

    /**
     * Get concrete region for concrete shop/producer
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Set concrete region for concrete shop/producer
     * @param region New region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Get concrete city for concrete shop/producer
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set concrete city for concrete shop/producer
     * @param city New city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
