/*
    Printa um quadrado de "*" com n linhas e m colunas
    passados por parâmetro pelo usuário
*/
import java.util.*;

public class ex14{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int l = key.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = key.nextInt();

        squareMaker(l, c);
    }

    public static void squareMaker(int l, int c){
        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
