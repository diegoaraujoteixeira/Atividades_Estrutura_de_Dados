public class No {
    public No proximo;
    public Pessoa elemento;
    public No anterior;
    public No (Pessoa elemento, No proximo, No anterior){
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = proximo;
    }
    public No(){
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }
}
