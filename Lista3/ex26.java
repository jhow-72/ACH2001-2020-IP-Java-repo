/*
    programa que cria um triangulo de floyd até 
    um número "n" passado por parametro
*/
import java.util.*;

class ex26{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);        

        System.out.print("Enter a number: ");
        int num = key.nextInt();

        floydTriangle(num);
    }

    public static void floydTriangle(int end){
        int beg = 1;
        
        for(int line=1; ;line++){
            for(int column=1; column<=line; column++){
                if(beg<10)
                    System.out.print("    "+beg+" ");
                else if(beg<100 && beg>=10)
                    System.out.print("   "+beg+" ");
                else if(beg<1000 && beg>=100)
                    System.out.print("  "+beg+" ");
                else if(beg<10000 && beg>=1000)
                    System.out.print(" "+beg+" ");
                else
                    System.out.print(beg+" ");        
                beg++;
                if(beg>end)
                    break;
            }
            System.out.println();
            if(beg>end)
                break;
        }
    }
}



