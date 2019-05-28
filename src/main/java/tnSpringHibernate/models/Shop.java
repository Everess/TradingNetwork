package tnSpringHibernate.models;

import com.fasterxml.jackson.annotation.*;
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

/**
 * TODO: Custom serializer?
 */

//@JsonAutoDetect // Marks a class as ready for serialization in JSON.
/*@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@class") */ // Information about type of this class. For serializing in shops.json
public class Shop implements Serializable {

    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shop")
    //@JsonProperty(value = "ID of shop")
    @JsonIgnore
    private int idShop;

    @Column(name = "name_of_shop")
    @JsonProperty(value = "NameOfShop")
    @JsonPropertyDescription(value = "Описание")
    private String nameOfShop;

    /**
     * Foreign key for Settlement
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_settlement")
    //@JsonProperty(value = "Settlement")
    @JsonIgnore
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

    @JsonCreator
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