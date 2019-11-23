package pl.sda.rafal.zientara.game.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainZad3 {

    List<Employee> employee = Arrays.asList(
            new Employee("Kowal", "Jan", 34, 3400.0),
            new Employee("As", "Ala", 27, 4100.0),
            new Employee("Kot", "Zofia", 33, 3700.0),
            new Employee("Puchacz", "Jan", 41, 3600.0)
    );

    List<String> names = employee.stream()
    .filter(emp -> emp.getAge() > 30 && emp.getSalary() <4000)
    .map(emp -> emp.getName() + " " + emp.getSurname())
    .collect(Collectors.toList());

}

