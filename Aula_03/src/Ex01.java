public class Ex01 {
    public static void main(String[] args) {
        int[] vetorNormal = vetAleatorio();
        System.out.print("Esses são os números: ");
        for (int i = 0; i < vetorNormal.length; i++) {
            System.out.print(vetorNormal[i] + " ");
        }

        System.out.print("\nEsses são os números ímpares: ");
        impares(vetorNormal);
    }

    public static int[] vetAleatorio() {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
        }
        return v;
    }

    public static void impares(int[] vetorNormal) {
        for (int i = 0; i < vetorNormal.length; i++) {
            if (vetorNormal[i] % 2 != 0) {
                System.out.print(vetorNormal[i] + " ");
            }
        }
    }
}
