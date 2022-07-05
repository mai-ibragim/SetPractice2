package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Kate", 18));
        students.add(new Student("Ani", 43));
        students.add(new Student("Kate", 18));
        students.add(new Student("Poul", 9));
        students.add(new Student("Till", 83));
        students.forEach(System.out::println);
    }
}
