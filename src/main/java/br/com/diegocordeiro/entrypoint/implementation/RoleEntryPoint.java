package br.com.diegocordeiro.entrypoint.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.business.implementation.FindRoleByIdBusiness;
import br.com.diegocordeiro.business.implementation.PutRoleBusiness;
import br.com.diegocordeiro.entrypoint.EntryPoint;
import br.com.diegocordeiro.model.Role;

public class RoleEntryPoint implements EntryPoint<Role> {

    @Override
    public Role put(Role role){

        Business<Role> business = new PutRoleBusiness(role);

        return business.execute();
    }

    @Override
    public Role findById(Long id) {

        Business<Role> business = new FindRoleByIdBusiness(id);

        return business.execute();
    }
}
