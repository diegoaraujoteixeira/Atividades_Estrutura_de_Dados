// Complexidade assintótica utilizada: O(logn)
public class Ex3 {
    public static void main(String[] args) {
        int c = 0;
        
        int [] v = {1, 20, 33, 48, 57, 64, 75, 86, 94, 101, 112};
        int f = v.length -1;
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        boolean a = vet(v, 101, f, c);
        if (a) {
            System.out.println("Tem o numero");
        }else{
            System.out.println("nao tem o numero");

        }
    }
    public static boolean vet(int[]v , int x,  int f, int c){
        if(c > f){
            return false;
        }
        int m = (c + f) / 2;
        if(v[m] == x){
           return true;
        }
        else if(v[m] > x){
           return vet(v, x, m + 1, f);
        }
        else{
           return  vet(v, x, c, m -1);
        }
    }
}
