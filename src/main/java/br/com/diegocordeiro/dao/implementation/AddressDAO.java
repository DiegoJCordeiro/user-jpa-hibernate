package br.com.diegocordeiro.dao.implementation;

import br.com.diegocordeiro.configuration.PersistenceUnit;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.model.Address;

import jakarta.persistence.TypedQuery;
import java.util.List;

public class AddressDAO extends DAO<Address> {

    public AddressDAO() {
        super(PersistenceUnit.POSTGRESQL, Address.class);
    }

    public List<Address> findByZipCode(String zipCode){

        open();

        String sql = "SELECT A FROM Address A WHERE A.ZIP = :zipAddress";

        TypedQuery<Address> query = manager.createQuery(sql, Address.class);
        query.setParameter("zipAddress", zipCode);
        query.setMaxResults(5);

        List<Address> addressesFound = query.getResultList();

        manager.detach(addressesFound);

        close(false);

        return addressesFound;
    }
}
