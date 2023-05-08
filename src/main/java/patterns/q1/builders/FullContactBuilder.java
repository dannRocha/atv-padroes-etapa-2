package patterns.q1.builders;

import patterns.q1.model.FullContact;

public class FullContactBuilder implements Builder<FullContact>{

    private String name;
    private String phone;
    private String address;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public FullContact build() {
        return new FullContact(name, phone, address, email);
    }


}
