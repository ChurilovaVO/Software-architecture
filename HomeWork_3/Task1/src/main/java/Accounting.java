import java.util.List;

public class Accounting {
    private Employee employee;
    private int baseSalary;

    public Accounting(Employee employee, int baseSalary) {
        this.employee = employee;
        this.baseSalary=baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
