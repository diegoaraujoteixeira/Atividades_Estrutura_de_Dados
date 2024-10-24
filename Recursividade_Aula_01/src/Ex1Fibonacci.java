import java.util.Scanner;

public class Ex1Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite um numero:");
            int x = sc.nextInt();

            System.out.print("A sequencia de " + x + " é: ");
            for (int i = 0; i < x; i++) {
                System.out.print(fibo(i) + ", ");
            }
           
        sc.close();
        }catch(Exception ex){
            System.out.println("Caracter invalido");
        }
            
    }
    public static long fibo(long x) throws Exception {
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
