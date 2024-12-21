package App;

public class Employee {
    private Person person;
    private Department department;

    public Employee(Person person, Department department) {
        this.person = person;
        this.department = department;
    }

    public Person getPerson() {
        return person;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return person.toString() + " | " + department.toString();
    }
}
