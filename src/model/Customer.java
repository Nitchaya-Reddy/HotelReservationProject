package model;
import java.util.Objects;
public class Customer {
    private final String email;
    private final String firstName;
    private final String lastName;

    public Customer(String email, String firstName, String lastName) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format!");
        }
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getEmail() { return email; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return email.equals(customer.email);
    }
    @Override
    public int hashCode() { return Objects.hash(email); }
    @Override
    public String toString() { return firstName + " " + lastName + " (" + email + ")"; }
}
