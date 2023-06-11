import ra.Employee;
public class EmployeeManager {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Mời bạn nhập thông tin nhân viên thứ " + (i + 1));
            Employee employee = new Employee();
            employee.setEmployeeId(i + 1);
            employee.inputData();
            employees[i] = employee;
        }
        System.out.printf("%-10s %-20s %-5s %-5s %-10s %-10s \n","employeeId","employeeName","age","gen","rate","salary");
        for (int i = 0; i <5; i++) {
            employees[i].calSalary();
            employees[i].displayData();
        }
    }
}