package tnSpringHibernate.dao;

import tnSpringHibernate.models.Producer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

/**
 * ProducerDao Interface implementation with Hibernate
 */
public class ProducerDaoImpl implements ProducerDao {
    @Override
    public Producer findById(int idProducer) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Producer.class, idProducer);
    }

    @Override
    public Producer findByCompanyName(String companyName) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Producer.class, companyName);
    }

    @Override
    public Producer findByPhoneNumber(int phoneNumber) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Producer.class, phoneNumber);
    }

    @Override
    public Producer findByIdSettlement(int idSettlement) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Producer.class, idSettlement);
    }

    @Override
    public void save(Producer producer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx5 = session.beginTransaction();
        session.save(producer);
        tx5.commit();
        session.close();
    }

    @Override
    public void update(Producer producer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx5 = session.beginTransaction();
        session.update(producer);
        tx5.commit();
        session.close();
    }

    @Override
    public void delete(Producer producer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx5 = session.beginTransaction();
        session.delete(producer);
        tx5.commit();
        session.close();
    }
}
