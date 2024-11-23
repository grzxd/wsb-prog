public class Student extends Person {
    private int indexNumber;

    public Student(int PESEL, int age, String name, String surname, String gender, int indexNumber) {
        super(PESEL, age, name, surname, gender);
        this.indexNumber = indexNumber;
    }

    public Student(Person person, int indexNumber) {
        super(person.getPESEL(), person.getAge(), person.getName(), person.getName(), person.getGender());
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }
}
