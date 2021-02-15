/*
    printa um quadrado de "*" com 5 linhas e 10 colunas
*/
public class ex13{
    public static void main(String[] args){
        squareMaker();

    }

    public static void squareMaker(){
        for(int line=0; line<5; line++){
            for(int column=0; column<10; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}   

