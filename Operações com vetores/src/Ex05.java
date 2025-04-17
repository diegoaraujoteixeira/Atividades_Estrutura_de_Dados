public class Ex05 {
    public static void main(String[] args) {
        int[] v = { 100, 25, 78, 5, 201, 3, 1024 };
        System.out.print("Esses são os valores: \n");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\nEsses são os valores ordenados: ");
        vetorOrdenado(v);
    }

    public static void vetorOrdenado(int[] v) {
        int min = v[0];
        int max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < min)
                min = v[i];

            if (v[i] > max)
                max = v[i];
        }
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[j] == i) {
                    System.out.print(i + " ");
                    break;
                }

            }
        }
    }
}
