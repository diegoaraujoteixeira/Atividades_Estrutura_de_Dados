import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if(primo(num,2)){
            System.out.println(num + " é primo");
        }
        else{
            System.out.println(num + " não é primo");

        }
        sc.close();
    }
    public static boolean primo(int x, int div){
        if(x < 2){
            return false;
        }
        if(x % div == 0){
            return false;
        }
        if(div * div > x){
            return true;
        }
        return primo(x, div + 1);
    }
}
