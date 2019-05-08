package tnSpringHibernate.dao;

import tnSpringHibernate.models.Sale;
import tnSpringHibernate.models.SaleMethod;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

import java.util.Date;

/**
 * SaleDao Interface implementation with Hibernate
 */
public class SaleDaoImpl implements SaleDao {
    @Override
    public Sale findById(int idSale) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Sale.class, idSale);
    }

    @Override
    public Sale findByIdWorker(int idWorker) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Sale.class, idWorker);
    }

    @Override
    public Sale findByIdGood(int idGood) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Sale.class, idGood);
    }

    @Override
    public Sale findBySaleDate(Date saleDate) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Sale.class, saleDate);
    }

    @Override
    public Sale findBySaleMethod(SaleMethod saleMethod) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Sale.class, saleMethod);
    }

    @Override
    public Sale findByPrice(int price) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Sale.class, price);
    }

    @Override
    public void save(Sale sale) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx6 = session.beginTransaction();
        session.save(sale);
        tx6.commit();
        session.close();
    }

    @Override
    public void update(Sale sale) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx6 = session.beginTransaction();
        session.update(sale);
        tx6.commit();
        session.close();
    }

    @Override
    public void delete(Sale sale) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx6 = session.beginTransaction();
        session.delete(sale);
        tx6.commit();
        session.close();
    }
}
