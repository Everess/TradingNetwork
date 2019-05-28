package tnSpringHibernate.dao;

import tnSpringHibernate.models.User;

public interface UserDao {

    /**
     * Save user in db
     * @param user
     */
    void save(User user);

    /**
     * Update user in db
     * @param user
     */
    void update(User user);

    /**
     * Delete user in db
     * @param user
     */
    void delete(User user);

}
