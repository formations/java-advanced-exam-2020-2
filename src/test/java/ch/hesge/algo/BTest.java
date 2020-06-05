package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class BTest {

    private B b;

    @Test
    public void shouldFindOldestEmployee() {
        b = new B();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.FOO);
        companies.add(Sample.BAR);
        companies.add(Sample.BAZ);
        Employee result = b.findOldestEmployee(companies);
        Assertions.assertThat(result).isSameAs(Sample.SARAH);
    }

    @Test
    public void shouldReturnSingleEmployeeIfThereIsOnlyOne() {
        b = new B();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.BAZ);
        Employee result = b.findOldestEmployee(companies);
        Assertions.assertThat(result).isSameAs(Sample.ERIC);
    }
}
