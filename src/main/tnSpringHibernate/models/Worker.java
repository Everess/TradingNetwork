package tnSpringHibernate.models;

import javax.persistence.*;

/**
 * An entity describing a specific worker in shop.
 */
@Entity
@Table(name = "workers")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_worker")
    private int idWorker;

    @Column(name = "id_shop")
    private int idShop;

    @Column(name = "firstname", length = 50)
    private String firstname;

    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "secondname", length = 50)
    private String secondname;

    /**
     * Default constructor
     */
    public Worker() {

    }

    public Worker(int idShop, String firstname, String surname, String secondname) {
        this.idShop = idShop;
        this.firstname = firstname;
        this.surname = surname;
        this.secondname = secondname;
    }

    /**
     * Get worker id
     * @return idWorker
     */
    public int getIdWorker() {
        return idWorker;
    }

    /**
     * Get id of shop
     * @return idShop
     */
    public int getIdShop() {
        return idShop;
    }

    /**
     * Set id of shop
     * @param idShop New id shop
     */
    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    /**
     * Get firstname of worker
     * @return firsname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Set firstname of worker
     * @param firstname New firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Get surname of worker
     * @return surname New surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set surname of worker
     * @param surname New surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get secondname of worker
     * @return secondname
     */
    public String getSecondname() {
        return secondname;
    }

    /**
     * Set secondname of worker
     * @param secondname New secondname
     */
    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "idWorker=" + idWorker +
                ", idShop=" + idShop +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", secondname='" + secondname + '\'' +
                '}';
    }
}
