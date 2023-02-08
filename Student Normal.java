import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
class Student {
    private String name;
    private String rollNo;
    private String branch;
    private int year;
    private List<Integer> marks;
    private static int noOfStudents;
    
    public Student(String n, String rollNo, String branch, int year){
        this.name = n;
        this.rollNo = rollNo;
        this.branch = branch;
        this.year = year;
        marks = new ArrayList<>();
        noOfStudents++;
    }
    
    
    public String getRollNo(){
        return rollNo; 
    }
    
    public void setMarks(int obtainedMark){
        marks.add(obtainedMark);
    }
    public void display(){
        System.out.println(rollNo+" "+name+" "+branch+" "+year);
    }
    public double computePercentage(){
        double sum = 0;
        for(Integer mark:marks){
            sum = sum + mark;
        }
        if(marks.size()==0)
            return 0;
        return sum/marks.size();
    }
    public static void displayNoStuds(){
        System.out.println("NoOfStudents="+noOfStudents);
    }
    
}
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            String [] line = in.nextLine().split(" ");
            Student s = new Student(line[0],line[1],line[2],Integer.parseInt(line[3]));
            students.add(s);
            String [] nums = in.nextLine().split(" ");
            for(int j = 0;j<nums.length;j++){
                s.setMarks(Integer.parseInt(nums[j]));
            }
        }
        for(int i=0;i<n;i++){
            students.get(i).display();
            Student s = students.get(i);
            System.out.print(s.getRollNo()+" ");
            System.out.printf("%.2f",s.computePercentage());
            System.out.println();
        
        }     
        Student.displayNoStuds();
        
    }
}
