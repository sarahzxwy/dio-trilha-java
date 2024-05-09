public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(10);
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
    }
}
