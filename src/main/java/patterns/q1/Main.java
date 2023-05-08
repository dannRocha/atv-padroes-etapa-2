package patterns.q1;

import patterns.q1.builders.ClientDirectorImpl;
import patterns.q1.builders.FullContactBuilder;
import patterns.q1.builders.InternetContactBuilder;
import patterns.q1.builders.PhoneContactBuilder;
import patterns.q1.model.Client;

public class Main {
    public static void main(String[] args) {
        var director = ClientDirectorImpl.aDirector();

        var client = new Client("client-name", "client-address", "client-phone", "client-email");

        var internetContact = director.build(client, new InternetContactBuilder());
        var fullContact = director.build(client, new FullContactBuilder());
        var phoneContact = director.build(client, new PhoneContactBuilder());

        System.out.println(internetContact);
        System.out.println(fullContact);
        System.out.println(phoneContact);
    }
}
