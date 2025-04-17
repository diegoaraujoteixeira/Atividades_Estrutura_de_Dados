import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Fila oeste = new Fila();
        Fila norte = new Fila();
        Fila sul = new Fila();
        Fila leste = new Fila();

        String auxiliar = "x";
        while (true) {
            String reposta = sc.nextLine();
            if (reposta.equals("0")) {
                organizar(oeste, sul, norte, leste);
                break;
            }
            switch (reposta) {
                case "-1":
                    auxiliar = "-1";
                    continue;
                    
                case "-2":
                    auxiliar = "-2";

                    continue;
                case "-3":
                    auxiliar = "-3";

                    continue;
                case "-4":
                    auxiliar = "-4";

                    continue;
            }
            if (auxiliar.equals("-1")) {
                oeste.enfileirar(reposta);
            }
            if (auxiliar.equals("-2")) {
                sul.enfileirar(reposta);
            }
            if (auxiliar.equals("-3")) {
                norte.enfileirar(reposta);
            }
            if (auxiliar.equals("-4")) {
                leste.enfileirar(reposta);
            }
        }
        sc.close();
    }

    public static void organizar(Fila oeste, Fila sul, Fila norte, Fila leste) throws Exception {
        Fila fila = new Fila();
        while (!oeste.isEmpty() || !sul.isEmpty() || !norte.isEmpty() || !leste.isEmpty()) {
            if (!oeste.isEmpty())
                fila.enfileirar(oeste.desenfileirar());
            if (!norte.isEmpty())
                fila.enfileirar(norte.desenfileirar());
            if (!sul.isEmpty())
                fila.enfileirar(sul.desenfileirar());
            if (!leste.isEmpty())
                fila.enfileirar(leste.desenfileirar());
        }
        while (!fila.isEmpty()) {
            if(fila.tam > 1){

                System.out.print(fila.desenfileirar() + " ");
            }else{
                System.out.println(fila.desenfileirar());

            }
        }
    }
}
