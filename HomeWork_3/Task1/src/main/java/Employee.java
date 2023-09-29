import java.util.Date;
//1) Переписать код в соответствии с Single Responsibility Principle:
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс
public class Employee {

    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {

        return "name - " + name + " , dob - " + dob.toString();
    }

}
