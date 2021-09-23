package ru.mirea.it;

public abstract class Person implements IHuman {
    public enum Gender {
        MALE,
        FEMALE
    }

    public static final float MAX_HEIGHT = 3.2f;
    public static final int MAX_AGE = 200;

    private String name;
    private int age;
    private float height;
    private Gender gender;

    public Person(String name, int age, float height, Gender gender) throws PersonException {
        setName(name);
        setAge(age);
        setHeight(height);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws PersonException {
        if (name.isBlank())
            throw new PersonException("Name shouldn't be blank", "name", name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonException {
        if (age < 0 || age > MAX_AGE)
            throw new PersonException(String.format("Age should be in range 0-%d", MAX_AGE), "age", age);
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) throws PersonException {
        if (height < 0 || height > MAX_HEIGHT)
            throw new PersonException(String.format("Height should be in range 0-%f", MAX_HEIGHT), "height", height);
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Human { name = %s, age = %d, height = %f, gender = %s }", name, age, height, gender.toString());
    }


}
