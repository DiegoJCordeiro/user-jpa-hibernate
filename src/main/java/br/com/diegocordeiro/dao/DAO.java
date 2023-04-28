package br.com.diegocordeiro.dao;

import br.com.diegocordeiro.configuration.PersistenceUnit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class DAO<T> {

    protected EntityManagerFactory managerFactory;
    protected EntityManager manager;
    protected final Class<T> entity;

    protected DAO(PersistenceUnit persistenceUnit, Class<T> entity) {

        this.entity = entity;
        managerFactory = Persistence.createEntityManagerFactory(persistenceUnit.getUnit());
    }

    protected void open() {

        manager = managerFactory.createEntityManager();
        manager.getTransaction().begin();
    }

    protected void close(boolean isCommit) {

        if(isCommit) {
            manager.getTransaction().commit();
        }

        manager.close();
    }

    public boolean save(T object) {

        open();

        manager.persist(object);

        close(true);

        return true;
    }

    public T findById(Long id) {

        open();

        T objectFound = this.manager.find(entity, id);
        manager.detach(objectFound);

        close(false);

        return objectFound;
    }

    public boolean update(T object) {

        open();

        manager.merge(object);

        close(true);

        return true;
    }

    public boolean remove(T object) {

        open();

        this.manager.remove(object);

        close(true);

        return true;
    }
}
