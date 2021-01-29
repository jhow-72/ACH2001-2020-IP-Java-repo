/*
    programa que, dados os coeficientes de uma equação
    do segundo grau da forma ax²+bx+c, calcula suas 
    raizes e as printa na tela
*/

import java.util.*;
import java.util.Locale;
// O programa realiza apena calculo de raízes reais.
class Exer8{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        key.useLocale(Locale.ENGLISH);

        System.out.print("Enter the value of \"a\": ");
        double a = key.nextDouble(); 
        System.out.print("Enter the value of \"b\": ");       
        double b = key.nextDouble();
        System.out.print("Enter the value of \"c\": ");
        double c = key.nextDouble();
/*
   para achar as raízes, deve-se usar a formula: (-b+-raiz(delta))/2a
   onde delta é: b²-4*a*c
*/
        double delta = deltaValue(a, b, c);    
        if(delta>=0){
            System.out.println("Delta is equal to: "+delta);
            double r1 = firstRoot(a, b, delta);
            double r2 = secondRoot(a, b, delta);
            System.out.println("The first root is: "+r1);
            System.out.println("The second root is: "+r2);
        }
        else 
            System.out.println("Erro: delta lesser than 0");     
    }

    public static double deltaValue(double a, double b, double c){
        double delta = Math.pow(b,2)-(4*a*c);
        return (delta);
    }

    public static double firstRoot(double a, double b, double delta){
        double r1 = (-b+Math.sqrt(delta))/(2*a);
        return (r1);
    }

    public static double secondRoot(double a, double b, double delta){
        double r2 = (-b-Math.sqrt(delta))/(2*a);
        return (r2);
    }
}
