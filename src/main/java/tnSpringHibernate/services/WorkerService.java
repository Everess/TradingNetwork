package tnSpringHibernate.services;

import tnSpringHibernate.dao.WorkerDaoImpl;
import tnSpringHibernate.models.Worker;

import java.util.List;

/**
 * Implementation methods of dao for worker
 */
public class WorkerService {

    private WorkerDaoImpl workerDao = new WorkerDaoImpl();

    public WorkerService() {

    }

    public Worker findById(int idWorker) {
        return workerDao.findById(idWorker);
    }

    public Worker findByFirstname(String firstname) {
        return workerDao.findByFirstname(firstname);
    }

    public Worker findBySurname(String surname) {
        return workerDao.findBySurname(surname);
    }

    public Worker findBySecondname(String secondname) {
        return workerDao.findBySecondname(secondname);
    }

    public List<Worker> findAll() {
        return workerDao.findAll();
    }

    public void save(Worker worker) {
        workerDao.save(worker);
    }

    public void update(Worker worker) {
        workerDao.update(worker);
    }

    public void delete(Worker worker) {
        workerDao.delete(worker);
    }

}
