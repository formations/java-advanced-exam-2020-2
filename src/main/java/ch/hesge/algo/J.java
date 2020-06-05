package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;

public class J {

    /**
     * En utilisant uniquement l'API streams,
     * retourner l'employé le plus agé à la date du jour.
     * Pour récupérer la date du jour, utiliser LocalDate.now()
     *
     * @param companies Set de Company
     * @return Employee le plus âgé
     */
    public Employee findOldestEmployee(Set<Company> companies) {
        LocalDate now = LocalDate.now();
        return companies.stream()
                .flatMap(company -> company.getEmployees().stream())
                .max(Comparator.comparing(employee -> employee.getAge(now)))
                .get();
    }
}
