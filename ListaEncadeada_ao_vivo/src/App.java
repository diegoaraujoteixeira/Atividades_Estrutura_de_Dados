import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Cidade");
            System.out.println("2. Exibir Cidades");
            System.out.println("3. Excluir Cidades");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Digite o nome da cidade: ");
                        String cidade = scanner.nextLine();

                        System.out.print("Digite o nome do país: ");
                        String pais = scanner.nextLine();

                        System.out.print("O que mais te atraiu? ");
                        String atrativos = scanner.nextLine();

                        int nota = -1;
                        while (nota < 0 || nota > 10) {
                            try {
                                System.out.print("Dê uma nota para essa cidade (0 a 10): ");
                                nota = scanner.nextInt();
                                scanner.nextLine();

                                if (nota < 0 || nota > 10) {
                                    System.out.println("Nota inválida! Digite um número entre 0 e 10.");
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida! Digite apenas números.");
                                scanner.nextLine(); 
                            }
                        }

                        Cidade novaCidade = new Cidade(cidade, pais, atrativos, nota);
                        lista.add(novaCidade);
                        System.out.println("Cidade adicionada com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar cidade: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        if (lista.tamanho == 0) {
                            System.out.println("Não há cidades cadastradas.");
                            break;
                        }
                        int posicao = 0;
                        while (true) {
                            Cidade cidade = lista.exibir(posicao);

                            System.out.println("Cidade: " + cidade.cidade);
                            System.out.println("País: " + cidade.pais);
                            System.out.println("Atrativos: " + cidade.atrativo);
                            System.out.println("Nota: " + cidade.nota + "\n");

                            System.out.println("1. Próxima");
                            System.out.println("2. Anterior");
                            System.out.println("3. Voltar ao menu principal");
                            System.out.print("Escolha uma opção: ");

                            int navegacao = scanner.nextInt();
                            scanner.nextLine();

                            if (navegacao == 1) {
                                if (posicao < lista.tamanho - 1) {
                                    posicao++;
                                } else {
                                    System.out.println("Você está na última cidade.");
                                }
                            } else if (navegacao == 2) {
                                if (posicao > 0) {
                                    posicao--;
                                } else {
                                    System.out.println("Você está na primeira cidade.");
                                }
                            } else if (navegacao == 3) {
                                break;
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao exibir cidades: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Digite o nome da cidade que quer remover: ");
                        String cidade = scanner.nextLine();

                        System.out.print("Digite o nome do país: ");
                        String pais = scanner.nextLine();

                        if (lista.remover(cidade, pais)) {
                            System.out.println("Cidade " + cidade + " e país " + pais + " foram removidos.");
                        } else {
                            System.out.println("Cidade ou país especificados não encontrados.");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao remover cidade: " + e.getMessage());
                    }
                    break;

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
