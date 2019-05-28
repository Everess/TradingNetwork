package tnSpringHibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import tnSpringHibernate.models.User;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx2 = session.beginTransaction();
        session.save(user);
        tx2.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx2 = session.beginTransaction();
        session.update(user);
        tx2.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx2 = session.beginTransaction();
        session.delete(user);
        tx2.commit();
        session.close();
    }

}
