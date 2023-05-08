package patterns.q1.builders;

import patterns.q1.model.InternetContact;

public class InternetContactBuilder implements Builder <InternetContact>{

    private String name;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public InternetContact build() {
        return new InternetContact(name, email);
    }
}
