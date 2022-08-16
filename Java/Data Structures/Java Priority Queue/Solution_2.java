import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() > s2.getCgpa()) {
            return -1;
        }
        if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        }
        if (s1.getFname().compareTo(s2.getFname()) < 0) {
            return -1;
        }
        if (s1.getFname().compareTo(s2.getFname()) > 0) {
            return 1;
        }
        if (s1.getToken() < s2.getToken()) {
            return -1;
        }
        if (s1.getToken() > s2.getToken()) {
            return 1;
        }
        return 0;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> pq = new PriorityQueue(totalEvents, new StudentComparator());
            while(totalEvents>0){
            String event = in.next();
            if (event.equals("ENTER")) {
                String fname = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();
                Student s = new Student(id, fname, cgpa);
                pq.add(s);
            }
            else {
                pq.poll();
            }

            totalEvents--;
        }
        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getFname());
        }
    }
}