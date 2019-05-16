package tnSpringHibernate.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * An entity describing all possible products
 */
@Component
@Entity
@Table(name = "goods_list")
public class GoodsList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_good")
    private int idGood;

    /**
     * Id type of good
     */
    @Column(name = "id_good_type")
    private int idGoodType;

    //Реализация при помощи списка или енум?
    @Column(name = "name_of_good")
    private NameOfGood nameOfGood;

    /**
     * Default constructor
     */
    public GoodsList() {

    }

    public GoodsList(int idGoodType, NameOfGood nameOfGood) {
        this.idGoodType = idGoodType;
        this.nameOfGood = nameOfGood;
    }

    /**
     * Get id good in all list
     * @return idGood
     */
    public int getIdGood() {
        return idGood;
    }

    /**
     * Get id type of good in all list
     * @return idGoodType
     */
    public int getIdGoodType() {
        return idGoodType;
    }

    /**
     * Set id type of good
     * @param idGoodType New good type value
     */
    public void setIdGoodType(int idGoodType) {
        this.idGoodType = idGoodType;
    }

    /**
     * Get name of good in all list
     * @return nameOfGood
     */
    public NameOfGood getNameOfGood() {
        return nameOfGood;
    }

    /**
     * Set name of good in all list
     * @param nameOfGood New name of good value
     */
    public void setNameOfGood(NameOfGood nameOfGood) {
        this.nameOfGood = nameOfGood;
    }
}
