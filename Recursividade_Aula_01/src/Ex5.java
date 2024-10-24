import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro valor: ");
            int x = sc.nextInt();
    
            System.out.println("Digite o segundo valor: ");
            int y = sc.nextInt();
            
            System.out.println("O MDC entre o valor " + x + " e " + y + " é " + calculomax(x, y));
            sc.close();
    
        } catch (Exception e) {
            System.out.println("Caracter invalido");
        }
    }
    public static int calculomax(int x, int y) throws Exception{
        if(x == 0 || y == 0  ){
            throw new Exception("Algum dos valores é 0");
        }
        else if(x<y){
            return calculomax(y,x);
        }else if(x >= y && x%y == 0){
            return y;
        }
        else{
            return calculomax(y, x%y);
        }
    }
}
