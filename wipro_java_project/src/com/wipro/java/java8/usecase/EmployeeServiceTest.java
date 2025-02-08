package com.wipro.java.java8.usecase;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceTest {
    private EmployeeService service;
    private Employee emp1, emp2, emp3;

    @Before
    public void setUp() {
        service = new EmployeeService();
        emp1 = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
        emp2 = new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15));
        emp3 = new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22));

        service.addEmployee(emp1);
        service.addEmployee(emp2);
        service.addEmployee(emp3);
    }

    @Test
    public void testAddEmployee() {
        Employee emp4 = new Employee(4, "David", "Marketing", 55000, LocalDate.of(2022, 1, 5));
        service.addEmployee(emp4);
        Optional<Employee> result = service.searchEmployee(4);
        assertTrue(result.isPresent());
        assertEquals("David", result.get().getName());
    }

    @Test
    public void testRemoveEmployee() {
        service.removeEmployee(1);
        Optional<Employee> result = service.searchEmployee(1);
        assertFalse(result.isPresent());
    }

    @Test
    public void testSearchEmployee() {
        Optional<Employee> result = service.searchEmployee(2);
        assertTrue(result.isPresent());
        assertEquals("Bob", result.get().getName());
    }

    @Test
    public void testUpdateSalary() {
        service.updateSalary(3, 70000);
        Optional<Employee> result = service.searchEmployee(3);
        assertTrue(result.isPresent());
        assertEquals(70000, result.get().getSalary(), 0.01);
    }

    @Test
    public void testFilterByDepartment() {
        List<Employee> itEmployees = service.filterByDepartment("IT");
        assertEquals(1, itEmployees.size());
        assertEquals("Alice", itEmployees.get(0).getName());
    }

    @Test
    public void testSortByName() {
        List<Employee> sortedEmployees = service.sortByName();
        assertEquals("Alice", sortedEmployees.get(0).getName());
        assertEquals("Bob", sortedEmployees.get(1).getName());
        assertEquals("Charlie", sortedEmployees.get(2).getName());
    }

    @Test
    public void testGetAverageSalary() {
        double avgSalary = service.getAverageSalary();
        assertEquals(51666.67, avgSalary, 0.01);
    }
}



