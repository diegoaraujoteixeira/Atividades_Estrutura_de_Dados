// Complexidade assintótica utilizada: O(logn)
public class Ex3 {
    public static void main(String[] args) {
        int c = 0;
        
        int [] v = {1, 20, 33, 48, 57, 64, 75, 86, 94, 101, 112};
        int f = v.length -1;
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        boolean a = vet(v, 1, c, f);
        if (a) {
            System.out.println("o numero ta ai");
        }else{
            System.out.println("nao tem o numero");
        }
    }

    public static boolean vet(int[]v , int x,  int comeco, int finaal){
        if(comeco > finaal){
            return false;
        }
        int m = (comeco + finaal) / 2;
        if(v[m] == x){
           return true;
        }
        else if(v[m] > x){
            return  vet(v, x, comeco, m -1);

        }
        else{
            return vet(v, x, m + 1, finaal);

        }
    }
}
