/*
    programa que testa se um número n, inteiro, é um palíndromo
    ou seja: seu inverso é igual ao original, como nos exs:
    54345 --> inversão --> 54354; 121 --> inversão --> 121
*/
import java.util.*;

public class ex18{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = key.nextInt();

        boolean check = reverse(num);

        if(check)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number isn't a palindrome.");        
   }

    public static boolean reverse(int number){
        int rev = 0; // keeps the reverse number
        int aux; // assists in obtaining the reverse

        for(aux=number; aux!=0; aux/=10){
            rev = rev*10 + aux%10;
        }

        if(rev==number)
            return true;

        return false;
    }
}
