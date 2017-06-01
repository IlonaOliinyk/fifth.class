package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Petro");

        Student student2 = new Student(student1);
        student2.setName("Oleh");
        PhdStudent phdStudent1 = new PhdStudent(student2);
        System.out.println(student1.getName() + " " + student2.getName() + " " + phdStudent1.getName());




    }
}
