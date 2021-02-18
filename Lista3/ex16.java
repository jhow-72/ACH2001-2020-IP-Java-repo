/*
    recebe um valor inicial e uma taxa de juros e 
    o número de meses dados pelo usuário.
    fornece os valores como parâmetros a um método.
    o método imprime e calcula os dados de uma tabela.
    o objetivo dos calculos é mostrar quanto uma aplicação 
    rende num regime de juros compostos m=c(1+i)^t 
    m = montante final, c = capital inicial, i = taxa, t = tempo.
*/

import java.util.*;
import java.util.Locale;

public class ex16{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        key.useLocale(Locale.ENGLISH);

        System.out.print("Enter the initial capital: ");
        double c = key.nextDouble();

        System.out.print("Enter the interest rate: ");
        double i = key.nextDouble();

        System.out.print("Enter the number of months: ");
        int t = key.nextInt();

        tableGenerator(c, i, t);
    }

    public static void tableGenerator(double cap, double rate, int time){
        System.out.println("\tMonths\t\t\tAccumulated Amount");
        rate = rate/100;
        for(int t=0; t<=time; t++){
            System.out.print("\t  "+t+"\t\t\t  ");
            double m = cap*Math.pow(1+rate,t);
            System.out.printf("%.2f", m);
            System.out.println();
        }
    }
}
