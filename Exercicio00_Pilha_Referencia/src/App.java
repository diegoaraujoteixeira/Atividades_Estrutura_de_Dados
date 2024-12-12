import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pilha deckJogador1 = new Pilha();
        Pilha deckJogador2 = new Pilha();
        int pontosJogador1 = 0;
        int pontosJogador2 = 0;

        System.out.println("Essas são suas cartas jogador 1: ");
        Baralho c1 = new Baralho();
        pontosJogador1 += c1.carta;
        deckJogador1.push(c1);
        System.out.println("A primeira carta é: " + c1.carta);

        Baralho c2 = new Baralho();
        pontosJogador1 += c2.carta;
        deckJogador1.push(c2);
        System.out.println("A segunda carta é: " + c2.carta);

        System.out.println("A soma das cartas é: " + pontosJogador1);

        boolean turnoJogador1 = true;
        while (turnoJogador1) {
            System.out.println("Jogador 1, o que deseja fazer?");
            System.out.println("1 - Comprar mais uma carta");
            System.out.println("2 - Passar a jogada para o jogador 2");
            int repostaJogador1 = -1;
            while (true) {
                try {
                    if (sc.hasNextInt()) {
                        repostaJogador1 = sc.nextInt();
                        break; 
                    } else {
                        System.out.println("Entrada inválida! Digite um número (1 ou 2):");
                        sc.next(); 
                    }
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro. Tente novamente.");
                    sc.next(); 
                }
            }
            if (repostaJogador1 == 1) {
                Baralho cartaBaralho = new Baralho();
                System.out.println("A nova carta é: " + cartaBaralho.carta);
                pontosJogador1 += cartaBaralho.carta;
                deckJogador1.push(cartaBaralho);

                if (pontosJogador1 > 21) {
                    System.out.println("Você estourou a mão! Pontos antes da penalidade: " + pontosJogador1);
                    pontosJogador1 -= cartaBaralho.carta;
                    System.out.println("Vou retirar a última carta que é: " + cartaBaralho.carta);
                    deckJogador1.pop();
                    pontosJogador1 -= 5; 
                    System.out.println("Sua pontuação após a penalidade é: " + pontosJogador1);
                    turnoJogador1 = false;
                }
            } else if (repostaJogador1 == 2) {
                System.out.println("Jogador 1 encerrou o turno.");
                turnoJogador1 = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Essas são suas cartas jogador 2: ");
        Baralho c3 = new Baralho();
        pontosJogador2 += c3.carta;
        deckJogador2.push(c3);
        System.out.println("A primeira carta é: " + c3.carta);

        Baralho c4 = new Baralho();
        pontosJogador2 += c4.carta;
        deckJogador2.push(c4);
        System.out.println("A segunda carta é: " + c4.carta);

        System.out.println("A soma das cartas é: " + pontosJogador2);

        boolean turnoJogador2 = true;
        while (turnoJogador2) {
            System.out.println("Jogador 2, o que deseja fazer?");
            System.out.println("1 - Comprar mais uma carta");
            System.out.println("2 - Encerrar turno");
            int repostaJogador2 = -1;
            while (true) {
                try {
                    if (sc.hasNextInt()) {
                        repostaJogador2 = sc.nextInt();
                        break; 
                    } else {
                        System.out.println("Entrada inválida! Digite um número (1 ou 2):");
                        sc.next();
                    }
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro. Tente novamente.");
                    sc.next(); 
                }
            }

            if (repostaJogador2 == 1) {
                Baralho cartaBaralho = new Baralho();
                System.out.println("A nova carta é: " + cartaBaralho.carta);
                pontosJogador2 += cartaBaralho.carta;
                deckJogador2.push(cartaBaralho);

                if (pontosJogador2 > 21) {
                    System.out.println("Você estourou a mão! Pontos antes da penalidade: " + pontosJogador2);
                    pontosJogador2 -= cartaBaralho.carta;
                    System.out.println("Vou retirar a última carta que é: " + cartaBaralho.carta);
                    deckJogador2.pop();
                    pontosJogador2 -= 5; 
                    System.out.println("Sua pontuação após a penalidade é: " + pontosJogador2);
                    turnoJogador2 = false; 
                }
            } else if (repostaJogador2 == 2) {
                System.out.println("Jogador 2 encerrou o turno.");
                turnoJogador2 = false; 
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Pontuação final:");
        System.out.println("Jogador 1: " + pontosJogador1);
        System.out.println("Jogador 2: " + pontosJogador2);

        if (pontosJogador1 > pontosJogador2) {
            System.out.println("Jogador 1 venceu!");
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("Jogador 2 venceu!");
        } else {
            System.out.println("Empate!");
        }

        sc.close();
    }
}
