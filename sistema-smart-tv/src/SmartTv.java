public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume=25;


    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        // É a mesma coisa de volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    
    public void diminuirVolume(){
        // É a mesma coisa de volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}