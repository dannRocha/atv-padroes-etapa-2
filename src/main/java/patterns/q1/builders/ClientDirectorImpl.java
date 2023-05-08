package patterns.q1.builders;

import patterns.q1.model.Client;
import patterns.q1.model.FullContact;
import patterns.q1.model.InternetContact;
import patterns.q1.model.PhoneContact;

public class ClientDirectorImpl implements Director<Client>{

    public static ClientDirectorImpl aDirector() {
        return new ClientDirectorImpl();
    }

    public InternetContact build(Client client, InternetContactBuilder builder) {
        builder.setName(client.getName());
        builder.setEmail(client.getEmail());
        return builder.build();
    }

    public PhoneContact build(Client client, PhoneContactBuilder builder) {
        builder.setName(client.getName());
        builder.setPhone(client.getPhone());

        return builder.build();
    }

    public FullContact build(Client client, FullContactBuilder builder) {
        builder.setName(client.getName());
        builder.setAddress(client.getAddress());
        builder.setPhone(client.getPhone());
        builder.setEmail(client.getEmail());

        return builder.build();
    }


}
