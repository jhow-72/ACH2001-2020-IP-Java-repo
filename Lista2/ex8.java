/*
    Escreva um m´etodo que determina a data cronologicamente
    maior de duas datas fornecidas como parˆametro. Cada data
    deve ser fornecida por trˆes valores inteiros onde oprimeiro
    representa um dia, o segundo um mˆes e o terceiro um ano.
*/
import java.util.*;
public class ex8{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the first day: ");
        int d1 = key.nextInt();
        System.out.print("Enter the first month: ");
        int m1 = key.nextInt();
        System.out.print("Enter the first year: ");
        int y1 = key.nextInt();

        System.out.print("Enter the second day: ");
        int d2 = key.nextInt();
        System.out.print("Enter the second month: ");
        int m2 = key.nextInt();
        System.out.print("Enter the second year: ");
        int y2 = key.nextInt();

        System.out.println("\nThe first date is: "+d1+"/"+m1+"/"+y1);
        System.out.println("The second date is: "+d2+"/"+m2+"/"+y2+"\n");
    
        int greater = compareDates(d1,m1,y1,d2,m2,y2);
        if(greater==1)
            System.out.println("The first date is chronologically greater.");
        else if (greater==2)
            System.out.println("The second date is chronologically greater.");
        else
            System.out.println("The dates are the same.");
    }
    public static int compareDates(int d1, int m1, int y1, int d2, int m2, int y2){
        if(y1==y2 && m1==m2 && d1==d2)
            return (0);        

        if(y1==y2 && m1==m2){
            if(d1>d2)
                return (1);
            else
                return (2);
        }
         if(y1==y2){
            if(m1>m2){
                return (1);
            }
            else
                return (2);
        }
        if(y1>y2){
            return (1);
        }
        else
            return (2);
    }
}
