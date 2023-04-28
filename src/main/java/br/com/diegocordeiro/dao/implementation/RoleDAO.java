package br.com.diegocordeiro.dao.implementation;

import br.com.diegocordeiro.configuration.PersistenceUnit;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.model.Role;

public class RoleDAO extends DAO<Role> {

    public RoleDAO() {
        super(PersistenceUnit.POSTGRESQL, Role.class);
    }
}
