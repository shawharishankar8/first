package com.example.first.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s= new Student(10,"hari","cse");
        Student s1= new Student(11,"hari","cse");
        Student s2= new Student(145,"hari","cse");
        Student s3= new Student(656,"hari","cse");
        Student s4= new Student(1,"hari","cse");
        List<Student> students = Arrays.asList(s,s1,s2,s3,s4);
        //s.setName("Hari shankar");
       // System.out.println(s);
       // System.out.println(s.getName());
        //
        students.sort(Comparator.comparing(Student::getRoll).reversed());

       students.forEach(System.out::println);
        System.out.println("======================");
        for (Student student : students) {   //(T t : list<T>/array)
           if(student.roll==145) {
               System.out.println(student);
               break;
           }
        }
        int[] ints ={1,2,3,4,5,6,7,8};
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }



}
