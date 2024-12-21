package App;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = Util.initData();
        List<Employee> employees = company.getEmployees();
        boolean done = false;

        String title = "Panel administracyjny firmy " + company.getName();
        System.out.println("-".repeat(title.length()));
        System.out.println(title);
        System.out.println("-".repeat(title.length()));

        while (!done) {
            System.out.println();
            System.out.println("Co chcesz dzisiaj zrobić?");
            Util.operations();
            int pickedModule=Util.input();
            System.out.println("--------");
            switch (pickedModule) {
                case 1:
                    listAllEmployees(employees);
                    break;
                case 2:
                    addEmployee(employees);
                    break;
                case 3:
                    removeEmployee(employees);
                    break;
                case 4:
                    updateEmployee(employees);
                    break;
                case 5:
                    done = true;
                    System.out.println("Zamykanie aplikacji...");
                    break;
                default:
                    System.out.println("Podano złą wartość");
                    break;
            }
        }
    }

    public static void listAllEmployees(List<Employee> employees) {
        Util.listEmployees(employees);
        System.out.println("--------");
    }

    public static void addEmployee(List<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię pracownika");
        String newEmpName = scanner.next();
        System.out.println("Podaj nazwisko pracownika");
        String newEmpSurname = scanner.next();
        System.out.println("Podaj dział pracownika");
        employees.add(new Employee(new Person(newEmpName, newEmpSurname), Util.inputDepartment()));
        System.out.println("--------");
    }

    public static void removeEmployee(List<Employee> employees) {
        System.out.println("Wybierz pracownika do zwolnienia");
        Util.listEmployees(employees);
        int deleteEmp = Util.input()-1;
        System.out.println("Czy na pewno chcesz usunąć pracownika: " + employees.get(deleteEmp));
        System.out.println("1. Tak");
        System.out.println("2. Nie");
        if (Util.input() == 1) {
            employees.remove(deleteEmp);
            System.out.println("Pracownik został usunięty");
        } else {
            System.out.println("Operacja przerwana");
        }
        System.out.println("--------");
    }

    public static void updateEmployee(List<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz pracownika do aktualizacji danych");
        Util.listEmployees(employees);
        int updateEmp = Util.input()-1;
        System.out.println("Wybrano pracownika " + employees.get(updateEmp));
        System.out.println("Co chcesz zaktualizować?");
        System.out.println("1. Imię");
        System.out.println("2. Nazwisko");
        System.out.println("3. Dział");
        System.out.println("Inna liczba - anulowanie operacji");
        switch (Util.input()) {
            case 1:
                System.out.println("Podaj nowe imię pracownika");
                employees.get(updateEmp).getPerson().setName(scanner.next());
                break;
            case 2:
                System.out.println("Podaj nowe nazwisko pracownika");
                employees.get(updateEmp).getPerson().setSurname(scanner.next());
                break;
            case 3:
                System.out.println("Podaj nowy dział pracownika");
                employees.get(updateEmp).setDepartment(Util.inputDepartment());
                break;
            default:
                System.out.println("Operacja przerwana");
                break;
        }
        System.out.println("--------");
    }
}
