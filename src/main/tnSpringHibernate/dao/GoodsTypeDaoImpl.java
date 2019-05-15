package tnSpringHibernate.dao;

import org.springframework.stereotype.Repository;
import tnSpringHibernate.models.GoodsType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

/**
 * GoodsTypeDao Interface implementation with Hibernate
 */
@Repository
public class GoodsTypeDaoImpl implements GoodsTypeDao {
    @Override
    public GoodsType findById(int idGoodType) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(GoodsType.class, idGoodType);
    }

    @Override
    public GoodsType findByGoodType(String goodType) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(GoodsType.class, goodType);
    }

    @Override
    public void save(GoodsType goodsType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx9 = session.beginTransaction();
        session.save(goodsType);
        tx9.commit();
        session.close();
    }

    @Override
    public void update(GoodsType goodsType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx9 = session.beginTransaction();
        session.update(goodsType);
        tx9.commit();
        session.close();
    }

    @Override
    public void delete(GoodsType goodsType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx9 = session.beginTransaction();
        session.delete(goodsType);
        tx9.commit();
        session.close();
    }
}
