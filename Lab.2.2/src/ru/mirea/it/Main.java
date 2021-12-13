package ru.mirea.it;

public class Main {

    public static void main(String[] args) {
	    MyString str = new MyString("  \tHello World!  ");
        System.out.println(str);

        MyString strTrimmed = str.trim();
        System.out.println(strTrimmed);

        System.out.println("Compare str to strTrimmed - " + str.compareTo(strTrimmed));
        System.out.println("Concat strTrimmed with ' MyString concat' - " + strTrimmed.concat(new MyString(" MyString concat")));

        MyString emptyStr = new MyString();
        System.out.println("emptyStr = " + emptyStr);
        System.out.println("emptyStr.isEmpty() = " + emptyStr.isEmpty());
        MyString notEmptyStr = new MyString(new String("a"));
        System.out.println("notEmptyStr = " + notEmptyStr);
        System.out.println("notEmptyStr.isEmpty() = " + notEmptyStr.isEmpty());

        MyString helloStr = str.substring(3, 8);
        System.out.println("helloStr = " + helloStr);
        System.out.println("helloStr.charAt(4) = " + helloStr.charAt(4));
        System.out.println("helloStr.length() = " + helloStr.length());
    }
}
