public class usuario {
    public static void main (String[] args){
        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        
        System.out.println("Volume da TV: " + smartTv.volume);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Volume da TV: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("novo status TV ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("novo status da TV desligada? " + smartTv.ligada);
    }
}
