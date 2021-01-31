/*
    programa que calcula o valor da multa aplicada a
    um jogador de futebol após receber um cartão,
    sendo que: o valor de um cartão amarelo é R$1.000,20
    e um vermelho é de R$4.523,75
*/
import java.util.*;

class Exer9{

    static final double YELLOW = 1000.20;
    static final double RED = 4523.75;

    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.print("Enter the team number: ");
        int team = key.nextInt();

        System.out.print("Enter the player's number: ");
        int playerNumber = key.nextInt();
        
        System.out.print("Enter the player's number of yellow cards: ");
        int yellowCards = key.nextInt();

        System.out.print("Enter the player's number of red cards: ");
        int redCards = key.nextInt();

        double value = (yellowCards*YELLOW) + (redCards*RED);
        System.out.println("The value of the fine is: " + value);
    }
}
