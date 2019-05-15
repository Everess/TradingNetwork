package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.ProducerDaoImpl;
import tnSpringHibernate.models.Producer;

/**
 * Implementation methods of dao for producer
 */
@Service
public class ProducerService {

    private ProducerDaoImpl producerDao = new ProducerDaoImpl();

    public ProducerService() {

    }

    public Producer findById(int idProducer) {
        return producerDao.findById(idProducer);
    }

    public Producer findByCompanyName(String companyName) {
        return producerDao.findByCompanyName(companyName);
    }

    public Producer findByPhoneNumber(int phoneNumber) {
        return producerDao.findByPhoneNumber(phoneNumber);
    }

    public Producer findByIdSettlement(int idSettlement) {
        return producerDao.findByIdSettlement(idSettlement);
    }

    public void save(Producer producer) {
        producerDao.save(producer);
    }

    public void update(Producer producer) {
        producerDao.update(producer);
    }

    public void delete(Producer producer) {
        producerDao.delete(producer);
    }
}
