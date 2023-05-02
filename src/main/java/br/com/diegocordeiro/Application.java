package br.com.diegocordeiro;

import br.com.diegocordeiro.entrypoint.EntryPoint;
import br.com.diegocordeiro.entrypoint.implementation.AddressEntryPoint;
import br.com.diegocordeiro.entrypoint.implementation.RoleEntryPoint;
import br.com.diegocordeiro.entrypoint.implementation.UserEntryPoint;
import br.com.diegocordeiro.model.*;

import java.util.ArrayList;
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

        EntryPoint<Address> addressEntryPoint1 = new AddressEntryPoint();

        addressEntryPoint1.put(addressOne);
        addressEntryPoint1.put(addressTwo);
        addressEntryPoint1.put(addressThree);

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

        JuridicUser user1 = new JuridicUser("Velocity_T108",
                "Velocity Treinamentos 1",
                "velocity.treinamentos@gmail.com",
                1,
                new ArrayList<>(),
                roleAdministrator,
                "123456789", "12.123.123.1231231");

        PersonalUser user2 = new PersonalUser("Velocity_T108",
                "Velocity Treinamentos 2",
                "velocity.treinamentos@gmail.com",
                1,
                new ArrayList<>(),
                roleAdministrator,
                "123456789", "12312312312");

        User user3 = new User("Velocity_T108",
                "Velocity Treinamentos 3",
                "velocity.treinamentos@gmail.com",
                1,
                List.of(addressOne, addressTwo, addressThree),
                roleAdministrator,
                "123456789");

        EntryPoint<User> userEntryPoint = new UserEntryPoint();
        userEntryPoint.put(user1);
        userEntryPoint.put(user2);
        userEntryPoint.put(user3);

        AddressEntryPoint addressEntryPoint2 = new AddressEntryPoint();
        List<AddressByUser> addressesByUser = addressEntryPoint2.findBy(user3.getId());

        addressesByUser.forEach(System.out::println);
    }
}
