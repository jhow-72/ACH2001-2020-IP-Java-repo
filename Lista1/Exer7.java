/*
    Programa que determina o tempo necessário para
    um corpo cair de determinada altura a partir do
    repouso, usando a formula S = So+Vo*t+(a*t²)/2.
    onde "a" é igual a aceleração da gravidade "g" = 9.8,
    t é o tempo necessário para ir de So (posição inicial),
    até S (posição final) e tendo So como referencial,
    portanto, So = 0, a partir de um Vo (valocidade inicial) igual a 0.
    após a manipulação algébrica a formula usada será:
    t=raiz((2*S)/g) 
*/
import java.util.*;
import java.util.Locale;

class Exer7{
    public static void main(String [] args){
        Scanner key = new Scanner(System.in);
        key.useLocale(Locale.ENGLISH);

        double g = 9.8;

        System.out.print("Enter the fall height: ");
        double S = key.nextDouble(); 

        double t = Math.sqrt((2*S)/g);

        System.out.println("The time needed to the object arrive to the ground is: " + t);
    }
}
