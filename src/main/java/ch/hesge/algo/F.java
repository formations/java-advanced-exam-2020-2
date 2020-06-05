package ch.hesge.algo;

import ch.hesge.algo.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class F {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * retourner une List d'Employee dont les éléments sont triés par birthdate ascendante
     * (le plus jeune est le premier élément).
     *
     * @param employees Collection d'Employee
     * @return Liste d'Employee triés par birthdate ascendante
     */
    public List<Employee> sortByBirthdate (Collection<Employee> employees) {
        List<Employee> sorted = new ArrayList<>(employees);
        sorted.sort(Comparator.comparing(Employee::getBirthdate));
        return sorted;
    }
}