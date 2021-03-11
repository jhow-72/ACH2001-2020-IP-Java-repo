/*
    Escreva um método que, para um dado valor
    inteiro positivo, passado como parâmetro, 
    verifica se tal valor é uma potência de 2. 
    Em caso afirmativo, retorna o valor da potência.
    Caso contrário, retorna -1.
*/
import java.util.*;

class ex24{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a test number: ");
        int number = key.nextInt();

        int result = test(number);
        
        if(result==-1)
            System.out.println("The value isn't a power of 2.");
        else
            System.out.println("The number "+number+" is a power of 2, and its value is: "+result);
    }

    public static int test(int n){
        int counter = 1;
        while(n>0){
            if(n==2)
                return counter;
        
            counter++;            

            if(n%2 != 0)
                return -1;
            else
                n /= 2;            
        }   
        return -1;
    }
}
