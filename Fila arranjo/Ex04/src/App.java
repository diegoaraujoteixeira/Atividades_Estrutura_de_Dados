import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();
        int id = -1;

        while (true) {
            System.out.println("Operações:");
            System.out.println("1. Incluir Processo");
            System.out.println("2. Retirar da fila o processo com o maior tempo de espera");
            System.out.println("3. Imprimir o conteúdo da fila de processos");
            System.out.println("4. Localizar um determinado processo na fila");
            System.out.println("5. Excluir todos os processos da fila");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int controle = 0;

            try {
                controle = sc.nextInt();
                sc.nextLine(); 

                switch (controle) {
                    case 1:
                        System.out.println("Qual o nome do Processo?");
                        String nome = sc.nextLine();
                        id++;
                        System.out.println("ID do Processo " + id);
                        try {
                            fila.adicionar(new Processo(nome, id));
                            System.out.println("Processo adicionado");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            Processo removido = fila.remover();
                            System.out.println("Processo removido: " + removido.getNome() + " (ID: " + removido.getId() + ")");
                        } catch (Exception e) {
                            System.out.println("Erro ao remover processo: " + e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            System.out.println("\n=== Fila de Processos ===");
                            Processo[] vet = fila.imprimir();

                            for (int i = 0; i < vet.length; i++) {
                                System.out.println("Processo: " + vet[i].getNome() + ". Id: " + vet[i].getId() + ".");
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao imprimir fila: " + e.getMessage());
                        }
                        break;

                    case 4:
                        System.out.print("Digite o ID do processo para localizar: ");
                        try {
                            int buscaId = sc.nextInt();
                            sc.nextLine(); 
                            String resultado = fila.localizar(buscaId);
                            System.out.println("Resultado da busca: " + resultado);
                        } catch (Exception e) {
                            System.out.println("Erro ao localizar processo: " + e.getMessage());
                            sc.nextLine(); 
                        }
                        break;

                    case 5:
                        try {
                            fila.removerTodos();
                            System.out.println("Todos os processos foram removidos com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao remover todos os processos: " + e.getMessage());
                        }
                        break;

                    case 6:
                        System.out.println("Encerrando o sistema. Até mais!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro na entrada de dados: " + e.getMessage());
                sc.nextLine(); 
            }
        }
    }
}
