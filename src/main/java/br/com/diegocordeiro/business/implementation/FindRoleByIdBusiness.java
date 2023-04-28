package br.com.diegocordeiro.business.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.model.Role;

public class FindRoleByIdBusiness implements Business<Role> {

    private final Long id;

    private DAO<Role> dao;

    public FindRoleByIdBusiness(Long id){
        this.id = id;
    }

    @Override
    public Role execute() {
        return this.dao.findById(this.id);
    }
}
