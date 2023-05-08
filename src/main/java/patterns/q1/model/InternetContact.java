package patterns.q1.model;

public class InternetContact {
    private final String name;
    private final String email;

    public InternetContact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "InternetContact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
