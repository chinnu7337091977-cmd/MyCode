package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n");
        int n=sc.nextInt();
        Student[] students=new Student[n];
        System.out.println("name and marks");
        for(int i=0;i<n;i++){
            String name=sc.next();
            double marks=sc.nextDouble();
            students[i]=new Student(name,marks);
        }
        double total =0;
        for(Student s: students){
            total+=s.marks;
            System.out.println(s.toString());
        }
        System.out.println("Total marks:"+total);
    }
}
