package tnSpringHibernate.dao;

import org.springframework.stereotype.Repository;
import tnSpringHibernate.models.Worker;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tnSpringHibernate.utils.HibernateSessionFactoryUtil;

import java.util.List;

/**
 * WorkerDao Interface implementation with Hibernate
 */
@Repository
public class WorkerDaoImpl implements WorkerDao {

    @Override
    public Worker findById(int idWorker) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Worker.class, idWorker);
    }

    @Override
    public Worker findByIdShop(int idShop) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Worker.class, idShop);
    }

    @Override
    public Worker findByFirstname(String firstname) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Worker.class, firstname);
    }

    @Override
    public Worker findBySurname(String surname) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Worker.class, surname);
    }

    @Override
    public Worker findBySecondname(String secondname) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Worker.class, secondname);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Worker> findAll() {
        List<Worker> workers = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Worker").list();
        return workers;
    }

    @Override
    public void save(Worker worker) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx2 = session.beginTransaction();
        session.save(worker);
        tx2.commit();
        session.close();
    }

    @Override
    public void update(Worker worker) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx2 = session.beginTransaction();
        session.update(worker);
        tx2.commit();
        session.close();
    }

    @Override
    public void delete(Worker worker) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx2 = session.beginTransaction();
        session.delete(worker);
        tx2.commit();
        session.close();
    }

}
