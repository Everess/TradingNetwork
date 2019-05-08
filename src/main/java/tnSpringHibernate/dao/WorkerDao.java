package tnSpringHibernate.dao;

import tnSpringHibernate.models.Worker;

import java.util.List;

public interface WorkerDao {
    /**
     * Find by id worker in workers
     * @param idWorker
     * @return
     */
    Worker findById(int idWorker);

    /**
     * Find by id shop in workers
     * @param idShop
     * @return
     */
    Worker findByIdShop(int idShop);

    /**
     * Find by firstname in workers
     * @param firstname
     * @return
     */
    Worker findByFirstname(String firstname);

    /**
     * Find by surname in workers
     * @param surname
     * @return
     */
    Worker findBySurname(String surname);

    /**
     * Find by secondname in workers
     * @param secondname
     * @return
     */
    Worker findBySecondname(String secondname);

    /**
     * Find all workers in workers
     * @return
     */
    List<Worker> findAll();

    /**
     * Save worker in db
     * @param worker
     */
    void save(Worker worker);

    /**
     * Update worker in db
     * @param worker
     */
    void update(Worker worker);

    /**
     * Delete worker in db
     * @param worker
     */
    void delete(Worker worker);
}
