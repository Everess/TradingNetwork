package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.UserDaoImpl;
import tnSpringHibernate.models.User;

import javax.transaction.Transactional;

@Service
public class UserService {

    private UserDaoImpl userDao = new UserDaoImpl();

    public UserService() {

    }

    @Transactional
    public void saveShop(User user) {
        userDao.save(user);
    }

    @Transactional
    public void updateShop(User user) {
        userDao.update(user);
    }

    @Transactional
    public void deleteShop(User user) {
        userDao.delete(user);
    }

}
