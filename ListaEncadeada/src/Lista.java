public class Lista {
    private No cabeca = new No(null, null, null);
    private No cauda = new No(null, null, null);

    public int tamanho = 0;

    public void addInicio(Pessoa elemento) throws Exception {
        No laura = new No(elemento, null, null);
        if (tamanho == 0) {
            cabeca.proximo = laura;
            laura.anterior = cabeca;
            cauda.anterior = laura;
        } else {
            laura.anterior = cabeca;
            laura.proximo = cabeca.proximo;
            cabeca.proximo.anterior = laura;
            cabeca.proximo = laura;
        }
        tamanho++;
    }

    public void addFim(Pessoa elemento) throws Exception {
        No filipe = new No(elemento, null, null);
        if (tamanho == 0) {
            addInicio(elemento);
        } else {
            filipe.anterior = cauda.anterior;
            cauda.anterior.proximo = filipe;
            cauda.anterior = filipe;
            tamanho++;
        }
    }

    public void addOrdenado(Pessoa elemento, int posicao) throws Exception {
        if (tamanho == 0) { // se a lista estiver vazia
            addInicio(elemento);
        } else if (posicao > tamanho) {
            addFim(elemento);
        } else {
            No el = new No(elemento, null, null);
            int posicaoA = 0;
            No elementoAtual = cabeca.proximo;
            while (posicao < posicaoA) {
                if(elementoAtual.elemento.cod > elemento.cod){

                    elementoAtual = elementoAtual.proximo;
                    posicaoA++;
                }
            }
            el.proximo = elementoAtual;
            el.anterior = elementoAtual.anterior;
            elementoAtual.anterior.proximo = el;
            elementoAtual.anterior = el;
            tamanho++;
        }

    }

    public void exibirCrescente() throws Exception {
        No el = cabeca.proximo;
        while (el != null && el != cauda) {
            System.out.println("Codigo: " + el.elemento.cod);
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Telefone: " + el.elemento.telefone);
            el = el.proximo;
        }
    }

    public void exibirDecrescente() throws Exception {
        No el = cauda.anterior;
        while (el != null && el != cabeca) {
            System.out.println("Codigo: " + el.elemento.cod);
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Telefone: " + el.elemento.telefone);
            el = el.anterior;
        }
    }

}