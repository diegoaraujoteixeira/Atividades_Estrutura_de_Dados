public class Fila {
    static int maximo = 1000;
    int tamanho = 0;
    int inicio = 0;
    int fim = 0;

    Processo vetor[] = new Processo[maximo];

    public void adicionar(Processo p) throws Exception {
        if (taCheio()) {
            throw new Exception("Fila está cheia");
        }
        vetor[fim] = p;
        fim = (fim + 1) % maximo; 
        tamanho++;
    }
    

    public Processo remover() throws Exception {
        if (taVazio()) {
            throw new Exception("Fila vazia");
        }
        Processo p = vetor[inicio];
        vetor[inicio] = null; 
        inicio = (inicio + 1) % maximo; 
        tamanho--;
        return p;
    }
    

    public Processo[] imprimir() throws Exception {
        if (taVazio()) {
            throw new Exception("Fila vazia");
        }
    
        Processo[] retorno = new Processo[tamanho];
        int controle = 0;
    
        for (int i = inicio; controle < tamanho; i = (i + 1) % maximo) {
            if (vetor[i] != null) {
                retorno[controle] = vetor[i];
                controle++;
            } else {
                System.out.println("Acesso a índice " + i + " resultou em valor nulo!");
            }
        }
    
        return retorno;
    }
    
    

    public String localizar(int id) throws Exception {
        if (taVazio()) {
            throw new Exception("Ta vazio");
        }
        for (int i = inicio; i != fim; i++) {
            if (vetor[i].getId() == id) {
                return ("Nome: " + vetor[i].getNome() + "|" + "ID: " + vetor[i].getId());
            }
        }
        return ("Não encontrado");
    }

    public void removerTodos() throws Exception {
        if (taVazio()) {
            throw new Exception("Ta vazio");
        }
        tamanho = 0;
        inicio = 0;
        fim = 0;
    }

    public boolean taCheio() {
        return tamanho == maximo;
    }

    public boolean taVazio() {
        return tamanho == 0;
    }
}
