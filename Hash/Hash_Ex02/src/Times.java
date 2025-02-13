public class Times {
    String codigo;
    String nome;
    int anoFundacao;
    String presidente;
    String tecnico;
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    public String getPresidente() {
        return presidente;
    }
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public String getTecnico() {
        return tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    public Times(String codigo, String nome, int anoFundacao, String presidente, String tecnico) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.presidente = presidente;
        this.tecnico = tecnico;
    }
}
