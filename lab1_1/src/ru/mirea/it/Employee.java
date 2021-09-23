package ru.mirea.it;

public class Employee extends Person{
    enum Position {
        TeamLeader,
        JuniorDeveloper,
        MiddleDeveloper,
        SeniorDeveloper,
        Manager
    }

    private String department;
    private Position position;

    public Employee(String name, int age, float height, Gender gender, String department, Position position) throws PersonException {
        super(name, age, height, gender);
        setDepartment(department);
        setPosition(position);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) throws PersonException {
        if (department.isBlank())
            throw new PersonException("Department string is blank", "department", department);
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String think() {
        return "Я - экземпляр класса Employee";
    }
}
