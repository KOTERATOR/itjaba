package ru.mirea.it;

public class ClientTest {
    private Client handle = null;

    public static ClientTest startTest(String name, int age, float height, Person.Gender gender, String service, float price) {
        ClientTest test = new ClientTest();

        try {
            test.handle = new Client(name, age, height, gender, service, price);
            System.out.println(test.handle.toString());
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return test;
    }

    public Client getHandle() {
        return handle;
    }

    private void testService(String service) {
        try {
            handle.setService(service);
            System.out.printf("Test Service ('%s') - OK\r\n", service);
        }
        catch (Exception e) {
            System.out.printf("Test Service ('%s') - FAILED. Reason: %s\r\n", service, e.toString());
        }
    }

    private void testPrice(float price) {
        try {
            handle.setPrice(price);
            System.out.printf("Test Price ('%f') - OK\r\n", price);
        }
        catch (Exception e) {
            System.out.printf("Test Price ('%f') - FAILED. Reason: %s\r\n", price, e.toString());
        }
    }

    public void runTests() {
        testService("Virtual Server");
        testService("");
        testService(" ");

        testPrice(0);
        testPrice(-25224.5f);
        testPrice(124.9421f);
    }
}
