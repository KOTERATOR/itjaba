package ru.mirea.it;

public class PersonException extends Exception {
    private String message, fieldName;
    private Object value;

    public PersonException(String message, String fieldName, Object value) {
        this.message = message;
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("PersonException: %s; %s = %s", message, fieldName, value.toString());
    }
}
