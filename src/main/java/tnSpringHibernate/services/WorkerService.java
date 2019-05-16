package tnSpringHibernate.services;

import org.springframework.stereotype.Service;
import tnSpringHibernate.dao.WorkerDaoImpl;
import tnSpringHibernate.models.Worker;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Implementation methods of dao for worker
 */
@Service
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

    public List<Worker> findAllWorkers() {
        return workerDao.findAllWorkers();
    }

    @Transactional
    public void saveWorker(Worker worker) {
        workerDao.save(worker);
    }

    @Transactional
    public void updateWorker(Worker worker) {
        workerDao.update(worker);
    }

    @Transactional
    public void deleteWorker(Worker worker) {
        workerDao.delete(worker);
    }

}
