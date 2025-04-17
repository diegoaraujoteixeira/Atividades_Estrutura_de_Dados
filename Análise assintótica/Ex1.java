// Complexidade assintótica utilizada: n: linear 
public class Ex1 {
    public static void main(String[] args) {
            int[] v = {1,2,3 ,4 ,5, 6, 7, -10, -5 , -2, 10, 9, 100, 100};
            int[] resultado = vet(v);
            System.out.println("O maior número é: " + resultado[1]);
            System.out.println("O menor número é: " + resultado[0]);
    }

    public static int[] vet(int[] v) {
        int menor = v[0];
        int maior = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < maior) {
                maior = v[i];
            } else {
                menor = v[i];
            }
        }
        return new int[] { maior, menor };
    }
}
