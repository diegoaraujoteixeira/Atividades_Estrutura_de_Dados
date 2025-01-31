public class App {
    public static void main(String[] args) throws Exception {
        Deque<Numero> deque = new Deque<>();

        try {
            for(int i = 0; i < 10; i++){
                if(Math.random()>0.5){
                    System.out.printf("addInicio(%d)\n", i);
                    deque.addFirst(new Numero(i));
                }else{
                    System.out.printf("addFinal(%d)\n", i);
                    deque.addLast(new Numero(i));
                }
            }

            System.out.println("Deque atual:");
            deque.print();

            for(int i = 0; i < 5; i++){
                if(Math.random()>0.5){
                    System.out.printf("removeInicio(): %d \n", deque.removeFirst().getNum());
                }else{
                    System.out.printf("removeFinal(): %d \n", deque.removeLast().getNum());
                }
            }

            System.out.println("Deque atual: ");
            deque.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}