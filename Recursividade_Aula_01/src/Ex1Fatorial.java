import java.util.Scanner;

public class Ex1Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero:");
            int num = sc.nextInt();
    
            int resultado = fatorial(num);
            System.out.println("O fatorial de " + num + " é " + resultado);
            
        sc.close();
    }

    public static int fatorial(int num){
        int res = 1;
        
        if((num == 1) || (num == 0)){
            return num;

        }
        else{
            for (int i = 1; i<=num; i++){
                res *= i;
            }
            return res;
        }
    }

}
 

