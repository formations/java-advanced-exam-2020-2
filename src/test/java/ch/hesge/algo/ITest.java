package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ITest {

    private I i;

    @Test
    public void shouldFindCompanyWithHighestNumberOfEmployees() {
        i = new I();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.FOO);
        companies.add(Sample.BAR);
        companies.add(Sample.BAZ);
        Company result = i.findCompanyWithHighestNumberOfEmployees(companies);
        Assertions.assertThat(result).isSameAs(Sample.FOO);
    }

    @Test
    public void shouldReturnSingleCompanyIfThereIsOnlyOne() {
        i = new I();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.BAZ);
        Company result = i.findCompanyWithHighestNumberOfEmployees(companies);
        Assertions.assertThat(result).isSameAs(Sample.BAZ);
    }
}
