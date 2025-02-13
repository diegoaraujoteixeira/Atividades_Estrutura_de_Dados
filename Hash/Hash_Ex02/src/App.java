import java.sql.Time;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Hash ht = new Hash();
        String opc;
        boolean taLa = true;
        while (taLa) {
            System.out.println("1.Para adicionar um time");
            System.out.println("2.Para remover um time");
            System.out.println("3.Para ver os times");
            System.out.println("4.Para sair");
            if(!sc.hasNextInt()){
                System.out.println("Digite um numero");
                sc.next();
                continue;
            }
           opc = sc.nextLine();
           switch (opc) {
            case  "1":
                System.out.println("Digite o codigo do time: ");
                String codigo = sc.nextLine();

                System.out.println("Digite o nome do time: ");
                String nomeTime = sc.nextLine();

                System.out.println("Digite o ano da fundação do time: ");
                int anoFundacao = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome do presidente time: ");
                String nomePresidente = sc.nextLine();

                System.out.println("Digite o nome do tecnico do time: ");
                String nomeTec = sc.nextLine();
                Times time = new Times(codigo, nomeTime, anoFundacao, nomePresidente, nomeTec);
                ht.put(time);
                System.out.println("O " + nomeTime + " foi criado com sucesso");
                break;
           
            case "2":
                try {
                System.out.println("Digite o codigo do time para excluir: ");
                String codigoExcluir = sc.nextLine();
                Times timeRemove = ht.remove(codigoExcluir);
                System.out.println("O time: " + timeRemove.getNome() + " foi excluido");
                
                } catch (Exception e) {
                    System.out.println("Codigo não encontrado");
                }
                break;
                
            case "3":
                try {
                System.out.println("Digite o codigo do time que quer consultar");
                String codigoCon = sc.nextLine();
                Times timeCon = ht.get(codigoCon);
                System.out.println("O time selecionado foi:" + timeCon.getNome() + "\n Seu codigo: " + timeCon.getCodigo() +"\n Foi fundado em: " + timeCon.getAnoFundacao() + "\n Seu presidente é: " + timeCon.getPresidente() + "\n Seu tecnico é: " + timeCon.getTecnico());
                } catch (Exception e) {
                    System.out.println( "Codigo não encontrado");
                }
                break;
            case "4":
                System.out.println("Saindo...");
                taLa = false;
                break;
            }
           }

           
    }
}
