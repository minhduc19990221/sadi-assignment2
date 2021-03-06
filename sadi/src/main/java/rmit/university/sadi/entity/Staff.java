package rmit.university.sadi.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Staff")
public class Staff {

    private @Id @GeneratedValue Long id;
    private @Column String firstName;
    private @Column String lastName;
    private @Column String role;
    private @Column String phone;
    private @Column String email;
    private @Column String address;


    public Staff() {}

    public Staff(String firstName, String lastName, String role, String phone, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }



    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(id, staff.id) &&
                Objects.equals(firstName, staff.firstName) &&
                Objects.equals(lastName, staff.lastName) &&
                Objects.equals(role, staff.role) &&
                Objects.equals(phone, staff.phone) &&
                Objects.equals(email, staff.email) &&
                Objects.equals(address, staff.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, firstName, lastName, role, phone, email, address);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}