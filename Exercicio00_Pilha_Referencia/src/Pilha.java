public class Pilha {
    int tamanho = 0;
    Baralho topo;

    public boolean taVazio(){
        return tamanho==0;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void push(Baralho b){
        if(tamanho!=0)
            b.proximo = topo;
        topo = b;
        ++tamanho;
    }
    public Baralho pop() throws Exception{
        if(tamanho==0)
            throw new Exception("Pilha vazia");
        Baralho b = topo;
        topo = topo.proximo;
        --tamanho;
        return b;
    }
}
