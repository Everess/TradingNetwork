package tnSpringHibernate.dao;

import tnSpringHibernate.models.Settlement;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

import java.util.List;

/**
 * SettlementDao Interface implementation with Hibernate
 */
public class SettlementDaoImpl implements SettlementDao {

    @Override
    public Settlement findByIdSettlement(int idSettlement) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Settlement.class, idSettlement);
    }

    @Override
    public Settlement findByRegion(String region) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Settlement.class, region);
    }

    @Override
    public Settlement findByCity(String city) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Settlement.class, city);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Settlement> findAll() {
        List<Settlement> settlements = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Settlement").list();
        return settlements;
    }

    @Override
    public void save(Settlement settlement) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx3 = session.beginTransaction();
        session.save(settlement);
        tx3.commit();
        session.close();
    }

    @Override
    public void update(Settlement settlement) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx3 = session.beginTransaction();
        session.update(settlement);
        tx3.commit();
        session.close();
    }

    @Override
    public void delete(Settlement settlement) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx3 = session.beginTransaction();
        session.delete(settlement);
        tx3.commit();
        session.close();
    }

}
