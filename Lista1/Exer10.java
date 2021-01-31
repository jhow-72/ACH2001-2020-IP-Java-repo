/*
    programa que contém um método que recebe como
    parâmetro um número de 3 digítos e retorna seu
    inverso ex: inv(123) = 321
*/
import java.util.*;

class Exer10{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the number thar you want to reverse: ");
        int num = key.nextInt();
       
        if(num>999) System.out.println("Out of bounds: num > 999");
        else if(num<100) System.out.println("Out of bounds: num < 100");
        else System.out.println("The reverse number is: " + inv(num));
    }
    
    public static int inv(int num){
        int detainer = 0;
        while(num != 0){
            detainer *= 10;
            detainer += num%10;
            num /= 10; 
        }
        return detainer;
    }
}
