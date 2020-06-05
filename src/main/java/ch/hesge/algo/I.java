package ch.hesge.algo;

import ch.hesge.algo.model.Company;

import java.util.Comparator;
import java.util.Set;

public class I {

    /**
     * En utilisant l'API streams,
     * retourner la Company qui comporte le plus grand nombre d'employés.
     *
     * @param companies Set de Company
     * @return La Company qui comporte le plus grand nombre d'employés
     */
    public Company findCompanyWithHighestNumberOfEmployees(Set<Company> companies) {
        return companies.stream()
                .max(Comparator.comparing(company -> company.getEmployees().size()))
                .get();
    }
}
