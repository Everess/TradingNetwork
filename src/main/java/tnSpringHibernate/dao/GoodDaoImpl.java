package tnSpringHibernate.dao;

import tnSpringHibernate.models.Good;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

/**
 * GoodDao Interface implementation with Hibernate
 */
public class GoodDaoImpl implements GoodDao {
    @Override
    public Good findById(int idGood) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Good.class, idGood);
    }

    @Override
    public Good findByValue(int value) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Good.class, value);
    }

    @Override
    public Good findByDiscount(int discount) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Good.class, discount);
    }

    @Override
    public Good findByIdDelivery(int idDelivery) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Good.class, idDelivery);
    }

    @Override
    public void save(Good good) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx7 = session.beginTransaction();
        session.save(good);
        tx7.commit();
        session.close();
    }

    @Override
    public void update(Good good) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx7 = session.beginTransaction();
        session.update(good);
        tx7.commit();
        session.close();
    }

    @Override
    public void delete(Good good) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx7 = session.beginTransaction();
        session.delete(good);
        tx7.commit();
        session.close();
    }
}
