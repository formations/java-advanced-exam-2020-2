package ch.hesge.algo;

import ch.hesge.algo.model.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MTest {

    private M m;

    @Test
    public void shouldSortByBirthdate() {
        m = new M();
        List<Employee> employees = new ArrayList<>();
        employees.add(Sample.JANE);
        employees.add(Sample.BOB);
        employees.add(Sample.JOHN);
        employees.add(Sample.ERIC);
        employees.add(Sample.SARAH);
        employees.add(Sample.BILL);
        List<Employee> result = m.sortByBirthdate(employees);
        Assertions.assertThat(result)
                .containsExactlyElementsOf(
                        Arrays.asList(
                                Sample.BILL,
                                Sample.BOB,
                                Sample.SARAH,
                                Sample.ERIC,
                                Sample.JOHN,
                                Sample.JANE
                        )
                );
    }
}