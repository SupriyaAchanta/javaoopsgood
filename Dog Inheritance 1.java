import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Dog{
     String name;
}
class Greyhound extends Dog{
    private String color;
    private int weight;
    Greyhound(String nam, String color,int weight){
        super.name=nam;
        this.color=color;
        this.weight=weight;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public void tostringmethod(){
        System.out.println(name+" is "+color+" in color and his weight is "+weight+"Kg");
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String color = in.nextLine();
        int weight = in.nextInt();
        Greyhound pup = new Greyhound(name, color, weight);
        System.out.println(pup.getName());
        System.out.println(pup.getColor());
        System.out.println(pup.getWeight());
        pup.tostringmethod();
        System.out.println("Superclass:"+pup.getClass().getSuperclass().getName());
        
    }
}
