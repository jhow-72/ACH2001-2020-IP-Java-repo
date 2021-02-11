/*
    cria uma sequencia de inteiros através de um
    método que recebe o valor inicial, final e a
    razão da sequencia.
*/

import java.util.*;

public class ex7{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the initial number: ");
        int i = key.nextInt();

        System.out.print("Enter the final number: ");
        int f = key.nextInt();

        System.out.print("Enter the ratio: ");
        int r = key.nextInt();

        sequence(i, f, r);        
    }

    public static void sequence(int ini, int fin, int rat){ // initial, final, ratio
        if(ini<fin){
            while(ini<=fin){
                if(ini==fin){
                    System.out.println(ini+".");
                    break;
                }
                else{
                    System.out.print(ini+", ");
                    ini += rat;
                }
            }
        }
        else{
            while(ini>=fin){
                if(ini==fin){
                    System.out.println(ini+".");
                    break;
                }
                else{
                    System.out.print(ini+", ");
                    ini += rat;
                }
            }
        }
        
    }
}
