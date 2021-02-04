/*
    Escreva um método que, dados três valores inteiros diferentes 
    entre si (recebidos como parâmetros), apresente o maior de tais valores
*/
import java.util.*;
public class ex6{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = key.nextInt();
        System.out.print("Enter the value of b: ");
        int b = key.nextInt();
        System.out.print("Enter the value of c: ");
        int c = key.nextInt();

        System.out.print("The greater value is: ");
        if(a>b){
            if(a>c)
                System.out.println(a);
            else
                System.out.println(c);
        }
        else{
            if(b>c)
                System.out.println(b);
            else if (c>b)
                System.out.println(c);        
        }
    }
}
