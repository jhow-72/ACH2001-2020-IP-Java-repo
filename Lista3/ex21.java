/*
Escreva um método que gere, para um valor n ≥ 0, passado como parâmetro,
um quadrado de n linhas e n colunas que tenha caracteres : nas posições
da diagonal principal, e os caracteres + nas demais posições. Por exemplo,
para n = 5 o programa deve gerar:
                        :++++
                        +:+++
                        ++:++
                        +++:+
                        ++++:

*/
import java.util.*;

public class ex21{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.println("(They must be equal)");
        System.out.print("Enter the number of columns and lines: ");
        int number = key.nextInt();
    
        squareGenerator(number);
    }

    public static void squareGenerator(int n){
        for(int line=0; line<n; line++){
            for(int column=0; column<n; column++){
                if(column==line)
                    System.out.print(":");
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}
