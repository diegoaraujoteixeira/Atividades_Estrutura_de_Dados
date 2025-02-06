public class Numero {
    private double valorP;
    private double juros;
    
    public Numero(double valorP, double juros) {
        this.valorP = valorP;
        this.juros = juros;
    }
    public double getValorP() {
        return valorP;
    }


    public void setValorP(double valorP) {
        this.valorP = valorP;
    }


    public double getJuros() {
        return juros;
    }


    public void setJuros(double juros) {
        this.juros = juros;
    }


    @Override
    public String toString(){
        return Double.toString(valorP);
    }
}
