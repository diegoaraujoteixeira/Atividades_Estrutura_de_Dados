public class Lista {
    public No cabeca = new No(null, null,null);
    public No cauda = new No(null,null,null);
    public int tamanho = 0;

    
    public void addInicio(Cidade elemento) {
        No novo = new No(elemento, null, null);
        if (tamanho == 0) {
            cabeca.proximo = novo;
            cauda.anterior = novo;
            novo.proximo = cauda; 
            novo.anterior = cabeca; 
        } else {
            novo.proximo = cabeca.proximo;
            cabeca.proximo.anterior = novo;
            cabeca.proximo = novo;
            novo.anterior = cabeca;
        }
    
        tamanho++;
    }
    
    public void addFim(Cidade elemento) {
        No novo = new No(elemento, null, null);
    
        if (tamanho == 0) {
            addInicio(elemento);
        } else {
            novo.anterior = cauda.anterior;
            cauda.anterior.proximo = novo;
            cauda.anterior = novo;
            novo.proximo = cauda; 
        }
    
        tamanho++;
    }
    

    public void add(Cidade elemento) {
        if (tamanho == 0) {
            addInicio(elemento);
        } else if (elemento.nota > cabeca.proximo.elemento.nota) {
            addInicio(elemento);
        } else if (elemento.nota <= cauda.anterior.elemento.nota) {
            addFim(elemento);
        } else {
            No atual = cabeca.proximo;
            while (atual != cauda && atual.elemento.nota >= elemento.nota) {
                atual = atual.proximo;
            }
    
            No novo = new No(elemento, atual, atual.anterior);
            atual.anterior.proximo = novo;
            atual.anterior = novo;
            tamanho++;
        }
    }
    
    public boolean remover(String cidade, String pais){
        No atual = cabeca;
        while (atual.proximo != null) {
            if(atual.proximo.elemento.cidade.equals(cidade) && atual.proximo.elemento.pais.equals(pais)){
                atual.proximo = atual.proximo.proximo;
                tamanho--;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    public Cidade exibir(int posicao) throws Exception{
        if(tamanho == 0){
            throw new Exception("Não há cidades cadastradas.");
        }
        if(posicao < 0 || posicao >=tamanho){
            throw new Exception("Posição inválida");
        }
        No atual = cabeca.proximo;
        for(int i = 0; i<posicao;i++){
            atual=atual.proximo;
        }
        return atual.elemento;
    }
}
