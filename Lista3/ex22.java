/*
    metodo que recebe um número inteiro dado pelo usúario,
    passa como parâmetro a um método e retorna o fatorial do número
*/
import java.util.*;

public class ex22{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = key.nextInt();
     
        double answer = doFactorial(num);
        if(answer==-1)
            System.out.println("An error occurred. Probably you've entered a negative number.");
        else
            System.out.println(num+"! is equal to: "+answer);
     
    }

    public static double doFactorial(int num){
        double factorial = 1;

        if(num==0) // 0! = 1
            return factorial;
        else if(num<0)
            return -1; // it means error
        else{        
            for(double i=1; i<=num; i++){ // for positive values
                factorial*=i;
                if(num==i)
                    return factorial;
            }
        return -1;
        } 
    }
}
