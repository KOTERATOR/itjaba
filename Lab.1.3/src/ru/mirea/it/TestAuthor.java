package ru.mirea.it;

public class TestAuthor {
    public static void test() {
        Author author = new Author("Alex", "alex123@example.com", 'M');
        System.out.println(author);

        author.setEmail("alex456@example.com");
        System.out.println(author);

        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());
    }
}
