import java.util.Scanner;

public class Ex1Fatorial {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
            try{
                System.out.println("Digite um numero:");
                int num = sc.nextInt();
                if(num > 0){
                    int resultado = fatorial(num);
                    System.out.println("O fatorial de " + num + " é " + resultado);
                    sc.close();
                }else{
                    System.out.println("Digite um numero positivo");

                }
            }catch(Exception ex){
                System.out.println("Digite um numero");
            }
}
 

public static int fatorial(int num) throws Exception{
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
