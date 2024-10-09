package CodeAssessment2;

import java.util.Arrays;
import java.util.List;
class ListOfEmployee {
    private String name;

    public ListOfEmployee(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
public class Filter{
    public static void main(String[] args) {
        List<ListOfEmployee> Employees=Arrays.asList(
                new ListOfEmployee("ruban"),
                new ListOfEmployee("raj"),
                new ListOfEmployee("Ajith kumar"),
                new ListOfEmployee("vijay"),
                new ListOfEmployee("Abishek"),
                new ListOfEmployee("rishi"),
                new ListOfEmployee("ram"),
                new ListOfEmployee("Aneesh"),
                new ListOfEmployee("Anbu")
        );
        Employees.stream()
                .filter(ListOfEmployee->ListOfEmployee.getName().startsWith("A"))
                .forEach(ListOfEmployee-> System.out.println(ListOfEmployee.getName()));
    }
}
