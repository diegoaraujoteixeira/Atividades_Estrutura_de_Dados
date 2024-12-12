
public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();
        int numeroTeste = 10;
        for(int i = 1 ; i <= numeroTeste; i++){
            pilha.push(new Numero(Iccanobif(i)));
        }
        while (!pilha.taVazio()) {
            System.out.print(pilha.pop().num + " | ");
        }

    }
    public static int Iccanobif(int x){
        if(x == 1 || x == 0)
            return x;
        
        int num1 = 0;
        int num2 = 1;
        int resultado = 0;

        for (int i = 2; i <= x; i++) {
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;
        }
        
        return resultado;
    }

}
