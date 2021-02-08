public class ex1C{
    public static void main(String[] args){
        int dest1 = 15;
        int dest2 = 27;
        int local1 = 20;
        int local2 = 20;
        boolean chegou1 = false;
        boolean chegou2 = false;

        while((!chegou1) && (!chegou2)){
            local1 = local1-1; //se move uma unidade por instante
            local2 = local2+2; //se move 2X mais rápido
            chegou1 = (local1<=dest1);
            chegou2 = (local2>=dest2);
            System.out.println("Os viajantes estão em "+local1+" e "+local2);
        }

        System.out.println("As posições finais dos viajantes são "+local1+" e "+local2);
    }
}
