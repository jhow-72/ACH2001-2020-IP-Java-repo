/*
    Produza três versões de um método que escreva n ≥ 0 asteriscos
    em uma linha, sendo o valor n passado como parâmetro. A primeira
    versão deve utilizar o comando for, a segunda o comando while 
    e a terceira o comando do-while. Compare as três versões
*/
import java.util.*;

public class ex15{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the number of \"*\": ");
        int num = key.nextInt();
        
        usingFor(num);
        System.out.println("\n");

        usingWhile(num);
        System.out.println("\n");

        usingDoWhile(num);
        System.out.println("\n");

    }

    public static void usingFor(int n){
        System.out.print("Using for loop: ");
        for(int i=0; i<n; i++)
            System.out.print("*");
    }
    
    public static void usingWhile(int n){
        System.out.print("Using while loop: ");
        while(n>0){
            System.out.print("*");
            n--;
        }
    }

    public static void usingDoWhile(int n){
        System.out.print("Using do while loop: ");
        do{
            System.out.print("*");
            n--;
        } while(n>0);
    }
}
