package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class CTest {

    private C c;

    @Test
    public void shouldHireOnlyUnemployedEmployees() {
        c = new C();
        Set<Employee> employees = new HashSet<>();
        employees.add(Sample.BOB);
        employees.add(Sample.JOHN);
        employees.add(Sample.ERIC);
        employees.add(Sample.SARAH);
        employees.add(Sample.BILL);
        Company company = new Company("Dummy");
        c.hireUnemployedEmployees(company, employees);
        Assertions.assertThat(company.getEmployees())
                .containsExactlyInAnyOrder(Sample.BOB, Sample.BILL);
    }

    @Test
    public void shouldHireNoEmployeeIfAllEmployeesAreAlreadyHired() {
        c = new C();
        Set<Employee> employees = new HashSet<>();
        employees.add(Sample.JOHN);
        employees.add(Sample.ERIC);
        employees.add(Sample.SARAH);
        Company company = new Company("Dummy");
        c.hireUnemployedEmployees(company, employees);
        Assertions.assertThat(company.getEmployees())
                .isEmpty();
    }
}
