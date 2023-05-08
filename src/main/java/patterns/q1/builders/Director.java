package patterns.q1.builders;

import patterns.q1.model.Client;
import patterns.q1.model.FullContact;
import patterns.q1.model.InternetContact;
import patterns.q1.model.PhoneContact;

public interface Director<T> {
    InternetContact build(T content, InternetContactBuilder builder);
    PhoneContact build(T content, PhoneContactBuilder builder);
    FullContact build(T content, FullContactBuilder builder);
}
