package tnSpringHibernate.utils;

import tnSpringHibernate.models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                //Entities
                configuration.addAnnotatedClass(Delivery.class);
                configuration.addAnnotatedClass(Good.class);
                configuration.addAnnotatedClass(GoodsList.class);
                configuration.addAnnotatedClass(GoodsType.class);
                configuration.addAnnotatedClass(Producer.class);
                configuration.addAnnotatedClass(Sale.class);
                configuration.addAnnotatedClass(Settlement.class);
                configuration.addAnnotatedClass(Shop.class);
                configuration.addAnnotatedClass(Worker.class);


                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
