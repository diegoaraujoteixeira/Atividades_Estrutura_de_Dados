import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Numero> deque = new Deque<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco IF");
        int opc = 0;
        try {
            while (true) {
                System.out.print(" 1.Para financiar\n 2.Pagar a parcela atual\n 3.Pagar a ultima parcela \n 0.Para sair");
                if (!sc.hasNextInt()) {
                    System.out.println("Entrada inválida! Digite um número válido.");
                    sc.next();
                    continue;
                }
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        double valor;
                        double numParcelas;
                        while (true) {
                            System.out.print("Digite o valor que deseja financiar: ");
                            if (sc.hasNextDouble()) {
                                valor = sc.nextDouble();
                                if (valor > 0)
                                    break;
                            }
                            System.out.println("Valor inválido! Digite um número positivo.");
                            sc.next(); 
                        }

                       
                        while (true) {
                            System.out.print("Agora digite o número de parcelas: ");
                            if (sc.hasNextInt()) {
                                numParcelas = sc.nextInt();
                                if (numParcelas > 0)
                                    break;
                            }
                            System.out.println("Número de parcelas inválido! Digite um número inteiro positivo.");
                            sc.next(); 
                        }

                        double parcelaBase = valor / numParcelas;

                        for (int i = 1; i <= numParcelas; i++) {
                            double juros = (parcelaBase * 0.01) * i;
                            double valorFinal = parcelaBase + juros;
                            deque.addLast(new Numero(valorFinal, juros));
                        }

                        System.out.println("\nParcelas calculadas:");
                        deque.print();
                        break;
                    case 2:
                        if (!deque.isEmpty()) {
                            try {
                                System.out.println("Você pagou a parcela de: " + deque.removeFirst().getValorP());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            System.out.println("Nenhuma parcela para pagar.");
                        }
                        break;
                    case 3:
                        if (!deque.isEmpty()) {
                            try {
                                if (deque.size() == 1) {
                                    System.out.println(
                                            "Você pagou a última parcela de:  " + deque.getFirst().getValorP());
                                    deque.removeFirst();
                                } else {
                                    double desconto = deque.getLast().getJuros();
                                    System.out.println("Você pagou a última parcela com desconto de juros:  " + (deque.getLast().getValorP() - desconto));
                                    deque.removeLast();
                                }
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            System.out.println("Nenhuma parcela para pagar.");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo");
                        sc.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}