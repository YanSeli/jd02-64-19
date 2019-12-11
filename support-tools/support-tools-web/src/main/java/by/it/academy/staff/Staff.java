package by.it.academy.staff;

import java.util.Objects;

public class Staff {
    private Long id;
    private String lastName;
    private String firstName;
    private String post;
    private String shiftEmployee;

    public Staff() {
    }

    public Staff(Long id, String lastName, String firstName, String post, String shiftEmployee) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.post = post;
        this.shiftEmployee = shiftEmployee;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String isShiftEmployee() {
        return shiftEmployee;
    }

    public void setShiftEmployee(String shiftEmployee) {
        this.shiftEmployee = shiftEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return shiftEmployee == staff.shiftEmployee &&
                id.equals(staff.id) &&
                lastName.equals(staff.lastName) &&
                firstName.equals(staff.firstName) &&
                post.equals(staff.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, post, shiftEmployee);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", post='" + post + '\'' +
                ", shiftEmployee=" + shiftEmployee +
                '}';
    }

}

