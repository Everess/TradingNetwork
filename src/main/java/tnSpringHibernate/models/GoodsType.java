package tnSpringHibernate.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Collection;

/**
 * An entity describing all possible types of goods
 */
@Component
@Entity
@Table(name = "goods_types")
public class GoodsType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_good_type")
    private int idGoodType;

    @Column(name = "good_type")
    private GoodType goodType;

    /**
     * Primary key of Goods List
     */
    @OneToMany(mappedBy = "idGoodType", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<GoodsList> goodsList;

    /**
     * Default constructor
     */
    public GoodsType() {}

    public GoodsType(GoodType goodType) {
        this.goodType = goodType;
    }

    /**
     * Get id type of good
     * @return idGoodType
     */
    public int getIdGoodType() {
        return idGoodType;
    }

    /**
     * Get concrete good type
     * @return goodType
     */
    public GoodType getGoodType() {
        return goodType;
    }

    /**
     * Set concrete good type of good
     * @param goodType New good type
     */
    public void setGoodType(GoodType goodType) {
        this.goodType = goodType;
    }
}
