import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int y = sc.nextInt();
        System.out.println("A multiplicao de: " + x + " e " + y + " é igual a " + mult(x, y));
       sc.close();
    }
    public static int mult(int x, int y) {
        if(y == 0){
            return 0;
        }else{
            return x + mult(x, y-1);
        }
    }
}
