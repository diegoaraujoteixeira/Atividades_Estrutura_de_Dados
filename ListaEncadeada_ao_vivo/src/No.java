public class No {
    public No proximo;
    public Cidade elemento;
    public No anterior;
    public No (Cidade elemento, No proximo, No anterior){
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    public No(){
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }
}
