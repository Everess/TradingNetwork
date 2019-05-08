package tnSpringHibernate.models;

import javax.persistence.*;

/**
 * An entity describing all possible types of goods
 */
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
