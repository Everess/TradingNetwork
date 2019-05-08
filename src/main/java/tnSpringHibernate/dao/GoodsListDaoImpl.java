package tnSpringHibernate.dao;

import tnSpringHibernate.models.GoodsList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

/**
 * GoodsListDao Interface implementation with Hibernate
 */
public class GoodsListDaoImpl implements GoodsListDao {
    @Override
    public GoodsList findById(int idGood) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(GoodsList.class, idGood);
    }

    @Override
    public GoodsList findByIdGoodType(int idGoodType) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(GoodsList.class, idGoodType);
    }

    @Override
    public GoodsList findByNameOfGood(String nameOfGood) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(GoodsList.class, nameOfGood);
    }

    @Override
    public void save(GoodsList goodsList) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx8 = session.beginTransaction();
        session.save(goodsList);
        tx8.commit();
        session.close();
    }

    @Override
    public void update(GoodsList goodsList) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx8 = session.beginTransaction();
        session.update(goodsList);
        tx8.commit();
        session.close();
    }

    @Override
    public void delete(GoodsList goodsList) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx8 = session.beginTransaction();
        session.delete(goodsList);
        tx8.commit();
        session.close();
    }
}
