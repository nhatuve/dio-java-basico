public class Utilizador {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada?   " + smartTv.ligada);
        System.out.println("Canal Actual?     " + smartTv.canal );
        System.out.println("Volume Actual?    " + smartTv.volume );

        smartTv.mudarCanal(54);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.ligar();
        
        System.out.println("Novo Canal Actual?     " + smartTv.canal );
        System.out.println("Novo estado: Tv está ligada?   " + smartTv.ligada);
        System.out.println("Novo Volume Actual?    " + smartTv.volume );
    }
}
