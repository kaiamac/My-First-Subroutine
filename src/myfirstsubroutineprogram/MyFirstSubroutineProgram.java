/*
 * Kaia Mac
 * My First Subroutine Program
 * November 8, 2018
 */

package myfirstsubroutineprogram;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class MyFirstSubroutineProgram {

    public static void aveOfNums(int num1, int num2,int num3,int total) {
        total = num1 + num2 + num3;
        total = total/3;
        System.out.println("the average of the numbers is: " + total);
        System.out.println("    ");
    }
    
    public static void hypotOfTri(int num3,int num1,int num2){
        num1 = num1 * num1;
        num2 = num2 * num2;
        num3 = num1 + num2;
        System.out.println("The length of the hypotenuse is: " + Math.sqrt(num3));
        System.out.println("    ");
    }
    
    public static void sumOfNums(int num1,int num2,int num3,int total){
        total = num1 + num2 + num3;
        System.out.println("The sum of all numbers is: " + total);
        System.out.println("    ");
    }
    
    public static void volOfPrism (int num1, int num2, int num3, int total){
        total = num1 * num2;
        total = total * num3;
        System.out.println("The volume of the prism is: " + total);
        System.out.println("    ");
    }
    
    public static void sqrtOfNum (int num1, int total){
        System.out.println("The sqaure root of the number is: " + Math.sqrt(num1));
        System.out.println("    ");
    }
    
    
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        
        int choice;
        int num1;
        int num2;
        int num3;
        int total;
        int hypotenuse;
         while (true)
        {    
            System.out.println("---My First Subroutine Program---");
            System.out.println("    ");
        
            System.out.println("Please enter your choice:");
            System.out.println("1… Find the average of five numbers");
            System.out.println("2… Find the hypotenuse of a right angle triangle");
            System.out.println("3… Find the sum of five numbers");
            System.out.println("4… Find the volume of a rectangular prism");
            System.out.println("5… Find the square root of a number");
            System.out.println("6… Exit");
            System.out.println("Please enter your choice:");
        
            choice = keyedInput.nextInt();
        
            System.out.println("    ");
            System.out.println("----------------------------------------");        
        
            
        if (choice==1)
        {   System.out.println("You have chosen to find the average of five numbers:");
            System.out.println("    ");
            
            System.out.println("Please input the first number:");
            num1 = keyedInput.nextInt();
            System.out.println("    ");
            
            System.out.println("Please input the second number:");
            num2 = keyedInput.nextInt();
            System.out.println("    ");
            
            System.out.println("Please input the third number:");
            num3 = keyedInput.nextInt();
            
            total = 0;
                    
            aveOfNums(num1, num2, num3, total);
        }    
        
        
        if (choice==2)
        {   System.out.println("You have chosen to find the hypotenuse of a right angle triangle:");
            System.out.println("    ");
            
            System.out.println("Please input the length of one of the sides of the triangle:");
            num1 = keyedInput.nextInt();
            System.out.println("    ");
            
            System.out.println("Please input the length of the other side of the triangle:");
            num2 = keyedInput.nextInt();
            System.out.println("    ");
            
            hypotenuse = 0;
            hypotOfTri( num1, num2, hypotenuse);
        }    
        
        
        if (choice==3)
        {   System.out.println("You have chosen to find the sum of five numbers:");
            System.out.println("    ");
            
            System.out.println("Please input the first number:");
            num1 = keyedInput.nextInt();
            System.out.println("    ");
            
            System.out.println("Please input the second number:");
            num2 = keyedInput.nextInt();
            System.out.println("    ");
            
            System.out.println("Please input the third number:");
            num3 = keyedInput.nextInt();
            System.out.println("    ");
            
            total = 0;
            sumOfNums(num1, num2, num3,total);
        }
        
        
        if (choice==4)
        {   System.out.println("You have chosen to find the volume of a rectangular prism:");
            System.out.println("    ");
            
            System.out.println("Please input the first number:");
            num1 = keyedInput.nextInt();
            System.out.println("    ");
            
            System.out.println("Please input the second number:");
            num2 = keyedInput.nextInt();
            System.out.println("    ");
            
            System.out.println("Please input the third number:");
            num3 = keyedInput.nextInt();
            System.out.println("    ");
            
            total = 0;
            volOfPrism(num1, num2, num3, total);
        }
        
        if (choice==5)
        {   System.out.println("You have chosen to find the square root of a number:");
            System.out.println("    ");
            
            System.out.println("Please input the first number:");
            num1 = keyedInput.nextInt();
            System.out.println("    ");
            
            total = 0;
            sqrtOfNum(num1, total);
        }
        
        
        if (choice==6)
        {   System.out.println("You have chosen to exit:");
            System.out.println("    ");
            
            System.out.println("Goodbye!");  
            break;
        }
        }
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
