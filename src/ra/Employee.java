package ra;
import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên nhân viên: ");
        employeeName = sc.nextLine();
        System.out.println("Mời bạn nhập vào tuổi nhân viên: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập vào giới tính nhân viên: ");
        gen = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Mời bạn nhập vào hệ số lương của nhân viên: ");
        rate = Double.parseDouble(sc.nextLine());
    }

    public void calSalary() {
        salary = rate * 1.3 * 1000000;
    }

    public void displayData() {
        System.out.printf("%-10d %-20s %-5d %-5b %-10.2f %-10.2f\n", employeeId, employeeName, age, gen, rate, salary);
    }
}
