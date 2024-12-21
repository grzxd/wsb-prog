package App;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Util {
    static Company initData() {
        Person guy1 = new Person("Guy", "Guy");
        Employee emp1 = new Employee(guy1, Department.FINANCE);

        Person guy2 = new Person("Man", "Man");
        Employee emp2 = new Employee(guy2, Department.IT);

        Person guy3 = new Person("Linda", "Merge");
        Employee emp3 = new Employee(guy3, Department.LEGAL);

        Company company = new Company("IT Works", "Marszałkowska 3/5, Warszawa");
        company.getEmployees().add(emp1);
        company.getEmployees().add(emp2);
        company.getEmployees().add(emp3);
        return company;
    }

    static void operations() {
        System.out.println("1. Wyświetl listę pracowników");
        System.out.println("2. Dodaj pracownika");
        System.out.println("3. Zwolnij pracownika");
        System.out.println("4. Aktualizuj dane pracownika");
        System.out.println("5. Wyjdź");
    }

    static int input() {
        try {
            Scanner scanner = new Scanner(System.in);
            int wtd = scanner.nextInt();
            return wtd;
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny typ danych!");
            return input();
        }
    }
    static Department inputDepartment() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lista działów:");
            System.out.println(Arrays.toString(Department.values()));
            Department newDepartment = Department.valueOf(scanner.next());
            return newDepartment;
        } catch (IllegalArgumentException e) {
            System.out.println("Nie ma takiego działu!");
            return inputDepartment();
        }
    }
    static void listEmployees(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i+1 + ". " + employees.get(i));
        }
    }
}
