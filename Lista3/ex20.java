/*
    Diz-se que um número inteiro n é um quadrado perfeito se
    existirem m números ímpares consecutivos a partir do valor 1 
    cuja soma ´e igual a n. Neste caso n = m2. Exemplo:
    16 = 1 + 3 + 5 + 7 (16 é igual à soma dos quatro primeiros
    impares a partir de 1) e 16 = 4² . Logo 16 representa um quadrado perfeito.
    Escreva um método que receba um valor inteiro positivo como parâmetro,
    e verifique se esse valor é um quadrado perfeito ou não,
    retornando true se for e false se não.
*/

import java.util.*;

class ex20{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = key.nextInt(); // if you choose to see all the test, ignore this
/* 
    The for loop is just for the sake of tests
    put "i" on istead of "num" and take of the comments to see all the tests 
*/
      //for(int i=0; i<=225; i++){    
            boolean check = perfectSquare(num);
        
            if(check)
                System.out.println("The number "+num+" is a perfect square");
            else
                System.out.println("The number "+num+" isn't a perfect square");
      //}
    }

    public static boolean perfectSquare(int num){
        int sumOdds = 0;
        for(int i=1; i<num; i+=2){
            sumOdds += i;
            if(sumOdds==num)
                return true;        
        }
        return false;
    }
}
