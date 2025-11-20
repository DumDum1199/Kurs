//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Власов Антон Валерьевич", 50000, "Бухгалтерия");
        employee.setSalary(123456);
        System.out.println(employee);
        printShortInfo();


    }

    public static void printShortInfo() {
        System.out.println("Пупупу");
    }

}