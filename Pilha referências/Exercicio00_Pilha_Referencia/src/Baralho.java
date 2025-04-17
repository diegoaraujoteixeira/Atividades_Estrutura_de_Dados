import java.util.Random;

public class Baralho {
    int carta;
    Baralho proximo;
    public Baralho(){
        Random r = new Random();
        this.carta = r.nextInt(10)+1;
        this.proximo = null;
    }
}
