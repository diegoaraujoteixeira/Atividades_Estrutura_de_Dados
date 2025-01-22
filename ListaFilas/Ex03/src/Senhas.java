public class Senhas {
    String nome;
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Senhas( String nome,int id) {
        this.id = id;
        this.nome = nome;
    }

}
