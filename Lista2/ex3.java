/*
    Program that prints "fora" if the variable
    "var" is greater than 10 or lesser than 4.
    And, if it is between or equal to those 
    two numbers it will print "dentro"
*/

import java.util.*;
class ex3{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the value of var: ");
        int var = key.nextInt();
        if(var<4 || var>10) 
            System.out.println("fora");
        else 
            System.out.println("dentro");
    }
}
