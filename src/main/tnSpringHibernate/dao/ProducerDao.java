package tnSpringHibernate.dao;

import tnSpringHibernate.models.Producer;

public interface ProducerDao {
    /**
     * Find id of producer
     * @param idProducer
     * @return
     */
    Producer findById(int idProducer);

    /**
     * Find company name of producer
     * @param companyName
     * @return
     */
    Producer findByCompanyName(String companyName);

    /**
     * Find phone number of producer
     * @param phoneNumber
     * @return
     */
    Producer findByPhoneNumber(int phoneNumber);

    /**
     * Find id settlement of producer
     * @param idSettlement
     * @return
     */
    Producer findByIdSettlement(int idSettlement);

    /**
     * Save producer in db
     * @param producer
     */
    void save(Producer producer);

    /**
     * Update producer in db
     * @param producer
     */
    void update(Producer producer);

    /**
     * Delete producer in db
     * @param producer
     */
    void delete(Producer producer);
}
