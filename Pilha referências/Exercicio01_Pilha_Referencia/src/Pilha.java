public class Pilha {
    int tamanho = 0;
    Numero topo;

    public boolean taVazio(){
        return tamanho==0;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void push(Numero b){
        if(tamanho!=0)
            b.proximo = topo;
        topo = b;
        ++tamanho;
    }
    public Numero pop() throws Exception{
        if(tamanho==0)
            throw new Exception("Pilha vazia");
        Numero b = topo;
        topo = topo.proximo;
        --tamanho;
        return b;
    }
}