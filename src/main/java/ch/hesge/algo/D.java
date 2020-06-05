package ch.hesge.algo;

import ch.hesge.algo.model.Company;
import ch.hesge.algo.model.Department;
import ch.hesge.algo.model.Employee;

import java.util.*;

public class D {

    /**
     * Sans utiliser l'API streams mais uniquement l'API de Collection,
     * grouper les Employee par Department.
     *
     * @param companies Set de Company
     * @return Map des Employee par Department
     */
    public Map<Department, Set<Employee>> groupByDepartment(Set<Company> companies) {
        Map<Department, Set<Employee>> employeesByDepartment = new HashMap<>();
        for (Company company : companies) {
            for (Employee employee : company.getEmployees()) {
                Department department = employee.getDepartment();
                Set<Employee> employees = employeesByDepartment.get(department);
                if (employees == null) {
                    employees = new HashSet<>();
                }
                employees.add(employee);
                employeesByDepartment.put(department, employees);
            }
        }
        return employeesByDepartment;
    }
}
