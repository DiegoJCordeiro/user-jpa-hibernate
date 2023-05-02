package br.com.diegocordeiro.dao.implementation;

import br.com.diegocordeiro.configuration.PersistenceUnit;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.model.AddressByUser;

public class AddressByUserDAO extends DAO<AddressByUser> {

    public AddressByUserDAO() {
        super(PersistenceUnit.POSTGRESQL, AddressByUser.class);
    }
}
