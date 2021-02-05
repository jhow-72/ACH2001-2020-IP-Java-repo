/*
Escreva um método que receba como parâmetro a velocidade do vento aferida durante
uma tempestade e retorne a classificação do furacão (de 0 a 5, onde 0 é uma tempestade
tropical). Caso a tempestade não possa ser classificada como tal, o método deve retornar -1
Categoria       Velocidade dos ventos (km/h)
    0                   62 a 118
    1                  119 a 153
    2                  154 a 177
    3                  178 a 209 
    4                  210 a 249
    5                  249 a 320
*/
import java.util.*;
import java.util.Locale;

class ex10{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        key.useLocale(Locale.ENGLISH);

        System.out.print("Enter the wind's speed in Km/h: ");
        double vel = key.nextDouble();

        String[] rank ={"\"tempestade tropical\"","1","2","3","4","5"};
        try{
            System.out.println("The classification is: category "+rank[classify(vel)]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nplease, enter a speed between 62 and 320...");
            System.out.println("Otherwise, it can't be classified as a cyclone neither a hurricane.");
        }
    }

    public static int classify(double vel){
        if(vel>61 && vel<119)
            return 0;
        else if(vel>118 && vel<154)
            return 1;
        else if(vel>153 && vel<178)
            return 2;
        else if(vel>177 && vel<210)
            return 3;
        else if(vel>209 && vel<250)
            return 4;
        else if(vel>249 && vel<321)
            return 5;
        else 
            return -1;

    }
}
