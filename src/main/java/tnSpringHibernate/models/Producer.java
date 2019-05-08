package tnSpringHibernate.models;

import javax.persistence.*;

/**
 * An entity describing the producers of goods
 */
@Entity
@Table(name = "producers")
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producer")
    private int idProducer;

    @Column(name = "company_name", length = 50)
    private String companyName;

    @Column(name = "phone_number", length = 19)
    private int phoneNumber;

    /**
     * The id of the supplier’s company (region, city)
     */
    @Column(name = "id_settlement")
    private int idSettlement;

    /**
     * Default constructor
     */
    public Producer() {}

    public Producer(String companyName, int phoneNumber, int idSettlement) {
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.idSettlement = idSettlement;
    }

    /**
     * Get id of producer
     * @return idProducer
     */
    public int getIdProducer() {
        return idProducer;
    }

    /**
     * Get company name
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Set company name
     * @param companyName New company name value
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Get producer phone number
     * @return
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set producer phone number
     * @param phoneNumber New phone number
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get id settlement(region, city)
     * @return
     */
    public int getIdSettlement() {
        return idSettlement;
    }

    /**
     * Set id settlement
     * @param idSettlement New id settlement
     */
    public void setIdSettlement(int idSettlement) {
        this.idSettlement = idSettlement;
    }
}
