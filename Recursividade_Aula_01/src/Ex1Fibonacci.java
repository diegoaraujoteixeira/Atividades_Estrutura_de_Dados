import java.util.Scanner;

public class Ex1Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero:");
            int x = sc.nextInt();
    
            long resultado1 = fibo(x);
            System.out.println("O fibo de " + x + " e " + resultado1);
           
        sc.close();
    }

    public static long fibo(long x) {
        int num1 = 0, num2 = 1, result = 0;

        if (x == 0 || x == 1){
            return x;
        }else{
            for (int i = 2; i <= x; i++) {
                result = num1 + num2;
                num1 = num2;
                num2 = result;
            }
            return num2;
        }
    }
}
  