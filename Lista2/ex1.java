// Programa que simplesmente testa o que o código faz
class ex1{
    public static void main(String[] args){
    // Primeiro código
        if(5<5) System.out.println("sim");
        System.out.println(" é a resposta.\n");

    // Segundo código
        int var1 = 3;
        int var2 = 6;
        if ((var1+2)<var2) System.out.println("oba");
        if ((var1+4)<var2) System.out.println("abo");
        if ((var1+4)>var2) System.out.println("aob");
        System.out.println("ola\n");

    // Terceiro código
        int a = 10;
        int b = 20;
        int c;
        if (a<b) c=a;
        else c = b;
        System.out.println(a+" "+b+" "+c);

    // Quarto código
        a = 10;
        b = 20;
        c = (a<b) ? a:b;
        System.out.println(a+" "+b+" "+c); 
   
    // Quinto código
        a = 3;
        b = 4;
        boolean continua = true && ((a+b)<(2*a));
        if(continua) System.out.println("alto");
        else System.out.println("baixo");

    // Sexto código
        a = 5;
        b = 3;
        c = 9;
        int aux;

        if (a>b){
            aux = a;
            a = b;
            b = aux;
        }
        if (b>c){
            aux = b;
            b = c;
            c = aux;
        }
        if (a>b){
            aux = a;
            a = b;
            b = aux;
        }
        System.out.println(c+" "+b+" "+a);
    }
}
