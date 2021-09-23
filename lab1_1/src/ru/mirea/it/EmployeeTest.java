package ru.mirea.it;

public class EmployeeTest {
    private Employee handle = null;

    public static EmployeeTest startTest(String name, int age, float height, Person.Gender gender, String department, Employee.Position position) {
        EmployeeTest test = new EmployeeTest();

        try {
            test.handle = new Employee(name, age, height, gender, department, position);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return test;
    }

    public Employee getHandle() {
        return handle;
    }

    public void testDepartment(String department) {
        try {
            handle.setDepartment(department);
            System.out.printf("Test Department ('%s') - OK\r\n", department);
        }
        catch (Exception e) {
            System.out.printf("Test Department ('%s') - FAILED. Reason: %s\r\n", department, e.toString());
        }
    }

    public void testPosition(Employee.Position position) {
        try {
            handle.setPosition(position);
            System.out.printf("Test Position ('%s') - OK\r\n", position.toString());
        }
        catch (Exception e) {
            System.out.printf("Test Position ('%s') - FAILED. Reason: %s\r\n", position.toString(), e.toString());
        }
    }

    public void runTests() {
        testDepartment("IT Department");
        testDepartment("QA");
        testDepartment("");
        testDepartment(" ");

        testPosition(Employee.Position.Manager);
        testPosition(Employee.Position.TeamLeader);
        testPosition(Employee.Position.SeniorDeveloper);
        testPosition(Employee.Position.JuniorDeveloper);
        testPosition(Employee.Position.MiddleDeveloper);
    }
}
