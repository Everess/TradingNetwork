package tnSpringHibernate.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Collection;

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
     * Foreign key of Goods Type
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_good_type")
    private GoodsType idGoodType;

    //Реализация при помощи списка или енум?
    @Column(name = "name_of_good")
    private NameOfGood nameOfGood;

    /**
     * Primary key of Good
     */
    @OneToMany(mappedBy = "idGood", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Good> goodList;

    /**
     * Default constructor
     */
    public GoodsList() {

    }

    public GoodsList(GoodsType idGoodType, NameOfGood nameOfGood) {
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
    public GoodsType getIdGoodType() {
        return idGoodType;
    }

    /**
     * Set id type of good
     * @param idGoodType New good type value
     */
    public void setIdGoodType(GoodsType idGoodType) {
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
