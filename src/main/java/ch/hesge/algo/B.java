package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Employee;

import java.time.LocalDate;
import java.util.Set;

public class B {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner l'employé le plus agé à la date du jour.
     * Pour récupérer la date du jour, utiliser LocalDate.now()
     *
     * @param companies Set de Company
     * @return Employee le plus âgé
     */
    public Employee findOldestEmployee(Set<Company> companies) {
        LocalDate now = LocalDate.now();
        Employee employee = null;
        for (Company company : companies) {
            for (Employee current : company.getEmployees()) {
                if (employee == null || current.getAge(now) > employee.getAge(now)) {
                    employee = current;
                }
            }
        }
        return employee;
    }
}
