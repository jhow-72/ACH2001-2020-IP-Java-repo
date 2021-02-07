/*
Escreva um método que, dados três números inteiros,
fornecidos por parâmetro, verifique se podem ser lados
de um triângulo retângulo, retornando true se puderem e false se não
*/
import java.util.*;
class ex12{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        int a = key.nextInt();

        System.out.print("Enter the length of the second side: ");
        int b = key.nextInt();

        System.out.print("Enter the length of the third side: ");
        int c = key.nextInt();

        if(check(a, b, c))
            System.out.println("It can form a triangle.");
        else
            System.out.println("It can't form a triangle.");
    }

    public static boolean check(int a, int b, int c){
        if(a<b+c && b<a+c && c<a+b)
            return true;
        else
            return false;
    }
}
