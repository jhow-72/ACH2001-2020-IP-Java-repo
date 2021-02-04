/*
   Numa loja de eletrodom´esticos, as compras tˆem um pre¸co `a vista, ou acr´escimo de 10% para pagamentos em 2 vezes, ou ent˜ao de 20% para pagamentos em 3 vezes. Escreva um m´etodo que receba como parˆametros o valor da compra `a vista e a op¸c˜ao de compra, retornando ent˜ao o valor final a ser pago. Codifique a op¸c˜ao como quiser.
*/
import java.util.*;
class ex5{
    public static void main(String[] args){
        System.out.println("Welcome...");
        
        Scanner key = new Scanner(System.in);
        System.out.println("1 = in cash, 2 = 2x, 3 = 3x");
        System.out.print("Enter the payment method: ");
        int method = key.nextInt();
        System.out.print("Enter the value of the product: ");
        double value = key.nextDouble();
        
        if(method!=1 && method!=2 && method!=3)
            System.out.println("Please enter a valid method: 1, 2 or 3");
        else if(value<0)
            System.out.println("Error: product value less than 0");
        else{
            if(method==1)
                System.out.println("The payment will be of: "+value);
            else if(method==2)
                System.out.println("The payment will be of: "+installments(method,value));
            else if(method==3)
                System.out.println("The payment will be of: "+installments(method,value));         
        }        
    }

    public static double installments(int m, double v){
        double addition;
        if(m==2)
            addition = 1.1; // addition of 10%
        else
            addition = 1.2; // addition of 20%

        return (v*addition);
    }
}


