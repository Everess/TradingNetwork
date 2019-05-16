package tnSpringHibernate.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import tnSpringHibernate.models.Shop;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

import java.util.List;

/**
 * ShopDao Interface implementation with Hibernate
 */
@Repository
public class ShopDaoImpl implements ShopDao {

    @Override
    public Shop findByIdShop(int idShop) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Shop.class, idShop);
    }

    @Override
    public Shop findByNameOfShop(String nameOfShop) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Shop.class, nameOfShop);
    }

    @Override
    public Shop findByIdSettlement(int idSettlement) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Shop.class, idSettlement);
    }

    @Override
    @SuppressWarnings("unchecked") // TODO: Rewrite?
    public List<Shop> findAllShops() {
        List<Shop> shops = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Shop").list();
        return shops;
    }

    @Override
    public void save(Shop shop) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(shop);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Shop shop) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(shop);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Shop shop) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(shop);
        tx1.commit();
        session.close();
    }
}
