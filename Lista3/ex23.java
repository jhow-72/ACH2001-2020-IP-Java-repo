/*
Escreva um método que calcule, para um ângulo x (em radianos) 
passado como parâmetro, o seu cosseno, utilizando a fórmula abaixo:

        cos(x) = 1 − x^2/2! + x^4/4! - x^6/6! + ...

Inclua na somatória os primeiros 10 termos da sequência.
*/
import java.util.*;
import java.util.Locale;
import java.text.DecimalFormat;

public class ex23{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        key.useLocale(Locale.ENGLISH);
        
        System.out.println("The value of PI is alredy multiplicated...");
        System.out.println("Ex: to enter 2PI, just type the number 2\nAnother example: to enter PI/3, just type 0.3333333...; and to enter 3PI/2, type 1.5");
        System.out.print("Enter the angle in radians: ");        
        double number = key.nextDouble();
        double angle = Math.PI*number;
        conv(angle);
    }

    public static void conv(double x){
        double cosx;
        double aux = 0;
        
        for(int i=2; i<=20; i+=4)        
            aux -= (Math.pow(x,i)/doFactorial(i));
        
        for(int i=4; i<=20; i+=4)
            aux += (Math.pow(x,i)/doFactorial(i));
        
        cosx = 1+aux;
        System.out.print("The cosine of "+x+" is: ");
        System.out.println(new DecimalFormat("#,##0.00").format(cosx));
    }

    public static double doFactorial(int num){
        double factorial = 1;

        if(num==0) // 0! = 1
            return factorial;
        else if(num<0)
            return -1; // it means error
        else{        
            for(int i=1; i<=num; i++){ // for positive values
                factorial*=i;
                if(num==i)
                    return factorial;
            }
        return -1;
        } 
    }
}
