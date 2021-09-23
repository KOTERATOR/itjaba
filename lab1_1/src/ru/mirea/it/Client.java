package ru.mirea.it;

public class Client extends Person {
    private String service;
    private float price;

    public Client(String name, int age, float height, Gender gender, String service, float price) throws PersonException {
        super(name, age, height, gender);
        setService(service);
        setPrice(price);
    }

    public String getService() {
        return service;
    }

    public void setService(String service) throws PersonException {
        if (service.isBlank())
            throw new PersonException("Service string is blank", "service", service);
        this.service = service;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws PersonException {
        if (price < 0.0f)
            throw new PersonException("Price must be more than 0", "price", price);
        this.price = price;
    }

    @Override
    public String think() {
        return "Я - экземпляр класса Client";
    }
}
