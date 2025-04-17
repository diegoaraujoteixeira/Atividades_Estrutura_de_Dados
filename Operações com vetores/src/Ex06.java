public class Ex06 {
    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 9}; 
        int[] y = {2, 4, 6, 8, 10};

        int[] resultado = criaVetor(x, y);

        System.out.print("Vetor resultante: ");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }

    public static int[] criaVetor(int[] x, int[] y) {
        int[] z = new int[x.length];
        int indc1 = 0;
        int indc2 = 0;

        for (int i = 0; i < z.length; i++) {
            int numeroAleatorio = (int) (Math.random() * 100); 
            if (numeroAleatorio % 2 == 0) {
                z[i] = x[indc1];
                indc1++;
            } else {
                z[i] = y[indc2];
                indc2++;
            }
        }
        return z;
    }
}
