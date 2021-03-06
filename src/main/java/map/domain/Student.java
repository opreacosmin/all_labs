package map.domain;

import map.domain.Course;
import map.domain.Person;
import java.util.Objects;

import java.util.List;

public class Student extends Person {

    private int totalCredits;


    public Student(long id,String firstName, String lastName, int totalCredits) {
        super(id,firstName,lastName);


        this.totalCredits = totalCredits;

    }




    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }




    @Override
    public String toString() {
        return "Student{" +
                "id=" + ID +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", totalCredits=" + totalCredits +
                  +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return totalCredits == student.totalCredits;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),totalCredits);

    }
}
