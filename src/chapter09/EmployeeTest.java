package chapter09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class EmployeeTest {

    @Test
    public void createTest(){

        Employee emp = new Employee();
        Employee engineer = emp.create(0);
        Employee salesman = emp.create(1);
        Employee manager = emp.create(2);

        assertTrue(engineer instanceof ENGINEER);
        assertTrue(salesman instanceof SALESMAN);
        assertTrue(manager instanceof MANAGER);

    }

}