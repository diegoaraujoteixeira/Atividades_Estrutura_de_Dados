import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Exibir Clientes em Ordem Crescente");
            System.out.println("3. Exibir Clientes em Ordem Decrescente");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Digite o código do cliente: ");
                        int cod = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o nome do cliente: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite o telefone do cliente: ");
                        int telefone = scanner.nextInt();
                        scanner.nextLine();

                        Pessoa novaPessoa = new Pessoa(cod, nome, telefone);
                        lista.addOrdenado(novaPessoa, cod);
                        System.out.println("Cliente adicionado com sucesso!");
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                case 2:
                    try {
                        System.out.println("\nClientes em Ordem Crescente:");
                        lista.exibirCrescente();
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                case 3:
                    try {
                        System.out.println("\nClientes em Ordem Decrescente:");
                        lista.exibirDecrescente();
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
