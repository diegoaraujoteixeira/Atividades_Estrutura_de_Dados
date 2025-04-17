public class FilaArranjo {
    static final int maximo = 50;
    int fim = 0;
    int incio = 0;
    int tamanho = 0;

    Senhas vetor[] = new Senhas[maximo];
    public void adicionar(Senhas senha)throws Exception{
        if(taCheio())
            throw new Exception("Acabou as senhas");
        
        vetor[fim] = senha;
        
        fim++;

        if(fim == maximo)
            fim = 0;
        
        tamanho++;
    }

    public Senhas remove() throws Exception {
        if (taVazio()) {
            throw new Exception("A fila está vazia. Nenhuma senha para atender.");
        }
        Senhas r = vetor[incio];
        vetor[incio] = null; 
        incio++;
        if (incio == maximo) {
            incio = 0;
        }
        tamanho--;
        return r;
    }
    
    public boolean taCheio(){
        return tamanho == maximo;
    }
    public boolean taVazio(){
        return tamanho == 0;
    }
}
