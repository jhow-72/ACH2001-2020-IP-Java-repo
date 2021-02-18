/*
    Recebe um numero do usúario
    passa como parâmetro 
    e verifica se é primo ou não
*/

import java.util.*;

public class ex17{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = key.nextInt();

        check(num);
    }

    public static void check(int n){
        boolean check = true;
        if(n==0 || n==1)
            check = false;
        for(int i=2; i<=(n/2); i++){
            if(n%i==0){
                check = false;
                break;
            }
        }
        if(n==2)
            check = true;

        if(!check)
            System.out.println(n+" Isn't a prime number.");
        else 
            System.out.println(n+" Is a prime number.");
    }
}
