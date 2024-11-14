import java.util.Random;

public class Ex02 {
    static int uPosicao = -1;
    static int[] vet = new int[100];
    static int uInteracao = 0;
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int opcao = r.nextInt(3) + 1;
            if (opcao == 1) {
                inserirInicio();
            }
            else if (opcao == 2) {
                inserirFinal();
            }
            else {
                inserirMeio();
            }
        }
        for (int n : vet) {
            System.out.print(n + " ");
        }
    }

    public static int gerarNumero() {
        Random r = new Random();
        return r.nextInt(10) + 1;
    }

    public static void inserirInicio() {
        if (uPosicao != -1) {
            for (int j = uPosicao + 1; j > 0; --j) {
                vet[j] = vet[j - 1];
            }
        }
        vet[0] = gerarNumero();
        uPosicao++;
        uInteracao = 0;
        System.out.println(vet[0]+" Inserido no inicio");
    }

    public static void inserirFinal() {
        uPosicao++;
        vet[uPosicao] = gerarNumero();
        uInteracao = uPosicao;
        System.out.println(vet[uPosicao ]+" Inserido no final");
    }

    public static void inserirMeio() {
        if (uInteracao == 0) {
            inserirInicio();
        } else {
           for (int i = uPosicao + 1; i > uInteracao ; --i) {
                vet[i] = vet[i -1];
           }
           vet[uInteracao] = gerarNumero();
           uPosicao++;
           System.out.println(vet[uInteracao]+" Inserido no meio");
        }
    }
}
