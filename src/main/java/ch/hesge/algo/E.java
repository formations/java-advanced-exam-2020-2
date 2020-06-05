package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Department;
import ch.hesge.algo.model.Employee;

import java.util.*;

public class E {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner une Company fusionnée dont le nom est la concaténation du nom de toutes les Company séparés par " & "
     * et dont les Employee consistent en l'union des Employee de toutes les Company.
     * Chaque employé doit garder le même firstName, lastName, birthdate et department ! Seul la company change !
     *
     * Par exemple :
     *
     * Soit la Company "Foo" qui a pour Employee Alice et Bob
     * Soit la Company "Bar" qui a pour Employee Charles
     *
     * La Company retournée doit avoir :
     *
     * Pour nom "Foo & Bar"
     * Pour Employee Alice, Bob et Charles
     *
     * @param companies Company
     * @return Company fusionnée
     */
    public Company merge(List<Company> companies) {
        StringBuilder builder = new StringBuilder();
        Map<Employee, Department> employees = new HashMap<>();
        for (Company company : companies) {
            builder.append(company.getName());
            builder.append(" & ");
            for (Employee employee : company.getEmployees()) {
                employees.put(employee, employee.getDepartment());
                company.fire(employee);
            }
        }
        String compoundName = builder.toString();
        if (compoundName.endsWith(" & ")) {
            compoundName.substring(0, compoundName.length() - 3);
        }
        Company company = new Company(compoundName);
        for (Map.Entry<Employee, Department> entry : employees.entrySet()) {
            company.hire(entry.getKey(), entry.getValue());
        }
        return company;
    }
}
