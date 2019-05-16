package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.ProducerDaoImpl;
import tnSpringHibernate.models.Producer;

import javax.transaction.Transactional;

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

    @Transactional
    public void saveProducer(Producer producer) {
        producerDao.save(producer);
    }

    @Transactional
    public void updateProducer(Producer producer) {
        producerDao.update(producer);
    }

    @Transactional
    public void deleteProducer(Producer producer) {
        producerDao.delete(producer);
    }
}
