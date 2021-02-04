/*
    Escreva uma m´etodo que converta uma temperatura expressa em graus Celsius em seu valor equivalente em graus Fahrenheit (C = 5/9*(F-32)) ou vice-versa de acordo com a op¸c˜ao de convers˜ao escolhida em um de seus parˆametros
*/
import java.util.*;
public class ex7{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.println("ºC to ºF = 1; ºF to ºC = 0");
        System.out.print("Enter the type of conversion: ");
        int type = key.nextInt();

        if(type==1){
            System.out.print("Enter the temperature in Celsius: ");
            double c = key.nextDouble();
            if(c>=-273.15)
                System.out.println("The temperature in Fahrenheit is: "+conv(type, c));
            else
                System.out.println("Temperature lower than the absolute 0");
        }
        
        else if(type==0){
            System.out.print("Enter the temperature in Fahrenheit: ");
            double f = key.nextDouble();
            if(f>=-459.67)            
                System.out.println("The temperature in Celsius is: "+conv(type, f));
            else
                System.out.println("Temperature lower than the absolute 0");
        }
        else 
            System.out.println("Error: Please, enter a valid type (1 or 0)");
    }

    public static double conv(int type, double temp){
        if(type==1){
            return ((temp*9)/5+32);
        }
        else
            return ((temp-32)*5/9);
    }
}
