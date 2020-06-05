package ch.hesge.algo;

import ch.hesge.algo.model.Company;

import java.util.Set;

public class A {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner la Company qui comporte le plus grand nombre d'employés.
     *
     * @param companies Set de Company
     * @return La Company qui comporte le plus grand nombre d'employés
     */
    public Company findCompanyWithHighestNumberOfEmployees(Set<Company> companies) {
        int maxNumberOfEmployees = 0;
        Company company = companies.iterator().next();
        for (Company current : companies) {
            int numberOfEmployees = current.getEmployees().size();
            if (numberOfEmployees > maxNumberOfEmployees) {
                company = current;
                maxNumberOfEmployees = numberOfEmployees;
            }
        }
        return company;
    }
}
