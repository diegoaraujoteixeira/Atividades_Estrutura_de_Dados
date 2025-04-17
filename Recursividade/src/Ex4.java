import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       try {
        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int y = sc.nextInt();
        System.out.println("A multiplicao de: " + x + " e " + y + " é igual a " + mult(x, y));
       sc.close();
       } catch (Exception e) {
        System.out.println("Caracter invalido");
    }
        
    }
    public static int mult(int x, int y) throws Exception{
        if(y == 0){
            return 0;
        }else{
            return x + mult(x, y-1);
        }
    }
}
