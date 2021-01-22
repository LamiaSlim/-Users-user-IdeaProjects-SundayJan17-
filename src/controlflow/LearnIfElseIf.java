package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {
    public static void main(String[] args) {
 CreateMethod();

    }
    public static void CreateMethod(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your age");
        int age = obj.nextInt();
        if (age<=34 && age<=40){
            System.out.println("your age is less than 35");
        }
        else if (age >=60 && age<=50){
            System.out.println("your age is more than 45");
        }
        else if(age==39 && age<=60){
            System.out.println("your ahe is more than 40");
        }
        else if (age >= 60 && age <=70) {
            System.out.println("your age is true");
        }//al conditions are false
        else{
            System.out.println("it's your happyness");
        }

    }
}
