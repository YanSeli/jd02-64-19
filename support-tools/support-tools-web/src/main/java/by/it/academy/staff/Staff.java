package by.it.academy.staff;

import java.util.Objects;

public class Staff {
    private Long id;
    private String lastName;
    private Double numCloseMail;

    public Staff(){
    }

    public Staff(Long id, String lastName, Double age) {
        this.id = id;
        this.lastName = lastName;
        this.numCloseMail = numCloseMail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAge() {
        return numCloseMail;
    }

    public void setAge(Double age) {
        this.numCloseMail = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return id.equals(staff.id) &&
                lastName.equals(staff.lastName) &&
                numCloseMail.equals(staff.numCloseMail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, numCloseMail);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", age=" + numCloseMail +
                '}';
    }
}
