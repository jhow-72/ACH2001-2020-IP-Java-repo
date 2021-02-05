/*
No sistema imperial freq¨uentemente s˜ao utilizadas as seguintes medidas lineares:
• 1 p´e = 12 polegadas
• 1 jarda = 3 p´es
• 1 milha = 1.760 jardas
Baseado no fato de que 1 polegada equivale a 25,3995 mil´ımetros no sistema metrico,
escreva um método que converta comprimentos expressos em milhas, jardas, p´es e polegadas em quilometros.
*/
import java.util.*;
import java.util.Locale;

class ex9{
    
    public static double km = 0;
   
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        key.useLocale(Locale.ENGLISH);

        System.out.print("Enter the measure: ");
        double measure = key.nextDouble();

        String[] unit = {"miles","yards","feets","inches"};
        for(int i=0; i<unit.length; i++)
            System.out.println("The measure of "+measure+" from "+unit[i]+" to kylometers is: "+conv(measure, i));
    }

    public static double conv(double measure, int unit){
        if(unit==0)
            return (measure*1.60934);
        else if(unit==1)
            return (measure*0.0009144);
        else if(unit==2)
            return (measure*0.0003048);
        else if(unit==3)
            return (measure*0.0000254);
        else 
            return 0;
    }
}
