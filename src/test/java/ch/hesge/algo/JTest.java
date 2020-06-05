package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class JTest {

    private J j;

    @Test
    public void shouldFindCompanyWithHighestNumberOfEmployees() {
        j = new J();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.FOO);
        companies.add(Sample.BAR);
        companies.add(Sample.BAZ);
        Employee result = j.findOldestEmployee(companies);
        Assertions.assertSame(Sample.SARAH, result);
    }

    @Test
    public void shouldReturnSingleCompanyIfThereIsOnlyOne() {
        j = new J();
        Set<Company> companies = new HashSet<>();
        companies.add(Sample.BAZ);
        Employee result = j.findOldestEmployee(companies);
        Assertions.assertSame(Sample.ERIC, result);
    }
}
