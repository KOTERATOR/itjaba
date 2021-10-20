package ru.mirea.it;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        switch (gender) {
            case 'M':
                this.gender = 'M';
                break;
            case 'F':
                this.gender = 'F';
                break;
            case 'U':
            default:
                this.gender = 'U';
                break;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        String genderStr = "";

        switch (gender) {
            case 'M':
                genderStr = "m";
                break;
            case 'F':
                genderStr = "ms";
                break;
            case 'U':
            default:
                genderStr = "unknown";
                break;
        }

        return String.format("%s (%s) at %s", name, genderStr, email);
    }
}
