package patterns.q1.builders;

import patterns.q1.model.PhoneContact;

public class PhoneContactBuilder implements Builder<PhoneContact>{
    private String name;
    private String phone;


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public PhoneContact build() {
        return new PhoneContact(name, phone);
    }
}
