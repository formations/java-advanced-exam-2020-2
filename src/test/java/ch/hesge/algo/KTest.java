package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Department;
import ch.hesge.algo.model.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class KTest {

    private K k;

    @Test
    public void shouldHireOnlyUnemployedEmployees() {
        k = new K();
        Set<Employee> employees = new HashSet<>();
        Employee john = new Employee("John", "Doe", LocalDate.of(1970, 1, 1));
        Employee eric = new Employee("Eric", "Meyer", LocalDate.of(1950, 1, 1));
        Employee sarah = new Employee("Sarah", "Meyer", LocalDate.of(1940, 1, 1));
        Employee bob = new Employee("Bob", "Doe", LocalDate.of(1930, 1, 1));
        Employee bill = new Employee("Bill", "Doe", LocalDate.of(1920, 1, 1));
        employees.add(bob);
        employees.add(bill);
        Company otherCompany = new Company("Company");
        otherCompany.hire(sarah, Department.ENGINEERING);
        otherCompany.hire(john, Department.ENGINEERING);
        otherCompany.hire(eric, Department.ENGINEERING);
        employees.add(sarah);
        employees.add(john);
        employees.add(eric);
        Company company = new Company("Dummy");
        k.hireUnemployedEmployees(company, employees);
        Assertions.assertThat(company.getEmployees())
                .containsExactlyInAnyOrder(bob, bill);
    }

    @Test
    public void shouldHireNoEmployeeIfAllEmployeesAreAlreadyHired() {
        k = new K();
        Set<Employee> employees = new HashSet<>();
        Company company = new Company("Dummy");
        k.hireUnemployedEmployees(company, employees);
        Assertions.assertThat(company.getEmployees())
                .isEmpty();
    }
}
