package br.com.diegocordeiro.business.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.dao.implementation.RoleDAO;
import br.com.diegocordeiro.model.Role;

public class PutRoleBusiness implements Business<Role> {

    private final Role role;
    private final DAO<Role> dao;

    public PutRoleBusiness(Role role) {
        this.role = role;
        this.dao = new RoleDAO();
    }

    @Override
    public Role execute() {

        this.dao.save(role);

        return this.role;
    }
}
