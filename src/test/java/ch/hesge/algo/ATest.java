package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ATest {

    private A a;

    @Test
    public void shouldFindCompanyWithHighestNumberOfEmployees() {
        a = new A();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.FOO);
        companies.add(Sample.BAR);
        companies.add(Sample.BAZ);
        Company result = a.findCompanyWithHighestNumberOfEmployees(companies);
        Assertions.assertThat(result).isSameAs(Sample.FOO);
    }

    @Test
    public void shouldReturnSingleCompanyIfThereIsOnlyOne() {
        a = new A();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.BAZ);
        Company result = a.findCompanyWithHighestNumberOfEmployees(companies);
        Assertions.assertThat(result).isSameAs(Sample.BAZ);
    }
}
