public class Usuario {
    public static void main(String[] args) throws Exception {


        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("A televisão está ligada? " + smartTv.ligada);
        System.out.println("Canal atual da televisão: " + smartTv.canal);
        System.out.println("Volume atual da televisão: " + smartTv.volume);

        smartTv.ligar();
        
        System.out.println("Novo status da televisão --> : A televisão está ligada? " + smartTv.ligada);

        smartTv.desligar();
        
        System.out.println("Novo status da televisão --> : A televisão está ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Volume atual da televisão: " + smartTv.volume);


        smartTv.mudarCanal(13);

        System.out.println("Novo canal da Televisão: " + smartTv.canal);

        
    }
}