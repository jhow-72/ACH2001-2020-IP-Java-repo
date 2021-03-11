/*
    metodo que cria uma tabuada NxN com o n sendo passado
    por parâmetro pelo usúario
*/
import java.util.*;

class ex25{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = key.nextInt();        
    
        MultiplicationTable(n);
    }

    public static void MultiplicationTable(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
