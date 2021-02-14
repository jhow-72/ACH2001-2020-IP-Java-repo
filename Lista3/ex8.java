/*
    Faça um programa que escreve uma tabela com os 15 primeiros
    inteiros positivos, seus quadrados e cubos. Cada linha deve
    se referir a um inteiro, como no exemplo:
    1 1 1
    2 4 8
    3 9 27
    ...
*/
public class ex8{
    public static void main(String[] args){
        for(int i=1;i<16;i++){   
            System.out.print(i+"\t"+i*i+"\t"+i*i*i);
            System.out.println();
        }
    }
}
