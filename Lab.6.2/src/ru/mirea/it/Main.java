package ru.mirea.it;

public class Main {

    public static void main(String[] args) {
	    MyArrayList<Integer> l = new MyArrayList<>(1);

        l.add(5);
        l.add(10);
        l.add(15);
        l.remove(1);
        l.add(11, 2);
        System.out.println("Element at 2 = " + l.get(2));
        System.out.println(l);
        System.out.println("Size = " + l.size());
        System.out.println("Empty - " + l.isEmpty());
        l.clear();
        System.out.println("Empty - " + l.isEmpty());
        System.out.println(l);
        l.shrink();
        l.add(55);
        System.out.println(l);

        for (int i = 0; i < 25; i++) {
            l.add(i+1, 0);
        }
        System.out.println(l);
        l.remove(l.size()-1);
        l.remove(l.size()/2);
        l.remove(0);
        System.out.println(l);
    }
}
