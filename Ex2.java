// Complexidade assintótica utilizada: n:linear 
    public class Ex2 {
        public static void main(String[] args) {
                int[] v = {1,2,3 ,4 ,5, 6, 7, -10, -5 , -2, 10, 9, 100};
                int[] resultado = vet(v);
                System.out.println("O maior número é: " + resultado[0]);
                System.out.println("O segundo maior número é: " + resultado[1]);
                System.out.println("O terceiro maior número é: " + resultado[2]);
    }
        public static int[] vet(int[] v){
            int x = v[0];
            int y = v[0];
            int z = v[0];
            for (int i = 0; i < v.length; i++) {
                if (v[i] > x) {
                    z=y;
                    y=x;
                    x = v[i];
                }else if(v[i] > y && v[i] != x) {
                    z=y;
                    y = v[i];
                }else if (v[i] > z && v[i] != y && v[i] != x){
                    z = v[i];
                }
            }
            return new int[] { x, y, z };
        }
    }
