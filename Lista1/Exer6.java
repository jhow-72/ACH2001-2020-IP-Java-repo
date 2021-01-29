/*
    programa que recebe do usuário valor atual "y" do Dólar (U$) 
    e um valor "x" em Real (R$) que será convertido para Dólar
*/
import java.util.*;
import java.util.Locale; 

class Exer6{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        key.useLocale(Locale.ENGLISH);

        System.out.print("Insert the dollar quotation: U$");        
        double dq = key.nextDouble();

        System.out.print("Insert the value to be converted: R$");
        double r = key.nextDouble(); 

        double dv = r/dq; // dv = dolar value post covertion
        System.out.print("The value after the conversion is: U$");
        System.out.printf("%.2f", dv);
        System.out.println();
    }
}
