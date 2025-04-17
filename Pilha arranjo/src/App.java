import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        int ordem = -1;
        Pilha p = new Pilha();
        Pilha s = new Pilha();
        Pilha resul = new Pilha();
       
        while (true) {
            System.out.println("Quantos Vagoes?");
            quantidade = sc.nextInt();

            if (quantidade == 0)
                break;

            for (int i = quantidade; i > 0; i--) {
                p.push(new Vagao(i));
            }
            while (true) {
                System.out.println("Digite a ordem de saída: ");

                for (int i = 1; i < quantidade + 1; i++) {
                ordem = sc.nextInt();
                    if (ordem == 0)
                    break;

                    s.push(new Vagao(ordem));
                }
                if (ordem == 0)
                    break;

                for (int i = 0; i < quantidade; i++)
                resul.push(s.pop());

                if (p.verificar(resul))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
        sc.close();
    }
}