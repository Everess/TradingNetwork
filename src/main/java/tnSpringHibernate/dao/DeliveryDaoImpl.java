package tnSpringHibernate.dao;

import tnSpringHibernate.models.Delivery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

import java.util.Date;

/**
 * DeliveryDao Interface implementation with Hibernate
 */
public class DeliveryDaoImpl implements DeliveryDao {
    @Override
    public Delivery findById(int idDelivery) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Delivery.class, idDelivery);
    }

    @Override
    public Delivery findByIdShop(int idShop) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Delivery.class, idShop);
    }

    @Override
    public Delivery findByDeliveryDescription(String deliveryDescription) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Delivery.class, deliveryDescription);
    }

    @Override
    public Delivery findByValue(int value) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Delivery.class, value);
    }

    @Override
    public Delivery findByDateOfDelivery(Date dateOfDelivery) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Delivery.class, dateOfDelivery);
    }

    @Override
    public Delivery findByIdProducer(int idProducer) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Delivery.class, idProducer);
    }

    @Override
    public void save(Delivery delivery) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx4 = session.beginTransaction();
        session.save(delivery);
        tx4.commit();
        session.close();
    }

    @Override
    public void update(Delivery delivery) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx4 = session.beginTransaction();
        session.update(delivery);
        tx4.commit();
        session.close();
    }

    @Override
    public void delete(Delivery delivery) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx4 = session.beginTransaction();
        session.delete(delivery);
        tx4.commit();
        session.close();
    }
}
