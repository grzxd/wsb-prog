public class Person {
    private int PESEL, age;
    private String name, surname, gender;

    public Person(int PESEL, int age, String name, String surname, String gender) {
        this.PESEL = PESEL;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getPESEL() {
        return PESEL;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }
}
