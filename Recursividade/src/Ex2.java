import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       try {
        System.out.println("Escreva o numero que vai ser a potencia: ");
        int num = sc.nextInt();
        double resultado = potencia(num);
        System.out.println("O fatorial de 2 elevado a " + num + " é " + resultado);
       sc.close();
       } catch (Exception e) {
        System.out.println("Caracter invalido");
    }
        
    }
    public static double potencia(double x)throws Exception{
        if(x == 0){
            return 1;
        }
        else if(x == 1){
            return 2;
        }
        else if( x < 0 ){
            return 1.0 / (2 * potencia(-x -1));
        }
        else{
            return 2 * potencia( x - 1);
        }
    }
}
