/*
   Calcule o valor a ser pago por um aluno de uma academia de ginástica, sabendo-se que ele terá desconto de 7% se pagar antecipado. O método deve receber como entrada (parâmetro) qual opção pretendida (pagamento normal ou antecipado), o número de horas e o valor da hora, retornando então o cálculo. Codifique a opção como quiser. Uma maneira simples é via um parâmetro inteiro, em que 0 significa pagamento normal e 1 antecipado
*/ 

import java.util.*;
class ex4{
    public static void main(String[] args){
        System.out.println("Welcome...");
        Scanner key = new Scanner(System.in);
        int vh = 50; // hourly value
         
        System.out.println("0 = normal; 1 = antecipated");
        System.out.print("Enter the payment method: ");
        int method = key.nextInt();
        if(method!=0 && method!=1)
            System.out.println("Please, enter an valid payment method: 0 or 1");        
        else{
        System.out.print("Enter the number of hours: ");
        int nh = key.nextInt(); 

        if(nh<0)
            System.out.println("Error: number of hours less than 0");
        else if(method==0)
            System.out.println("The value is: "+normal(vh, nh));
        else if(method==1)
            System.out.println("The value is: "+antecipated(vh, nh));
        }
    }

//method to calculate the normal hourly value 
    public static double normal(int vh, int nh){  
        return (vh*nh);
    }

//method to calculate the antecipated payment
    public static double antecipated(int vh, int nh){
        double discount = 0.93; // value of the discount (7%)
        return (vh*nh*discount);
    }  
}
