/*
    Escreva um método que receba como parâmetro dois 
    núumeros inteiros positivos n e m e imprima a tabuada
    com n linhas e m colunas, ou seja, n linhas da forma:
    i 2i 3i . . . m*i
*/

import java.util.*;

public class ex19{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int line = key.nextInt();

        System.out.print("Enter the number of columns: ");
        int column = key.nextInt();

        multipicationTable(line, column);
    }

    public static void multipicationTable(int l, int c){
        for(int j=1; j<=l; j++){
            for(int i=1; i<=c; i++){
                System.out.print((j*i)+"\t");
            }
            System.out.println();
        }
    }
}
