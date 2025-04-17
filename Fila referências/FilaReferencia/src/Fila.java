public class Fila {
    No cabeca;
    No cauda;
    int tamanho = 0;

    public void enfileirar(String p) {
        No elemento = new No(p, null);
        if (tamanho != 0) {
            cauda.proximo = elemento;
        } else {
            cabeca = elemento;
        }
        cauda = elemento;
        tamanho++;
    }


    public String desenfileirar() throws Exception {
        if (taVazio())
            throw new Exception("Fila vazia");
        String elemento = cabeca.nome;
        cabeca = cabeca.proximo;
        tamanho--;
        return elemento;
    }

    public void enfileirarQ(Pessoa p) {
        No elemento = new No(p, null);
        if (tamanho != 0) {
            cauda.proximo = elemento;
        } else {
            cabeca = elemento;
        }
        cauda = elemento;
        tamanho++;
    }


    public Pessoa desenfileirarQ() throws Exception {
        if (taVazio())
            throw new Exception("Fila vazia");
        Pessoa elemento = cabeca.elemento;
        cabeca = cabeca.proximo;
        tamanho--;
        return elemento;
    }

    public boolean taVazio() {
        return tamanho == 0;
    }
}
