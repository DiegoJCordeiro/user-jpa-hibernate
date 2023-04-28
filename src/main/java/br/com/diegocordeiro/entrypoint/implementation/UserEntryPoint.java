package br.com.diegocordeiro.entrypoint.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.business.implementation.FindUserByIdBusiness;
import br.com.diegocordeiro.business.implementation.PutUserBusiness;
import br.com.diegocordeiro.entrypoint.EntryPoint;
import br.com.diegocordeiro.model.User;

public class UserEntryPoint implements EntryPoint<User> {

    @Override
    public User put(User user){

        Business<User> business = new PutUserBusiness(user);

        return business.execute();
    }

    @Override
    public User findById(Long id){

        Business<User> business = new FindUserByIdBusiness(id);

        return business.execute();
    }
}
