import java.util.Scanner;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    // Boş constructor
    public Employee() {}

    // Parametreli constructor
    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            double ekstra = workHours - 40;
            return ekstra * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - hireYear;

        if (workYear < 10) {
            return salary * 0.05;
        } else if (workYear < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public void showFullReport() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double finalSalary = salary - tax + bonus + raise;

        System.out.println("----- Maaş Raporu -----");
        System.out.println("Ad: " + name);
        System.out.printf("Vergi: %.2f TL\n", tax);
        System.out.printf("Bonus: %.2f TL\n", bonus);
        System.out.printf("Zam: %.2f TL\n", raise);
        System.out.printf("Final Maaş: %.2f TL\n", finalSalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("İsim: ");
        emp.name = scanner.nextLine();
        System.out.print("Maaş: ");
        emp.salary = scanner.nextDouble();
        System.out.print("Haftalık çalışma saati: ");
        emp.workHours = scanner.nextDouble();
        System.out.print("İşe giriş yılı: ");
        emp.hireYear = scanner.nextInt();

        emp.showFullReport();
    }
}
