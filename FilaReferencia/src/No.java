public class No {
    No proximo;
    String nome;
    Pessoa elemento;
    
    public No( Pessoa elemento,No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    public No(){
        this.elemento = null;
        this.proximo = null;
    }
    public No( String nome,No proximo) {
        this.nome = nome;
        this.proximo = proximo;
    }
}
