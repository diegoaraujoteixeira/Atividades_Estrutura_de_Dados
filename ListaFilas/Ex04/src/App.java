import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaArranjo fila = new FilaArranjo();
        int senhasDisponiveis = 50;
        int idAtual = 1; 

        while (true) {
            System.out.println("\nSenhas disponíveis: " + senhasDisponiveis);
            System.out.println("Operações:");
            System.out.println("1. Solicitar Senha");
            System.out.println("2. Chamar Atendimento");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int controle = 0;
            try {
                controle = sc.nextInt();
                sc.nextLine(); 

                switch (controle) {
                    case 1:
                        if (senhasDisponiveis > 0) {
                            System.out.print("Digite o seu nome: ");
                            String nome = sc.nextLine();
                            try {
                                Senhas novaSenha = new Senhas(nome, idAtual++);
                                fila.adicionar(novaSenha);
                                senhasDisponiveis--;
                                System.out.println("Senha gerada com sucesso para " + nome + ".");
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        } else {
                            System.out.println("Todas as senhas já foram distribuídas.");
                        }
                        break;

                    case 2:
                        try {
                            Senhas proximaSenha = fila.remove();
                            System.out.println("Atendendo senha " + proximaSenha.getId() + " - " + proximaSenha.getNome());
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.println("Encerrando o sistema. Até mais!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Insira apenas números!");
                sc.nextLine(); 
            }
        }
    }
}
