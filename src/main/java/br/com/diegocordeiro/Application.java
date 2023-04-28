package br.com.diegocordeiro;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.business.implementation.PutAddressBusiness;
import br.com.diegocordeiro.business.implementation.PutRoleBusiness;
import br.com.diegocordeiro.business.implementation.PutUserBusiness;
import br.com.diegocordeiro.entrypoint.EntryPoint;
import br.com.diegocordeiro.entrypoint.implementation.AddressEntryPoint;
import br.com.diegocordeiro.entrypoint.implementation.RoleEntryPoint;
import br.com.diegocordeiro.entrypoint.implementation.UserEntryPoint;
import br.com.diegocordeiro.model.Address;
import br.com.diegocordeiro.model.Level;
import br.com.diegocordeiro.model.Role;
import br.com.diegocordeiro.model.User;

import java.util.List;

public class Application
{
    public static void main( String[] args )
    {

        Address addressOne = new Address("Av. Lico Maia",
        "Conceição",
                431,
                "Diadema",
                "SP",
                "Brazil",
                Boolean.TRUE);

        Address addressTwo = new Address("Av. Lico Maia",
                "Conceição",
                432,
                "Diadema",
                "SP",
                "Brazil",
                Boolean.FALSE);

        Address addressThree = new Address("Av. Lico Maia",
                "Conceição",
                433,
                "Diadema",
                "SP",
                "Brazil",
                Boolean.FALSE);

        EntryPoint<Address> addressEntryPoint = new AddressEntryPoint();

        addressEntryPoint.put(addressOne);
        addressEntryPoint.put(addressTwo);
        addressEntryPoint.put(addressThree);

        Role roleReader = new Role(null, "READER",
                "Role to Reader.",
                Level.READER);

        Role roleWriter = new Role(null, "WRITER",
                "Role to Writer.",
                Level.WRITER);

        Role roleAdministrator = new Role(null, "ADMINISTRATOR",
                "Role to Administrators.",
                Level.ADMIN);

        EntryPoint<Role> roleEntryPoint = new RoleEntryPoint();

        roleEntryPoint.put(roleReader);
        roleEntryPoint.put(roleWriter);
        roleEntryPoint.put(roleAdministrator);

        User user = new User("Velocity_T108",
                "Velocity Treinamentos",
                "velocity.treinamentos@gmail.com",
                1,
                List.of(addressOne, addressTwo, addressThree),
                roleAdministrator,
                "123456789");

        EntryPoint<User> userEntryPoint = new UserEntryPoint();
        userEntryPoint.put(user);
    }
}
