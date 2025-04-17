import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Fila filaA = new Fila();
        Fila filaB = new Fila();
        Fila filaQ = new Fila();
        String repostaInicial = "1";
        System.out.println("Digite o seu nome e a operação. separe as operações por uma virgula.\n Digite 0 para sair");
        while (!repostaInicial.equals("0")) {
            repostaInicial = sc.nextLine();

            if (repostaInicial.equals("0")) {
                break;
            }
            String[] controleRespostas = repostaInicial.split(",");
            String nome = controleRespostas[0];
            String op = controleRespostas[1].toUpperCase();
            filaQ.enfileirarQ(new Pessoa(nome, op));
        }
        while (!filaQ.taVazio()) {
            Pessoa atual = filaQ.desenfileirarQ();
            if (atual.codigo.equals("A")) {
                filaA.enfileirar(atual.nome);
            } else if (atual.codigo.equals("B")) {
                filaB.enfileirar(atual.nome);
            } else if (atual.codigo.equals("X")) {
                if (filaA.tamanho > filaB.tamanho) {
                    filaB.enfileirar(atual.nome);
                } else if(filaA.tamanho < filaB.tamanho) {
                    filaA.enfileirar(atual.nome);
                } else{
                    continue;
                }
            }
        }
        System.out.println("\nFila A:" );
        while (!filaA.taVazio()) {
            System.out.println(filaA.desenfileirar());
        }
        System.out.println("--------------------");
        System.out.println("Fila B:" );
        while (!filaB.taVazio()) {
            System.out.println(filaB.desenfileirar());
        }

        sc.close();
    }
}
