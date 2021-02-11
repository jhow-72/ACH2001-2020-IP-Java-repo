public class ex6{
    public static void main(String[] args){
        int number = 1;
        String[] ordem = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth"};
        for(int i=0; i<10; i++){
            System.out.println("The "+ordem[i]+" cube is: "+Math.pow(number,3));
            number++;
        }
    }
}
