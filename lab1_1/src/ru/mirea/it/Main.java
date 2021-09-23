package ru.mirea.it;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter height: ");
            float height = scanner.nextFloat();

            System.out.print("Enter gender (1 - MALE, 2 - FEMALE): ");
            Person.Gender gender = Person.Gender.values()[scanner.nextInt()-1];

            System.out.print("Enter type (1 - Client, 2 - Employee, 0 - exit): ");
            int type = scanner.nextInt();
            if (type == 1) {
                System.out.print("Enter service: ");
                String service = scanner.next();
                System.out.print("Enter price: ");
                float price = scanner.nextFloat();

                ClientTest clientTest = ClientTest.startTest(name, age, height, gender, service, price);
                clientTest.runTests();

                System.out.println(clientTest.getHandle().think());
            }
            else if (type == 2) {
                System.out.print("Enter department: ");
                String department = scanner.next();

                Employee.Position[] positions = Employee.Position.values();
                StringBuilder positionsText = new StringBuilder();
                for (int i = 0; i < positions.length; i++) {
                    positionsText.append(String.format("%d - %s", i+1, positions[i].toString()));
                    if (i != positions.length-1) {
                        positionsText.append(", ");
                    }
                }
                System.out.printf("Enter position (%s): ", positionsText);
                Employee.Position position = positions[scanner.nextInt()-1];

                EmployeeTest employeeTest = EmployeeTest.startTest(name, age, height, gender, department, position);
                employeeTest.runTests();

                System.out.println(employeeTest.getHandle().think());
            } else {
                break;
            }
        }
    }
}
