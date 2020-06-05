package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Department;
import ch.hesge.algo.model.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DTest {

    private D d;

    @Test
    public void shouldGroupByDepartment() {
        d = new D();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.FOO);
        companies.add(Sample.BAR);
        companies.add(Sample.BAZ);
        Map<Department, Set<Employee>> result = d.groupByDepartment(companies);
        Assertions.assertThat(result.get(Department.ENGINEERING))
                .containsExactlyInAnyOrder(Sample.SARAH, Sample.JOHN);
        Assertions.assertThat(result.get(Department.SALES))
                .containsExactlyInAnyOrder(Sample.JOHN2, Sample.ERIC);
        Assertions.assertThat(result.get(Department.MARKETING))
                .containsExactlyInAnyOrder(Sample.JANE);
    }
}