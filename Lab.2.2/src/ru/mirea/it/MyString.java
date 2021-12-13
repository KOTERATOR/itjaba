package ru.mirea.it;

public final class MyString {
    private final char[] str;

    public MyString() {
        str = new char[0];
    }

    public MyString(char[] value) {
        str = new char[value.length];
        System.arraycopy(value, 0, str, 0, value.length);
    }

    public MyString(MyString original) {
        str = new char[original.str.length];
        System.arraycopy(original.str, 0, str, 0, original.str.length);
    }

    public MyString(String original) {
        str = new char[original.length()];
        for (int i = 0; i < original.length(); i++) {
            str[i] = original.charAt(i);
        }
    }

    public boolean isEmpty() {
        return str.length == 0;
    }

    public int length() {
        return str.length;
    }

    public int compareTo(MyString anotherString) {
        int len1 = str.length;
        int len2 = 0;

        if (anotherString != null)
            len2 = anotherString.str.length;

        for (int i = 0; i < Math.min(len1, len2); i++)
        {
            if (str[i] != anotherString.str[i])
                return str[i] - anotherString.str[i];
        }
        return len1 - len2;
    }

    public MyString trim() {
        int startIndex = 0;
        int endIndex = str.length;

        while (startIndex < endIndex && str[startIndex] <= ' ')
            startIndex++;

        while (startIndex < endIndex && str[endIndex-1] <= ' ')
            endIndex--;

        return (startIndex > 0 || endIndex < str.length) ? substring(startIndex, endIndex) : this;
    }

    public MyString substring(int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > str.length || beginIndex > endIndex)
            throw new IndexOutOfBoundsException();

        int length = endIndex - beginIndex;
        char[] newStr = new char[length];
        System.arraycopy(str, beginIndex, newStr, 0, length);
        return new MyString(newStr);
    }

    @Override
    public String toString() {
        return new String(str);
    }

    MyString concat(MyString another) {
        if (another != null) {
            char[] newStr = new char[str.length + another.str.length];
            System.arraycopy(str, 0, newStr, 0, str.length);
            System.arraycopy(another.str, 0, newStr, str.length, another.str.length);
            return new MyString(newStr);
        }
        return this;
    }

    char charAt(int index) {
        if (index < 0 || index >= str.length)
            throw new IndexOutOfBoundsException();
        return str[index];
    }
}
