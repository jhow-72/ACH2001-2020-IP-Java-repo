/*
Escreva um m´etodo que, dados dois inteiros
(recebidos em seus parˆametros), verifica se
o segundo ´e divisor do primeiro, retornando 
true se for e false se n˜ao
*/
import java.util.*;

class ex11{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = key.nextInt();

        System.out.print("Enter the second number: ");        
        int b = key.nextInt();

        if(check(a, b))
            System.out.println(b+" is a divisor of "+a);
        else
            System.out.println(b+" isn't a divisor of "+a);   
    }

    public static boolean check(int a, int b){
        if(a%b==0)
            return (true);
        else
            return (false);
    }
}
