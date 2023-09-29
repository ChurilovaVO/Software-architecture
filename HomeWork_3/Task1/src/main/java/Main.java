// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Date;
public class Main {
    public static void main(String[] args) {
    Employee vasya = new Employee("Вася", new Date());
    vasya.getEmpInfo();

    Accounting av = new Accounting(vasya,15000);
    System.out.println(av.calculateNetSalary());

    }
}