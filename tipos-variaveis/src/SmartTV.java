public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
    public void mudarCanal (int novoCanal){
        canal=novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para "+volume);
        //volume = volume + 1;
    }
    public void diminuirVolume(){
        //volume = -1;
        volume--;
        System.out.println("Diminuindo volume para "+volume);
    }

}
