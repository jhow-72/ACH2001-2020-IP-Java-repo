/*
    program that prints "py" pyramids 
    with 4 lines and 7 columns.
    the number of pyramids is given by the user
    Ex: ...*...
        ..***..
        .*****.
        *******
*/
import java.util.*;

public class ex10{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the number of pyramids: ");
        int py = key.nextInt();
        for(int line=0; line<4; line++){
            for(int star=0; star<py; star++){
                for(int column=0; column<7; column++){
                    if(line==3)
                        System.out.print("*");
                    else if(line==2 && (column==1 || column==2 || column==3 || column==4 || column==5))
                        System.out.print("*");
                    else if(line==1 && (column==2 || column==3 || column==4))
                        System.out.print("*");
                    else if(line==0 && column==3)
                        System.out.print("*");
                    else
                        System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
